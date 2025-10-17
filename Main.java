 
import java.util.Scanner;

public class Main {

    /*
     * Polimorfismo: La capacidad de un objeto de una clase derivada
     * de ser tratado como un objeto de su clase base.
     * En este ejemplo, las clases Clasica, Pop y Rock
     * heredan de la clase base Musica y cada una implementa
     * el metodo reproducir y detener de manera diferente.
     * Esto permite que podamos usar una referencia de tipo Musica
     * para referirnos a objetos de cualquiera de las clases derivadas.
     * Cuando llamamos a los metodos reproducir y detener,
     * se ejecuta la version correspondiente a la clase real del objeto.
     * Esto es polimorfismo en accion.
     * 
     * El polimorfismo mejora la flexibilidad y mantenibilidad del codigo,
     * permitiendo que nuevas clases derivadas se integren facilmente   
     * en el sistema sin necesidad de modificar el codigo existente.
     * 
     * Con el scanner se puede elegir que tipo de musica reproducir
     * y se puede ampliar el programa para que reproduzca la musica 
     * segun la eleccion del usuario.
     * 
     * Ejemplo de entrada:
     * Elige el tipo de musica a reproducir:
     * 1. Clasica
     * 2. Pop
     * 3. Rock
     * OPCION: 2
     * Salida: "Reproduciendo pop: Shape of You de Ed Sheeran"
     * Que deseas hacer?
     * 1. Reproducir
     * 2. Detener
     * OPCION: 1
     * Salida: "Reproduciendo pop: Shape of You de Ed Sheeran"
     * OPCION: 2
     * Salida: "Deteniendo pop: Shape of You de Ed Sheeran"
     *  
     */


    public static void main(String[] args) {

       
        Scanner scanner = new Scanner(System.in);
       
        // Creamos las canciones
        Musica cancion1 = new Clasica("Claro de Luna", "Beethoven");
        Musica cancion2 = new Pop("Shape of You", "Ed Sheeran");
        Musica cancion3 = new Rock("Bohemian Rhapsody", "Queen");

        Musica seleccionada = null;

        // Loop hasta que el usuario elija una opcion valida.
        while (seleccionada ==null) {
            System.out.println("=== Reproductor de Musica ===");
            System.out.println("Elige el tipo de musica a reproducir:");
            System.out.println("1. Clasica");
            System.out.println("2. Pop");       
            System.out.println("3. Rock");
            System.out.print("OPCION: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Introduce un número entre 1 y 3.");
                scanner.next(); //para descartar una entrada invalida.
                continue;
            }
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    seleccionada = cancion1;
                    break;
                case 2:
                    seleccionada = cancion2;
                    break;
                case 3:
                    seleccionada = cancion3;
                    break;
                default:
                System.out.println("Opcion no valida, intenta nuevamente."); 
            }
        }
        
        // Pedimos al usuario que elija reproducir o detener
        while (true) {
            System.out.println("Que deseas hacer?");
            System.out.println("1. Reproducir");
            System.out.println("2. Detener");
            System.out.print("OPCION: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Introduce un número entre 1 y 3.");
                scanner.next(); //para descartar una entrada invalida.
                continue;
            }
            int accion = scanner.nextInt();
            switch (accion) {
                case 1:
                    seleccionada.reproducir();
                    scanner.close();
                    return;
                case 2:
                    seleccionada.detener();
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo");
            }
        
            scanner.close();
        }
    }

}



