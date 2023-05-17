package Datos;

import Dominio.Itinerario;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author kuose
 */
public class ItinerarioDAO<T> extends DAOBase<Itinerario> {

    private MongoDatabase conexion;

    public void recuperaClima() {
        conexion = Conexion.getInstance();
    }

    @Override
    public boolean guardar(Itinerario entidad) {
        MongoCollection<Itinerario> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertOne(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }

    public Itinerario buscarPorNombre(String nombre) {
        Itinerario iti = obtenerColeccion().find(eq("nombre", nombre)).first();
        return iti;
    }

    public boolean actualizarItinerario(Itinerario iti) {
        MongoCollection<Itinerario> coleccion = obtenerColeccion();
        try {
            Bson filtro = eq("_id", iti.getId());
            UpdateResult resultado = coleccion.replaceOne(filtro, iti);
            return resultado.getModifiedCount() > 0; // Verificar si se realizó la actualización
        } catch (MongoException e) {
            return false; // Error al actualizar el itinerario
        }
    }

    @Override
    public Itinerario buscarPorID(ObjectId id) {
        Itinerario itinerario = obtenerColeccion().find(eq("_id", id)).first();
        return itinerario;
    }

    @Override
    public List<Itinerario> buscarTodos() {
        List<Itinerario> itinerario = new ArrayList<>();
        itinerario = obtenerColeccion().find().into(new ArrayList<>());
        return itinerario;
    }

    @Override
    public MongoCollection<Itinerario> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<Itinerario> colleccionItinerarios = db.getCollection("Itinerario", Itinerario.class);
        return colleccionItinerarios;
    }
}
