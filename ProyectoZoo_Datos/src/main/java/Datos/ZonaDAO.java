/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Dominio.Zona;
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
public class ZonaDAO<T> extends DAOBase<Zona> {

    private MongoDatabase conexion;

    public void recuperaClima() {
        conexion = Conexion.getInstance();
    }

    @Override
    public boolean guardar(Zona entidad) {
        MongoCollection<Zona> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertOne(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }

    @Override
    public Zona buscarPorID(ObjectId id) {
        Zona zona = obtenerColeccion().find(eq("_id", id)).first();
        return zona;
    }

    @Override
    public List<Zona> buscarTodos() {
        List<Zona> zona = new ArrayList<>();
        zona = obtenerColeccion().find().into(new ArrayList<>());
        return zona;
    }

    @Override
    public MongoCollection<Zona> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<Zona> colleccionZona = db.getCollection("Zona", Zona.class);
        return colleccionZona;
    }
}
