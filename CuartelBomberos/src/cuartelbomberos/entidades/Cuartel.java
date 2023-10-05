
package cuartelbomberos.entidades;

public class Cuartel {
    private int codCuartel;
    private String nombreCuartel;
    private String direccion;
    private int coord_X;
    private int coord_Y;
    private String telefono;
    private String correo;

    public Cuartel() {
    }

    public Cuartel(String nombreCuartel, String direccion, int coord_X, int coord_Y, String telefono, String correo) {
        this.nombreCuartel = nombreCuartel;
        this.direccion = direccion;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Cuartel(int codCuartel, String nombreCuartel, String direccion, int coord_X, int coord_Y, String telefono, String correo) {
        this.codCuartel = codCuartel;
        this.nombreCuartel = nombreCuartel;
        this.direccion = direccion;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getCodCuartel() {
        return codCuartel;
    }

    public void setCodCuartel(int codCuartel) {
        this.codCuartel = codCuartel;
    }

    public String getNombreCuartel() {
        return nombreCuartel;
    }

    public void setNombreCuartel(String nombreCuartel) {
        this.nombreCuartel = nombreCuartel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCoord_X() {
        return coord_X;
    }

    public void setCoord_X(int coord_X) {
        this.coord_X = coord_X;
    }

    public int getCoord_Y() {
        return coord_Y;
    }

    public void setCoord_Y(int coord_Y) {
        this.coord_Y = coord_Y;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return nombreCuartel + "," + direccion + "," + coord_X + "," + coord_Y + "," + telefono + "," + correo;
    }
    
    
    
    
}
