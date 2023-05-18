/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Dominio.Clima;
import com.mongodb.client.MongoCollection;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Diego
 */
public abstract class DAOBase<T> {

    public abstract boolean guardar(T entidad);

    public abstract T buscarPorID(ObjectId id);

    public abstract List<T> buscarTodos();

    public abstract MongoCollection<T> obtenerColeccion();
}
