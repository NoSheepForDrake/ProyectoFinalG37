// Iniciado el 3 de Octubre de 2023 :)
package cuartelbomberos;

import cuartelbomberos.accesoADatos.Conexion;
import cuartelbomberos.accesoADatos.bomberoData;
import cuartelbomberos.accesoADatos.brigadaData;
import cuartelbomberos.accesoADatos.cuartelData;
import cuartelbomberos.entidades.Bombero;
import cuartelbomberos.entidades.Brigada;
import cuartelbomberos.entidades.Cuartel;
import java.sql.Connection;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class CuartelBomberos {

    public static void main(String[] args) {
//        //Creamos la conexion
//        Connection con= Conexion.getConexion();
//        //Creamos un cuartel
//        Cuartel c2 = new Cuartel("Cuartel 2", "Ficticia 2", 70, 30, "4995577", "cuartel2@ejemplo.com");
//        //Creamos una brigada
//        Brigada BrigadaA = new Brigada("Brigada A", "Socorrista", true, c2);
//        //Creamos un bombero 1 asiganado a Brigada A
//        Bombero b1 = new Bombero("12345678", "Juan Lopez", LocalDate.of(1988, 10, 15), "155123987", "1", "A+");
    
    //Creamos las instancias de las clases para enviar a la BD
    
    //Creamos CuartelData para poder usar sus metodos
        cuartelData cd = new cuartelData();
    //Creamos brigadaData para poder usar sus metodos    
        brigadaData brd =  new brigadaData();
    //Creamos bombero data para poder usar sus metodos
        bomberoData bd = new bomberoData();
        
        Cuartel cuartel = cd.buscarCuartel(1);
        Brigada brigada = brd.buscarBrigada(1);
        JOptionPane.showMessageDialog(null, brigada);
        Bombero bombero = new Bombero("87654321", "Tony Stark", LocalDate.of(1989, 12, 15), "155124466", brigada, "A+");
        bd.guardarBombero(bombero);
    


    
    }
    
}
