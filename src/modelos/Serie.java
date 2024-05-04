package modelos;

public class Serie extends Titulo{

    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionCapitulos;

    @Override
    public int getDuracion() {
        return duracionCapitulos*episodiosPorTemporada*temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracionCapitulos() {
        return duracionCapitulos;
    }

    public void setDuracionCapitulos(int duracionCapitulos) {
        this.duracionCapitulos = duracionCapitulos;
    }
}
