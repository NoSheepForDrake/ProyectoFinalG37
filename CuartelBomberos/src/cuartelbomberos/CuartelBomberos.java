// Iniciado el 3 de Octubre de 2023 :)
package cuartelbomberos;

import cuartelbomberos.accesoADatos.Conexion;
import cuartelbomberos.accesoADatos.BomberoData;
import cuartelbomberos.accesoADatos.BrigadaData;
import cuartelbomberos.accesoADatos.CuartelData;
import cuartelbomberos.accesoADatos.siniestroData;
import cuartelbomberos.entidades.Bombero;
import cuartelbomberos.entidades.Brigada;
import cuartelbomberos.entidades.Cuartel;
import cuartelbomberos.entidades.Siniestro;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class CuartelBomberos {

    public static void main(String[] args) {
        
        //NO BORRAR ESTO POR FAVOR!!!!!
        CuartelData tip = new CuartelData();
        List<Cuartel> asd = tip.listarCuartel();
        int corX = 11;
        int corY = 51;
        int[] cx = new int[asd.size()];
        int[] cy = new int[asd.size()];
        
        for (int i = 0; i < asd.size(); i++) {
            Cuartel qwe = asd.get(i);
            cx[i] = qwe.getCoord_X();
            cy[i] = qwe.getCoord_Y();
        }
        
        int cuartelMasCercano = -1;
        double distanciaMinima = Double.MAX_VALUE;

        for (int i = 0; i < cx.length; i++) {
            int deltaX = cx[i] - corX;
            int deltaY = cy[i] - corY;
            double distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

            if (distancia < distanciaMinima) {
                distanciaMinima = distancia;
                cuartelMasCercano = i;
            }
        }

        if (cuartelMasCercano != -1) {
            System.out.println("El cuartel más cercano esta en la posición " + cuartelMasCercano);
            System.out.println("Coordenadas del cuartel más cercano: (" + cx[cuartelMasCercano] + ", " + cy[cuartelMasCercano] + ")");
            System.out.println("Distancia al cuartel más cercano: " + distanciaMinima);
        } else {
            System.out.println("No se encontraron cuarteles para calcular la distancia.");
        }
        
        System.out.println(tip.cuartelPorCoord(30, 42).getNombreCuartel());
        //NO BORRAR ESTO POR FAVOR!!!!
    }
    
}
