import calculos.CalculadoraDeTiempos;
import modelos.Pelicula;
import modelos.Serie;

import java.util.Scanner;

public class Principal {

    Pelicula peliculaUsuario = new Pelicula();
    Serie serieUsuario = new Serie();
    CalculadoraDeTiempos calculadoraDeTiempos = new CalculadoraDeTiempos();

    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        while (opcion != 9){
            String menu = """
                    Bienvenidos a Screenmatch
                    1)Registrar nueva pelicula
                    2)Registrar nueva serie
                    3)Calculadora de tiempos
                    9)Salir del menu
                    """;

            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la pelicula ");
                    String nombre =  teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento ");
                    int fechadDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos de la película");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();


                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechadDeLanzamiento);
                    peliculaUsuario.setDuracion(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la serie ");
                    String nombreS =  teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento ");
                    int fechadDeLanzamientoS = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos de cada capitulo ");
                    int duracionEnMinutosS = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese el numero de temporadas ");
                    int temporadasSeries = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese los capitulos por temporada ");
                    int capitulosTemporada = teclado.nextInt();
                    teclado.nextLine();


                    serieUsuario.setNombre(nombreS);
                    serieUsuario.setFechaDeLanzamiento(fechadDeLanzamientoS);
                    serieUsuario.setDuracionCapitulos(duracionEnMinutosS);
                    serieUsuario.setTemporadas(temporadasSeries);
                    serieUsuario.setEpisodiosPorTemporada(capitulosTemporada);
                    serieUsuario.muestraFichaTecnica();
                    break;

                case 3:

                    calculadoraDeTiempos.incluye(peliculaUsuario);
                    calculadoraDeTiempos.incluye(serieUsuario);
                    System.out.println("Tiempo que necesitas para maratonear tus titulos favoritos "+calculadoraDeTiempos.getTiempoTotal()+" minutos");
                    break;

                case 9:
                    System.out.println("Saliendo del menu");

                default:
                    break;
            }

        }
    }
}
