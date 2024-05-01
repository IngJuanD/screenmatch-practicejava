import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inmersión Java!");

        //Declaracion de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion= 4.5;
        boolean incluidoPlanBasico = true;
        String nombre = "Matrix";
        String sipnosis = """
                Película catalogada como la mejor del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;

        //Impresiones
        System.out.println("Pelicula: "+nombre);
        System.out.println("Fecha de lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Esta incluida en el plan basico: "+incluidoPlanBasico);
        System.out.println("Descripcion: "+sipnosis);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula popular en el momento");
        }else{
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese la nota que le darías a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }

        System.out.println("La media de la película matrix calculada por el usuario es:  "+mediaEvaluacionUsuario/3);
    }
}