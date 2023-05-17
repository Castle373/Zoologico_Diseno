/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;


import Dominio.Especie;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author diego
 */
public class EspecieDAO<T> extends DAOBase<Especie> {

    private MongoDatabase conexion;

    public void recuperaClima() {
        conexion = Conexion.getInstance();
    }

    @Override
    public boolean guardar(Especie especie) {
        MongoCollection<Especie> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertOne(especie);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }
    public Especie buscarPorNombre(String nombre) {
        Especie es = obtenerColeccion().find(eq("nombre", nombre)).first();
        return es;
    }
    @Override
    public Especie buscarPorID(ObjectId id) {
        Especie especie = obtenerColeccion().find(eq("_id", id)).first();
        return especie;
    }

    @Override
    public List<Especie> buscarTodos() {
        List<Especie> especie = new ArrayList<>();
        especie = obtenerColeccion().find().into(new ArrayList<>());
        return especie;
    }

    @Override
    public MongoCollection<Especie> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<Especie> colleccionespecie = db.getCollection("Especie", Especie.class);
        return colleccionespecie;
    }
}
