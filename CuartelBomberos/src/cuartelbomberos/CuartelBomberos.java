// Iniciado el 3 de Octubre de 2023 :)
package cuartelbomberos;

import cuartelbomberos.accesoADatos.BrigadaData;
import cuartelbomberos.accesoADatos.Conexion;
import cuartelbomberos.accesoADatos.CuartelData;
import cuartelbomberos.entidades.Brigada;
import cuartelbomberos.entidades.Cuartel;
import java.sql.Connection;

public class CuartelBomberos {

    public static void main(String[] args) {
        Connection con = Conexion.getConexion();

//        Cuartel central = new Cuartel("Cuartel Central", "España 122", 15, 3, "11111112", "cuartelcentral@gmail.com");
//        CuartelData cuar = new CuartelData();
////        cuar.guardarCuartel(central);
//        cuar.editarCuartel(central);
        Cuartel vol = new Cuartel("Bomberos Voluntarios", "Av. Principal 123", 2, 23, "22222222", "bomberos_voluntarios@gmail.com");
        CuartelData cuar = new CuartelData();
//        cuar.eliminarCuartel(2);
        cuar.guardarCuartel(vol);

//        Brigada seguridad=new Brigada("Seguridad","Operativo de prevención",true,2);
//        BrigadaData bri=new BrigadaData();
////        bri.guardarBrigada(seguridad);
//        
//        bri.editarBrigada(seguridad);
    }

}
