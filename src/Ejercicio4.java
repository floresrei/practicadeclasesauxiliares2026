import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine().trim();

        // Buscamos el índice del último espacio en blanco
        int ultimoEspacio = frase.lastIndexOf(' ');

        if (ultimoEspacio != -1) {
            // Cortamos desde el inicio hasta el último espacio detectado
            String fraseModificada = frase.substring(0, ultimoEspacio);
            System.out.println("Frase modificada: " + fraseModificada);
        } else {
            // Si no hay espacios, significa que solo había una palabra
            System.out.println("La frase solo tenía una palabra, al eliminarla queda vacía.");
        }

        scanner.close();
    }
}
