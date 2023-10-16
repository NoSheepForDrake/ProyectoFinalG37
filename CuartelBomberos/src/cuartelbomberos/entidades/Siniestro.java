
package cuartelbomberos.entidades;

import java.time.LocalDate;

public class Siniestro {
    private int codigo;
    private String tipo;
    private LocalDate fechaSiniestro;
    private int coord_X;
    private int coord_Y;
    private String text;
    private LocalDate fechaResol;
    private int puntuacion;
    private int codBrigada;
    private boolean resuelto;
    private boolean activo;

    public Siniestro() {
    }

    public Siniestro(String tipo, LocalDate fechaSiniestro, int coord_X, int coord_Y, String text, LocalDate fechaResol, int puntuacion, int codBrigada, boolean resuelto, boolean activo) {
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.text = text;
        this.fechaResol = fechaResol;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
        this.resuelto = resuelto;
        this.activo = activo;
    }

    public Siniestro(int codigo, String tipo, LocalDate fechaSiniestro, int coord_X, int coord_Y, String text, LocalDate fechaResol, int puntuacion, int codBrigada, boolean resuelto, boolean activo) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.text = text;
        this.fechaResol = fechaResol;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
        this.resuelto = resuelto;
        this.activo = activo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaSiniestro() {
        return fechaSiniestro;
    }

    public void setFechaSiniestro(LocalDate fechaSiniestro) {
        this.fechaSiniestro = fechaSiniestro;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getFechaResol() {
        return fechaResol;
    }

    public void setFechaResol(LocalDate fechaResol) {
        this.fechaResol = fechaResol;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }
    
    public boolean getResuelto(){
        return resuelto;
    }
    
    public void setResuelto(boolean resuelto){
        this.resuelto = resuelto;
    }
    
    public boolean getActivo(){
        return activo;
    }
    
    public void setActivo(boolean activo){
        this.activo = activo;
    }
    
    @Override
    public String toString() {
        return tipo + "," + fechaSiniestro + "," + coord_X + "," + coord_Y + "," + text + "," + fechaResol + "," + puntuacion + "," + codBrigada + "," + resuelto + "," + activo;
    }
    
}
