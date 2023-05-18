
package DAO;

import Dominio.Vegetacion;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;


public class VegetacionDAO <T> extends DAOBase<Vegetacion>
{

    private MongoDatabase conexion;

    public void recuperaVegetacion() {
        conexion = Conexion.getInstance();
    }
    
    @Override
    public boolean guardar(Vegetacion entidad) {
       MongoCollection<Vegetacion> coleccionP =obtenerColeccion();
        try {
            coleccionP.insertOne(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }

    @Override
    public Vegetacion buscarPorID(ObjectId id) {
        Vegetacion vege = obtenerColeccion().find(eq("_id", id)).first();
        return vege;
    }

    @Override
    public List<Vegetacion> buscarTodos() {
        List<Vegetacion> vege = new ArrayList<>();
        vege = obtenerColeccion().find().into(new ArrayList<>());
        return vege;
    }

    @Override
    public MongoCollection<Vegetacion> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<Vegetacion> collecionVegetacion = db.getCollection("Vegetacion", Vegetacion.class);
        return collecionVegetacion;
    }

}
