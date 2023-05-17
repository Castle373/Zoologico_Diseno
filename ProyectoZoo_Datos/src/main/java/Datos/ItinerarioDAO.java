
package Datos;


import Dominio.Itinerario;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
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