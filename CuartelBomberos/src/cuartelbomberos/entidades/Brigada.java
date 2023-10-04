
package cuartelbomberos.entidades;

public class Brigada {
    private int codBrigada;
    private String nombreBriga;
    private String especialidad;
    private boolean libre;
    private int nroCuartel;

    public Brigada() {
    }

    public Brigada(String nombreBriga, String especialidad, boolean libre, int nroCuartel) {
        this.nombreBriga = nombreBriga;
        this.especialidad = especialidad;
        this.libre = libre;
        this.nroCuartel = nroCuartel;
    }

    public Brigada(int codBrigada, String nombreBriga, String especialidad, boolean libre, int nroCuartel) {
        this.codBrigada = codBrigada;
        this.nombreBriga = nombreBriga;
        this.especialidad = especialidad;
        this.libre = libre;
        this.nroCuartel = nroCuartel;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public String getNombreBriga() {
        return nombreBriga;
    }

    public void setNombreBriga(String nombreBriga) {
        this.nombreBriga = nombreBriga;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public int getNroCuartel() {
        return nroCuartel;
    }

    public void setNroCuartel(int nroCuartel) {
        this.nroCuartel = nroCuartel;
    }

    @Override
    public String toString() {
        return nombreBriga + "," + especialidad + "," + libre + "," + nroCuartel;
    }
    
}
