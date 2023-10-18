
package cuartelbomberos.accesoADatos;

import cuartelbomberos.entidades.Bombero;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import cuartelbomberos.entidades.Siniestro;

public class siniestroData {
    
    private Connection con = null;
    
    public void guardarSiniestro(Siniestro sini) {
        Connection con = Conexion.getConexion();
        String sql = "INSERT INTO `siniestro`(`tipo`, `fechaSiniestro`, `coord_X`, `coord_Y`, `detalle`, `fechaResol`, `puntuacion`, `codBrigada`"
                + ", `resuelto`, `activo`) VALUES (?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, sini.getTipo());
            ps.setDate(2, Date.valueOf(sini.getFechaSiniestro()));
            ps.setInt(3, sini.getCoord_X());
            ps.setInt(4, sini.getCoord_Y());
            ps.setString(5, sini.getText());
            ps.setDate(6, Date.valueOf(sini.getFechaResol()));
            ps.setInt(7, sini.getPuntuacion());
            ps.setInt(8, sini.getCodBrigada());
            ps.setBoolean(9, sini.getResuelto());
            ps.setBoolean(10, sini.getActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                sini.setCodigo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Siniestro agregado.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla siniestros.");
        }
    }

    public void eliminarSiniestro(int cod) {
        Connection con = Conexion.getConexion();
        String sql = "UPDATE siniestro SET activo = 0 WHERE codigo = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            
            int fila = ps.executeUpdate();

            if (fila == 1) {

                JOptionPane.showMessageDialog(null, "Siniestro Eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla siniestro");
        }

    }

    public void resolverSiniestro(int cod, int resuelto) {

        String sql = "UPDATE siniestro SET resuelto = ? WHERE codigo = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ps.setInt(2, resuelto);
            
            int fila = ps.executeUpdate();

            if (fila == 1) {

                JOptionPane.showMessageDialog(null, "Siniestro Eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla siniestro");
        }

    }
    
