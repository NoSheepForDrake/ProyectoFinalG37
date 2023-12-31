package cuartelbomberos.accesoADatos;

import cuartelbomberos.entidades.Brigada;
import cuartelbomberos.entidades.Cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BrigadaData {

    private Connection con = null;
    private CuartelData cd;

    public BrigadaData() {
        con = Conexion.getConexion();
    }

    public void guardarBrigada(Brigada brigada) {
        CuartelData cd = new CuartelData();
        String sql = "INSERT INTO brigada( nombreBriga, especialidad, libre, nroCuartel) "
                + "VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, brigada.getNombreBriga());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getCuartel().getCodCuartel());
            //JOptionPane.showMessageDialog(null,brigada.getCuartel().getCodCuartel());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                brigada.setCodBrigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Brigada Guardado");
            }
            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla brigada. " + ex.getMessage());
        }
    }

    public void editarBrigada(Brigada brigada) {

        String sql = "UPDATE brigada SET nombreBriga=?,especialidad=?,libre=?,nroCuartel=? WHERE codBrigada=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, brigada.getNombreBriga());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getCuartel().getCodCuartel());
            ps.setInt(5, brigada.getCodBrigada());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Brigada modificada");
            } else {
                JOptionPane.showMessageDialog(null, "La brigada no existe en la Base de datos");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla brigada. " + ex.getMessage());
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
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla brigada. " + ex.getMessage());
        }
    }

    public Brigada buscarBrigada(int codBrigada) {
        CuartelData cd = new CuartelData();
        Brigada brigada = null;
        String sql = "SELECT codBrigada, nombreBriga, especialidad, libre, nroCuartel FROM brigada WHERE codBrigada=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                brigada = new Brigada();

                brigada.setCodBrigada(codBrigada);
                brigada.setNombreBriga(rs.getString("nombreBriga"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(true);
                //JOptionPane.showMessageDialog(null, brigada.getNombreBriga());
                int codigoCuartel = rs.getInt("nroCuartel"); // Obtener el código del cuartel
                Cuartel cuartel = cd.buscarCuartel(codigoCuartel); // Buscar el cuartel por su código
                brigada.setCuartel(cuartel);

            } else {
                rs.close();
                ps.close();
                JOptionPane.showMessageDialog(null, "No existe una brigada con ese código de identificación");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla brigada. " + ex.getMessage());
        }
        return brigada;
    }

    public List<Brigada> listarBrigadas() {
        CuartelData cd = new CuartelData();
        List<Brigada> brigadas = new ArrayList<>();
        ResultSet rs = null;
        try {

            String sql = "SELECT * FROM brigada WHERE libre = 1";

            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Brigada brigada = new Brigada();
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));
                brigada.setNombreBriga(rs.getString("nombreBriga"));
                Cuartel cuartel = cd.buscarCuartel(rs.getInt("nroCuartel"));

                brigada.setCuartel(cuartel);
                brigadas.add(brigada);

            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada AA. " + ex.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return brigadas;

    }

    public Brigada buscarBrigadaXNombre(String nombreBrigada) {
        CuartelData cd = new CuartelData();
        Brigada brigada = null;
        String sql = "SELECT codBrigada, nombreBriga, especialidad, libre, nroCuartel FROM brigada WHERE nombreBriga=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreBrigada);
            ResultSet rs = ps.executeQuery();
            //JOptionPane.showMessageDialog(null, nombreBrigada);

            if (rs.next()) {

                brigada = new Brigada();

                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombreBriga(rs.getString("nombreBriga"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(true);
                //JOptionPane.showMessageDialog(null, brigada.getNombreBriga());
                int codigoCuartel = rs.getInt("nroCuartel"); // Obtener el código del cuartel
                Cuartel cuartel = cd.buscarCuartel(codigoCuartel); // Buscar el cuartel por su código
                brigada.setCuartel(cuartel);

            } else {
                ps.close();
                rs.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla brigada3" + ex.getMessage());
        }
        return brigada;
    }

    public Brigada buscarBrigadaCuartel(int nroCuartel) {
        CuartelData cd = new CuartelData();
        Brigada brigada = null;
        String sql = "SELECT codBrigada, nombreBriga, especialidad, libre, nroCuartel FROM brigada WHERE nroCuartel=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, nroCuartel);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                brigada = new Brigada();

                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombreBriga(rs.getString("nombreBriga"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(true);
                //JOptionPane.showMessageDialog(null, brigada.getNombreBriga());
                int codigoCuartel = rs.getInt("nroCuartel"); // Obtener el código del cuartel
                Cuartel cuartel = cd.buscarCuartel(codigoCuartel); // Buscar el cuartel por su código
                brigada.setCuartel(cuartel);

            } else {
                rs.close();
                ps.close();
                JOptionPane.showMessageDialog(null, "No existe una brigada asignada al cuartel");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla brigada. " + ex.getMessage());
        }
        return brigada;
    }

    public Brigada buscarBrigadaEsp(String especialidad) {
        CuartelData cd = new CuartelData();
        Brigada brigada = null;
        String sql = "SELECT codBrigada, nombreBriga, especialidad, libre, nroCuartel FROM brigada WHERE especialidad=? AND libre = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, especialidad);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                brigada = new Brigada();

                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombreBriga(rs.getString("nombreBriga"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(true);
                //JOptionPane.showMessageDialog(null, brigada.getNombreBriga());
                int codigoCuartel = rs.getInt("nroCuartel"); // Obtener el código del cuartel
                Cuartel cuartel = cd.buscarCuartel(codigoCuartel); // Buscar el cuartel por su código
                brigada.setCuartel(cuartel);

            } else {
                rs.close();
                ps.close();
                JOptionPane.showMessageDialog(null, "No existe una brigada con ese código de identificación.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla brigada. " + ex.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No hay brigada disponible.");
        }
        return brigada;
    }

    //Agrego este metodo para listar las brigadas con la misma especialidad
    public List<Brigada> buscarBrigadasPorEspecialidad(String especialidad) {
        List<Brigada> brigadas = new ArrayList<>();
        CuartelData cd = new CuartelData();

        try {
            String sql = "SELECT codBrigada, nombreBriga, especialidad, libre, nroCuartel FROM brigada WHERE especialidad = ? AND libre = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, especialidad);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Brigada brigada = new Brigada();

                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombreBriga(rs.getString("nombreBriga"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(true);

                int codigoCuartel = rs.getInt("nroCuartel");
                Cuartel cuartel = cd.buscarCuartel(codigoCuartel);
                brigada.setCuartel(cuartel);

                brigadas.add(brigada);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla brigada: " + ex.getMessage());
        }
        return brigadas;
    }

    public List<Brigada> buscarBrigadaXCuartel(int nroCuartel) {
        CuartelData cd = new CuartelData();
        List<Brigada> brigadas = new ArrayList<>();
        String sql = "SELECT nombreBriga, especialidad, libre, nroCuartel FROM brigada WHERE nroCuartel=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, nroCuartel);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Brigada brigada = new Brigada();

                brigada.setNombreBriga(rs.getString("nombreBriga"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(true);

                int codigoCuartel = rs.getInt("nroCuartel"); // Obtener el código del cuartel
                Cuartel cuartel = cd.buscarCuartel(codigoCuartel); // Buscar el cuartel por su código
                brigada.setCuartel(cuartel);
                brigadas.add(brigada);

            }
            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla brigada. " + ex.getMessage());
        }
        return brigadas;
    }
}
