/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Dominio.HabitatOcupada;
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
public class HabitatOcupaDAO<T> extends DAOBase<HabitatOcupada> {

    private MongoDatabase conexion;

    public void recuperarContinente() {
        conexion = Conexion.getInstance();
    }

    @Override
    public boolean guardar(HabitatOcupada entidad) {
        MongoCollection<HabitatOcupada> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertOne(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }
    public boolean guardarMuchos(List<HabitatOcupada> entidad) {
        MongoCollection<HabitatOcupada> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertMany(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }

    @Override
    public HabitatOcupada buscarPorID(ObjectId id) {
        HabitatOcupada guias = obtenerColeccion().find(eq("_id", id)).first();
        return guias;
    }

    @Override
    public List<HabitatOcupada> buscarTodos() {
        List<HabitatOcupada> guias = new ArrayList<>();
        guias = obtenerColeccion().find().into(new ArrayList<>());
        return guias;
    }

    @Override
    public MongoCollection<HabitatOcupada> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<HabitatOcupada> coleccion = db.getCollection("HabitatOcupada", HabitatOcupada.class);
        return coleccion;
    }
}
