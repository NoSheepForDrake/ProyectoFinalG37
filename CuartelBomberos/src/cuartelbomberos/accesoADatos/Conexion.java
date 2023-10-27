
package cuartelbomberos.accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "bomberosG37";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection conexion;

    public Conexion() {}

    public static Connection getConexion() {

        if (conexion == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);

                //JOptionPane.showMessageDialog(null, "Conexion exitosa!!");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No se cargo el Driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo establecer conexion a la Base de Datos");
            }

        }
        return conexion;

    }
}
