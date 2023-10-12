package cuartelbomberos.accesoADatos;

import cuartelbomberos.entidades.Bombero;
import cuartelbomberos.entidades.Brigada;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BomberoData {

    private Connection con = null;
    private BrigadaData bd;

    public BomberoData() {
        con = Conexion.getConexion();
    }

    public void guardarBombero(Bombero bomber) {
        BrigadaData bd = new BrigadaData();

        String sql = "INSERT INTO bombero (dni, nombreApellido, fechaNac, celular, codBrigada, gSanguineo, estado)"
                + "VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, bomber.getDni());
            ps.setString(2, bomber.getNombreApellido());
            ps.setDate(3, Date.valueOf(bomber.getFechaNac()));
            ps.setString(4, bomber.getCelular());
            ps.setInt(5, bomber.getBrigada().getCodBrigada());
            //JOptionPane.showMessageDialog(null, "N° brigada: " + bomber.getBrigada().getCodBrigada());
            ps.setString(6, bomber.getgSanguineo());
            ps.setBoolean(7, true);

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                bomber.setIdBombero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Bombero Guardado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla bombero2 " + ex.getMessage());
        }
    }

    public void editarBombero(Bombero bomber) {

        String sql = "UPDATE bombero SET dni=?, nombreApellido=?, fechaNac=?, celular=?, codBrigada= ?, gSanguineo=?"
                + "WHERE idBombero=? and estado=1";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, bomber.getDni());
            ps.setString(2, bomber.getNombreApellido());
            ps.setDate(3, Date.valueOf(bomber.getFechaNac()));
            ps.setString(4, bomber.getCelular());
            ps.setInt(5, bomber.getBrigada().getCodBrigada());
            //JOptionPane.showMessageDialog(null, "N° brigada: " + bomber.getBrigada().getCodBrigada());
            ps.setString(6, bomber.getgSanguineo());
            ps.setInt(7, bomber.getIdBombero());
            //JOptionPane.showMessageDialog(null, "N° Bombero: " + bomber.getIdBombero());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Bombero modificado");
            } else {
                JOptionPane.showMessageDialog(null, "El Bombero no existe en la Base de datos3");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla bombero4 " + ex.getMessage());
        }

    }

    public void eliminarBombero(String dni) {

        String sql = "UPDATE bombero SET estado = 0 WHERE dni = ?";
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
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla bombero5");
        }

    }

    public Bombero buscarBombero(String dni) {
        BrigadaData bd = new BrigadaData();
        Bombero bomber = null;

        String sql = "SELECT idBombero, dni, nombreApellido, fechaNac, celular, codBrigada, gSanguineo, estado FROM bombero WHERE dni = ? and estado = 1";
        PreparedStatement ps = null;
        //JOptionPane.showMessageDialog(null, dni);

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                bomber = new Bombero();
                bomber.setIdBombero(rs.getInt("idBombero"));
                bomber.setDni(rs.getString("dni"));  
                bomber.setNombreApellido(rs.getString("nombreApellido"));
                bomber.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                bomber.setCelular(rs.getString("celular"));
                bomber.setgSanguineo(rs.getString("gSanguineo"));
                bomber.setEstado(rs.getBoolean("estado"));

                int codbrig = rs.getInt("codBrigada");
                //JOptionPane.showMessageDialog(null, codbrig);
                Brigada brigada = bd.buscarBrigada(codbrig);
       
                // Asignar la brigada al bombero
                bomber.setBrigada(brigada);

            } else {
               // JOptionPane.showMessageDialog(null, "No existe un bombero con ese DNI");
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla bombero1");
        }

        return bomber;
    }

    public List<Bombero> listarBombero() {

        List<Bombero> bomberos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM bombero WHERE estado = 1";
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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero6" + ex.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return bomberos;
    }
    
    public boolean existeDni(String dni) { //metodo para verificar si exite el dni en la base de dato
        boolean existe = false;

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT idBombero FROM bombero WHERE dni = ? and estado = 1";
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();

            if (rs.next()) {

                existe = true; // Hay un registro con el mismo DNI y estado activo

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar el DNI en la base de datos: " + ex.getMessage());
        }

        return existe;
    }
    
    public int idBombero (String dni){
     String sql = "SELECT idBombero FROM bombero WHERE dni = ? and estado = 1";
     
     int idbom = 0;

        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
                if(rs.next()){
               idbom = rs.getInt("idBombero");
                }
            ps.close();
        
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error");
        }
        return idbom;
     }
    
    //metodo para contar bomberos en brigada....
    public int contarBomberosEnBrigada(int codBrigada) {
    int contar = 0;
    try {
        String sql = "SELECT COUNT(*) FROM bombero WHERE codBrigada = ? and estado = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, codBrigada);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            contar = rs.getInt(1);
        }
        ps.close();
        
    } catch (SQLException ex) {
        
        JOptionPane.showMessageDialog(null, "Error: "+ ex.getMessage());
    }
    return contar;
}

public int contarBomberosEnBrigadaExcluyendoBrigada(int codBrigada, int codBrigadaExcluir) {
    // Consulta SQL para contar bomberos en una brigada, excluyendo una brigada específica
    String sql = "SELECT COUNT(*) FROM bombero WHERE codBrigada = ? AND estado = 1 AND codBrigada != ?";
    PreparedStatement ps = null;

    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, codBrigada);
        ps.setInt(2, codBrigadaExcluir);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return rs.getInt(1);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al contar bomberos en la brigada: " + ex.getMessage());
    }

    return 0; // Si ocurre un error, retornamos 0.
}


}
