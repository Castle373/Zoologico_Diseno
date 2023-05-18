/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Dominio;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author diego
 */
public class ProyectoZoo_Dominio {

    public static void main(String[] args) {
        LocalTime tiempoEspecifico = LocalTime.parse("11:11");
        String a= tiempoEspecifico.toString();
        System.out.println(a);
    }
}

