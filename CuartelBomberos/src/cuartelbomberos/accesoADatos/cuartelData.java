
package cuartelbomberos.accesoADatos;

import cuartelbomberos.entidades.cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class cuartelData {
      private Connection con = null;

    public cuartelData() {
        con = Conexion.getConexion();
    }
    public void guardarCuartel(cuartel cuartel){
      String sql="INSERT INTO cuartel( nombreCuartel, direccion, coord_X, coord_Y, telefono, correo) "
              + "VALUES (?,?,?,?,?,?)";
       try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1,cuartel.getNombreCuartel() );
            ps.setString(2,cuartel.getDireccion());
            ps.setInt(3,cuartel.getCoord_X() );
            ps.setInt(4,cuartel.getCoord_Y() );
            ps.setString(5,cuartel.getTelefono() );
            ps.setString(6, cuartel.getCorreo());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                cuartel.setCodCuartel(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cuartel Guardado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla cuartel");
        }
    }
    public void editarCuartel(cuartel cuartel){
        String sql="UPDATE cuartel SET nombreCuartel=?,direccion=?,coord_X=?,coord_Y=?,telefono=?,correo=?"
                + " WHERE codCuartel=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1,cuartel.getNombreCuartel() );
            ps.setString(2,cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoord_X());
            ps.setInt(4,cuartel.getCoord_Y());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6,cuartel.getCorreo() );

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cuartel modificado");
            } else {
                JOptionPane.showMessageDialog(null, "El cuartel no existe en la Base de datos");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla cuartel");
        }
    }
    public void eliminarCuartel(int codCuartel) {

        String sql = "DELETE FROM cuartel WHERE codCuartel=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, codCuartel);
            int fila = ps.executeUpdate();

            if (fila == 1) {

                JOptionPane.showMessageDialog(null, "Cuartel Eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla cuartel");
        }

    }
    public cuartel buscarCuartel(int codCuartel){
        cuartel cuartel=null;
        String sql="SELECT codCuartel, nombreCuartel, direccion, coord_X, coord_Y, telefono, correo "
                + "FROM cuartel WHERE codCuartel=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, codCuartel);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cuartel=new cuartel();
                cuartel.setCodCuartel(codCuartel);
                cuartel.setNombreCuartel(rs.getString("nombreCuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoord_X(rs.getInt("coord_X"));
                cuartel.setCoord_Y(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreo(rs.getString("correo"));


            } else {
                JOptionPane.showMessageDialog(null, "No existe un cuartel con ese codigo de identificación");
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla cuartel");
        }
        return cuartel;
    }
     public List<cuartel> listarCuartel() {
        List<cuartel> cuartel = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno WHERE libre = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

                cuartel cuart= new cuartel();
                 cuart.setCodCuartel(rs.getInt("codCuarte"));
                cuart.setNombreCuartel(rs.getString("nombreCuartel"));
                cuart.setDireccion(rs.getString("direccion"));
                cuart.setCoord_X(rs.getInt("coord_X"));
                cuart.setCoord_Y(rs.getInt("coord_Y"));
                cuart.setTelefono(rs.getString("telefono"));
                cuart.setCorreo(rs.getString("correo"));
                
                cuartel.add(cuart);
            while (rs.next()) {
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartel" + ex.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return cuartel;

    }
}
