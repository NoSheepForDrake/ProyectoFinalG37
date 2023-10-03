// Iniciado el 3 de Octubre de 2023 :)
package cuartelbomberos;

import cuartelbomberos.accesoADatos.Conexion;
import java.sql.Connection;

public class CuartelBomberos {

    public static void main(String[] args) {
        Connection con= Conexion.getConexion();
    }
    
}
