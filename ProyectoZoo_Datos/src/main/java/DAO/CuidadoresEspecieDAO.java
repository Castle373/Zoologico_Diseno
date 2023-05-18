/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Dominio.CuidadorEspecie;
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
public class CuidadoresEspecieDAO<T> extends DAOBase<CuidadorEspecie> {

    private MongoDatabase conexion;

    public void recuperaClima() {
        conexion = Conexion.getInstance();
    }

    @Override
    public boolean guardar(CuidadorEspecie entidad) {
        MongoCollection<CuidadorEspecie> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertOne(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }
    public boolean guardarMuchos(List<CuidadorEspecie> entidad) {
        MongoCollection<CuidadorEspecie> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertMany(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }
    @Override
    public CuidadorEspecie buscarPorID(ObjectId id) {
        CuidadorEspecie cuidador = obtenerColeccion().find(eq("_id", id)).first();
        return cuidador;
    }

    @Override
    public List<CuidadorEspecie> buscarTodos() {
        List<CuidadorEspecie> cuidador = new ArrayList<>();
        cuidador = obtenerColeccion().find().into(new ArrayList<>());
        return cuidador;
    }

    @Override
    public MongoCollection<CuidadorEspecie> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<CuidadorEspecie> colleccionCuidador = db.getCollection("CuidadorEspecie", CuidadorEspecie.class);
        return colleccionCuidador;
    }
}
