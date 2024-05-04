package modelos;

public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnPlanBasico;
    private int duracion;
    private String sipnosis;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public boolean isIncluidoEnPlanBasico() {
        return incluidoEnPlanBasico;
    }

    public void setIncluidoEnPlanBasico(boolean incluidoEnPlanBasico) {
        this.incluidoEnPlanBasico = incluidoEnPlanBasico;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public void muestraFichaTecnica(){
        System.out.println("*** FICHA TÉCNICA***");
        System.out.println("Nombre del título: "+nombre);
        System.out.println("Fecha de lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Tiempo de duración: "+getDuracion()+" minutos \n");

    }
}
