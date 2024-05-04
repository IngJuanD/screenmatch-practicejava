package calculos;

import modelos.Titulo;

public class CalculadoraDeTiempos {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        tiempoTotal += titulo.getDuracion();

    }
}