    public void editarSiniestro(Siniestro sini){
        Connection con = Conexion.getConexion();
        String sql = "UPDATE siniestro SET tipo = ?, fechaSiniestro = ?, coord_X = ?, coord_Y = ?, detalle = ?, fechaResol = ?, "
                + "puntuacion = ?, codBrigada = ?, resuelto = ?, activo = ? WHERE codigo = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, sini.getTipo());
            ps.setDate(2, Date.valueOf(sini.getFechaSiniestro()));
            ps.setInt(3, sini.getCoord_X());
            ps.setInt(4, sini.getCoord_Y());
            ps.setString(5, sini.getText());
            ps.setDate(6, Date.valueOf(sini.getFechaResol()));
            ps.setInt(7, sini.getPuntuacion());
            ps.setInt(8, sini.getCodBrigada());
            ps.setBoolean(9, sini.getResuelto());
            ps.setBoolean(10, sini.getActivo());
            ps.setInt(11, sini.getCodigo());
            
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Siniestro modificado");
            } else {
                JOptionPane.showMessageDialog(null, "El siniestro no existe en la Base de datos");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla siniestro");
        }
    }
       
    public Siniestro buscarSiniestro(int cod){
        
        Connection con = Conexion.getConexion();
        Siniestro sini = null;
        String sql = "SELECT codigo, tipo, fechaSiniestro, coord_X, coord_Y, detalle, fechaResol, puntuacion, codBrigada, resuelto, activo"
                + " FROM siniestro WHERE codigo = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

            sini = new Siniestro();
                
            sini.setCodigo(cod);
            sini.setTipo(rs.getString("tipo"));
            sini.setFechaSiniestro(rs.getDate("fechaSiniestro").toLocalDate());
            sini.setCoord_X(rs.getInt("coord_X"));
            sini.setCoord_Y(rs.getInt("coord_Y"));
            sini.setText(rs.getString("detalle"));
            sini.setFechaResol(rs.getDate("fechaResol").toLocalDate());
            sini.setPuntuacion(rs.getInt("puntuacion"));
            sini.setCodBrigada(rs.getInt("codBrigada"));
            sini.setResuelto(rs.getBoolean("resuelto"));
            sini.setActivo(rs.getBoolean("activo"));
            
        } else {
            JOptionPane.showMessageDialog(null, "No existe un siniestro con ese codigo");
            ps.close();
        }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla siniestro");
        }
        return sini;
    }
    
    public List<Siniestro> listarSiniestros(){
        Connection con = Conexion.getConexion();
        List<Siniestro> sini = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM siniestro WHERE (resuelto = 1 OR resuelto = 0) AND activo = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
                
            while (rs.next()) {
                Siniestro siniestros = new Siniestro();
                siniestros.setCodigo(rs.getInt("codigo"));
                siniestros.setTipo(rs.getString("tipo"));
                siniestros.setFechaSiniestro(rs.getDate("fechaSiniestro").toLocalDate());
                siniestros.setCoord_X(rs.getInt("coord_X"));
                siniestros.setCoord_Y(rs.getInt("coord_Y"));
                siniestros.setText(rs.getString("detalle"));
                siniestros.setFechaResol(rs.getDate("fechaResol").toLocalDate());
                siniestros.setPuntuacion(rs.getInt("puntuacion"));
                siniestros.setCodBrigada(rs.getInt("codBrigada"));
                siniestros.setResuelto(rs.getBoolean("resuelto"));
                siniestros.setActivo(rs.getBoolean("activo"));

                sini.add(siniestros);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla siniestro" + ex.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return sini;
        
    }
    
    public List<Siniestro> listarSiniXfecha(Date fechaInicio, Date fechaFin){
        Connection con = Conexion.getConexion();
        List<Siniestro> sini = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM `siniestro` WHERE activo = 1 AND (resuelto = 0 OR resuelto = 1) AND fechaSiniestro BETWEEN ? AND ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, fechaInicio);
            ps.setDate(2, fechaFin);
            ResultSet rs = ps.executeQuery();
                
            while (rs.next()) {
                Siniestro siniestros = new Siniestro();
                siniestros.setCodigo(rs.getInt("codigo"));
                siniestros.setTipo(rs.getString("tipo"));
                siniestros.setFechaSiniestro(rs.getDate("fechaSiniestro").toLocalDate());
                siniestros.setCoord_X(rs.getInt("coord_X"));
                siniestros.setCoord_Y(rs.getInt("coord_Y"));
                siniestros.setText(rs.getString("detalle"));
                siniestros.setFechaResol(rs.getDate("fechaResol").toLocalDate());
                siniestros.setPuntuacion(rs.getInt("puntuacion"));
                siniestros.setCodBrigada(rs.getInt("codBrigada"));
                siniestros.setResuelto(rs.getBoolean("resuelto"));
                siniestros.setActivo(rs.getBoolean("activo"));

                sini.add(siniestros);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla siniestro" + ex.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return sini;
        
    }
    
    public List<Siniestro> listarSiniXtipo(String tipo){
        Connection con = Conexion.getConexion();
        List<Siniestro> sini = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM siniestro WHERE tipo = ? AND activo = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipo);
            ResultSet rs = ps.executeQuery();
                
            while (rs.next()) {
                Siniestro siniestros = new Siniestro();
                siniestros.setCodigo(rs.getInt("codigo"));
                siniestros.setTipo(rs.getString("tipo"));
                siniestros.setFechaSiniestro(rs.getDate("fechaSiniestro").toLocalDate());
                siniestros.setCoord_X(rs.getInt("coord_X"));
                siniestros.setCoord_Y(rs.getInt("coord_Y"));
                siniestros.setText(rs.getString("detalle"));
                siniestros.setFechaResol(rs.getDate("fechaResol").toLocalDate());
                siniestros.setPuntuacion(rs.getInt("puntuacion"));
                siniestros.setCodBrigada(rs.getInt("codBrigada"));
                siniestros.setResuelto(rs.getBoolean("resuelto"));
                siniestros.setActivo(rs.getBoolean("activo"));

                sini.add(siniestros);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla siniestro" + ex.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return sini;
        
    }
    
}
