/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Dominio.Continente;
import Dominio.Guia;
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
public class GuiaDAO<T> extends DAOBase<Guia> {

    private MongoDatabase conexion;

    public void recuperarContinente() {
        conexion = Conexion.getInstance();
    }

    @Override
    public boolean guardar(Guia entidad) {
        MongoCollection<Guia> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertOne(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }

    @Override
    public Guia buscarPorID(ObjectId id) {
        Guia guias = obtenerColeccion().find(eq("_id", id)).first();
        return guias;
    }

    @Override
    public List<Guia> buscarTodos() {
        List<Guia> guias = new ArrayList<>();
        guias = obtenerColeccion().find().into(new ArrayList<>());
        return guias;
    }

    @Override
    public MongoCollection<Guia> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<Guia> coleccion = db.getCollection("Guia", Guia.class);
        return coleccion;
    }
}
