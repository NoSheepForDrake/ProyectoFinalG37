/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuartelbomberos.accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Conexion {
     private static final String URL ="jdbc:mariadb://localhost/";
    private static final String DB ="bomberos";
    private static final String USUARIO ="root";
    private static final String PASSWORD ="";
    private static Connection conexion;

    public Conexion() {
    }

    public static Connection getConexion() {

        if (conexion == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                
                JOptionPane.showMessageDialog(null, "Conexion exitosa!!");
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No se cargo el Driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo establecer conexion a la Base de Datos");
            }

        }
        return conexion;

    }
}