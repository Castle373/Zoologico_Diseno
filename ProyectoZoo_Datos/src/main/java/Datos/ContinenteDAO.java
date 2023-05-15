package Datos;

import Dominio.Continente;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

public class ContinenteDAO<T> extends DAOBase<Continente> {

    private MongoDatabase conexion;

    public void recuperarContinente() {
        conexion = Conexion.getInstance();
    }

    @Override
    public boolean guardar(Continente entidad) {
        MongoCollection<Continente> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertOne(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }

    @Override
    public Continente buscarPorID(ObjectId id) {
        Continente continente = obtenerColeccion().find(eq("_id", id)).first();
        return continente;
    }

    @Override
    public List<Continente> buscarTodos() {
        List<Continente> continente = new ArrayList<>();
        continente = obtenerColeccion().find().into(new ArrayList<>());
        return continente;
    }

    @Override
    public MongoCollection<Continente> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<Continente> coleccionContinentes = db.getCollection("Continente", Continente.class);
        return coleccionContinentes;
    }
}
