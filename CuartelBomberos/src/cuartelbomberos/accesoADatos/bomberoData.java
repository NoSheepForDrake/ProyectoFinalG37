package cuartelbomberos.accesoADatos;

import cuartelbomberos.entidades.Bombero;
import cuartelbomberos.entidades.Brigada;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class bomberoData {
    
    private Connection con = null;

    public bomberoData() {
        con = Conexion.getConexion();
    }

    public void guardarBombero(Bombero bomber) {

        String sql = "INSERT INTO bombero (dni, nombreApellido, fechaNac, celular, codBrigada, gSanguineo)"
                + "VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, bomber.getDni());
            ps.setString(2, bomber.getNombreApellido());
            ps.setDate(3, Date.valueOf(bomber.getFechaNac()));
            ps.setString(4, bomber.getCelular());
            ps.setInt(5, bomber.getbrigada().getCodBrigada());
            ps.setString(6, bomber.getgSanguineo());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                bomber.setIdBombero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Bombero Guardado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla bombero");
        }
    }

    public void editarBombero(Bombero bomber) {

        String sql = "UPDATE bombero SET dni=?, nombreApellido=?, fechaNac=?, celular=?, gSanguineo=?"
                + "WHERE idBombero=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, bomber.getDni());
            ps.setString(2, bomber.getNombreApellido());
            ps.setDate(3, Date.valueOf(bomber.getFechaNac()));
            ps.setString(4, bomber.getCelular());
            ps.setString(5, bomber.getgSanguineo());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Bombero modificado");
            } else {
                JOptionPane.showMessageDialog(null, "El Bombero no existe en la Base de datos");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla bombero");
        }

    }

    public void eliminarBombero(String dni) {

        String sql = "DELETE FROM bombero WHERE dni = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            int fila = ps.executeUpdate();

            if (fila == 1) {

                JOptionPane.showMessageDialog(null, "Bombero Eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla bombero");
        }

    }

    public Bombero buscarBombero(String dni) {
        Bombero bomber = null;

        String sql = "SELECT idBombero ,dni, nompreApellido, fechaNac, celular, gSanguineo FROM bombero WHERE dni = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                bomber = new Bombero();
                bomber.setIdBombero(rs.getInt("idBombero"));
                bomber.setDni(dni); // este dato se lo pasamos por parametro 
                bomber.setNombreApellido(rs.getString("nombreApellido"));
                bomber.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                bomber.setCelular(rs.getString("celular"));
                bomber.setgSanguineo(rs.getString("gSanguineo"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe un bombero con ese DNI");
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla bombero");
        }

        return bomber;
    }

    public List<Bombero> listarAlumnos() {

        List<Bombero> bomberos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM bombero";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Bombero bomber = new Bombero();

                bomber.setIdBombero(rs.getInt("idBombero"));
                bomber.setDni(rs.getString("dni"));
                bomber.setNombreApellido(rs.getString("nombreApellido"));
                bomber.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                bomber.setCelular(rs.getString("celular"));
                bomber.setgSanguineo(rs.getString("gSanguineo"));
                bomberos.add(bomber);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero" + ex.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return bomberos;
    }

}
