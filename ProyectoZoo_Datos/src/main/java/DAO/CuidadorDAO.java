/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Dominio.Cuidador;
import Dominio.CuidadorEspecie;
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

/**
 *
 * @author diego
 */
public class CuidadorDAO<T> extends DAOBase<Cuidador> {

    private MongoDatabase conexion;

    public void recuperaClima() {
        conexion = Conexion.getInstance();
    }

    @Override
    public boolean guardar(Cuidador entidad) {
        MongoCollection<Cuidador> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertOne(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }
    public boolean agregarCuidadorEspecie(ObjectId id, CuidadorEspecie cuidadorEspecie) {
        try {
            System.out.println(id);
            MongoCollection<Cuidador> coleccionP = obtenerColeccion();
            UpdateResult resultado = coleccionP.updateOne(Filters.eq("_id", id), Updates.addToSet("cuidadorEspecie", cuidadorEspecie));
            return resultado.getModifiedCount() > 0;
        } catch (MongoException | IllegalArgumentException e) {
            return false;
        }
    }
    @Override
    public Cuidador buscarPorID(ObjectId id) {
        Cuidador cuidador = obtenerColeccion().find(eq("_id", id)).first();
        return cuidador;
    }

    @Override
    public List<Cuidador> buscarTodos() {
        List<Cuidador> cuidador = new ArrayList<>();
        cuidador = obtenerColeccion().find().into(new ArrayList<>());
        return cuidador;
    }

    @Override
    public MongoCollection<Cuidador> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<Cuidador> colleccionCuidador = db.getCollection("Cuidador", Cuidador.class);
        return colleccionCuidador;
    }
}
