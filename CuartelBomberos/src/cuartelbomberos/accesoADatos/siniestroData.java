
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

        String sql = "INSERT INTO `siniestro`(`tipo`, `fechaSiniestro`, `coord_X`, `coord_Y`, `detalle`, `fechaResol`, `puntuacion`, `codBrigada`) "
                + "VALUES (?,?,?,?,?,?,?,?)";

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
    
}
