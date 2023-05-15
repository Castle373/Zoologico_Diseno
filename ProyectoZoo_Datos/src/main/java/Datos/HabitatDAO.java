
package Datos;

import Dominio.Habitat;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;


public class HabitatDAO<T> extends DAOBase<Habitat>  
{
private MongoDatabase conexion;

    public void recuperaClima() {
        conexion = Conexion.getInstance();
    }

    @Override
    public boolean guardar(Habitat entidad) {
       MongoCollection<Habitat> coleccionP =obtenerColeccion();
        try {
            coleccionP.insertOne(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
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
