
package cuartelbomberos.entidades;

import java.time.LocalDate;

public class Bombero {
    private int idBombero;
    private String dni;
    private String nombreApellido;
    private LocalDate fechaNac;
    private String celular;
    private Brigada brigada;
    private String gSanguineo;

    public Bombero() {
    }

    public Bombero(String dni, String nombreApellido, LocalDate fechaNac, String celular, Brigada brigada, String gSanguineo) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.brigada = brigada;
        this.gSanguineo = gSanguineo;
    }

    public Bombero(int idBombero, String dni, String nombreApellido, LocalDate fechaNac, String celular, Brigada brigada, String gSanguineo) {
        this.idBombero = idBombero;
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.brigada = brigada;
        this.gSanguineo = gSanguineo;
    }

    public int getIdBombero() {
        return idBombero;
    }

    public void setIdBombero(int idBombero) {
        this.idBombero = idBombero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Brigada getbrigada() {
        return brigada;
    }

    public void setCodBrigada(Brigada brigada) {
        this.brigada = brigada;
    }

    public String getgSanguineo() {
        return gSanguineo;
    }

    public void setgSanguineo(String gSanguineo) {
        this.gSanguineo = gSanguineo;
    }

    @Override
    public String toString() {
        return  dni + "," + nombreApellido + "," + fechaNac + "," + celular + "," + brigada.getNombreBriga() + "," + gSanguineo;
    }
    
}
