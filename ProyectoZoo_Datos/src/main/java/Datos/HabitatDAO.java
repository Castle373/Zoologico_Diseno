package Datos;

import Dominio.Habitat;
import Dominio.HabitatOcupada;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

public class HabitatDAO<T> extends DAOBase<Habitat> {

    private MongoDatabase conexion;

    public void recuperaClima() {
        conexion = Conexion.getInstance();
    }

    @Override
    public boolean guardar(Habitat entidad) {
        MongoCollection<Habitat> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertOne(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }

    public boolean agregarHabitatOcupada(ObjectId id, HabitatOcupada habitat) {
        try {
            MongoCollection<Habitat> coleccionP = obtenerColeccion();
            UpdateResult resultado = coleccionP.updateOne(Filters.eq("_id", id), Updates.addToSet("habitatOcupada", habitat));
            return resultado.getModifiedCount() > 0;
        } catch (MongoException | IllegalArgumentException e) {
            return false;
        }
    }

    @Override
    public Habitat buscarPorID(ObjectId id) {
        Habitat habitat = obtenerColeccion().find(eq("_id", id)).first();
        return habitat;
    }

    public Habitat buscarPorNombre(String nombre) {
        Habitat habitat = obtenerColeccion().find(eq("nombre", nombre)).first();
        return habitat;
    }

    @Override
    public List<Habitat> buscarTodos() {
        List<Habitat> habitat = new ArrayList<>();
        habitat = obtenerColeccion().find().into(new ArrayList<>());
        return habitat;
    }

    @Override
    public MongoCollection<Habitat> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<Habitat> colleccionClimas = db.getCollection("Habitat", Habitat.class);
        return colleccionClimas;
    }

}
