
package cuartelbomberos.entidades;

public class Brigada {
    private int codBrigada;
    private String nombreBriga;
    private String especialidad;
    private boolean libre;
    private Cuartel cuartel;

    public Brigada() {
    }

    public Brigada(String nombreBriga, String especialidad, boolean libre, Cuartel cuartel) {
        this.nombreBriga = nombreBriga;
        this.especialidad = especialidad;
        this.libre = libre;
        this.cuartel = cuartel;
    }

    public Brigada(int codBrigada, String nombreBriga, String especialidad, boolean libre, Cuartel cuartel) {
        this.codBrigada = codBrigada;
        this.nombreBriga = nombreBriga;
        this.especialidad = especialidad;
        this.libre = libre;
        this.cuartel = cuartel;
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

    public Cuartel getCuartel() {
        return cuartel;
    }

    public void setCuartel(Cuartel cuartel) {
        this.cuartel = cuartel;
    }

    @Override
    public String toString() {
        return nombreBriga + "," + especialidad + "," + libre + "," + cuartel.getCodCuartel();
    }
    
}
