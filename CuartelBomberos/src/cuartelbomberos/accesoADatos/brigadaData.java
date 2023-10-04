package cuartelbomberos.accesoADatos;

import cuartelbomberos.entidades.brigada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class brigadaData {

    private Connection con = null;

    public brigadaData() {
        con = Conexion.getConexion();
    }

    public void guardarBrigada(brigada brigada) {
        String sql = "INSERT INTO brigada( nombreBriga, especialidad, libre, nroCuartel) "
                + "VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, brigada.getNombreBriga());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getCodBrigada());
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                brigada.setCodBrigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Brigada Guardado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla brigada");
        }
    }

    public void editarBrigada(brigada brigada) {
        String sql = "UPDATE brigada SET nombreBriga=?,especialidad=?,libre=?,nroCuartel=? WHERE codBrigada=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, brigada.getNombreBriga());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getNroCuartel());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Brigada modificada");
            } else {
                JOptionPane.showMessageDialog(null, "La brigada no existe en la Base de datos");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla brigada");
        }
    }

    public void eliminarBrigada(int codBrigada) {
        String sql = "DELETE FROM brigada WHERE codBrigada =?";
        PreparedStatement ps = null;
        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            int fila = ps.executeUpdate();

            if (fila == 1) {

                JOptionPane.showMessageDialog(null, "Brigada eliminada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla brigada");
        }
    }

    public brigada buscarBrigada(int codBrigada) {
        brigada brigada = null;
        String sql = "SELECT codBrigada, nombreBriga, especialidad, libre, nroCuartel FROM brigada WHERE codBrigada=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                brigada = new brigada();

                brigada.setCodBrigada(codBrigada);
                brigada.setNombreBriga(rs.getString("nombreBriga"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(true);
                brigada.setNroCuartel(rs.getInt("nroCuartel"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe una brigada con ese codigo");
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla brigada");
        }
        return brigada;
    }

    public List<brigada> listarBrigada() {
        List<brigada> brigada = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno WHERE libre = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                brigada brigadas = new brigada();
                brigadas.setCodBrigada(rs.getInt("codBrigada"));
                brigadas.setEspecialidad(rs.getString("especialidad"));
                brigadas.setLibre(rs.getBoolean("libre"));
                brigadas.setNombreBriga(rs.getString("nombreBriga"));
                brigadas.setNroCuartel(rs.getInt("nroCuartel"));
                brigada.add(brigadas);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada" + ex.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return brigada;

    }
}
