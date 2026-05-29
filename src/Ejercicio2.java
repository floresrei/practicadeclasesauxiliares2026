import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        // Reemplazamos todos los espacios en blanco por nada
        String sinEspacios = cadena.replace(" ", "");

        System.out.println("Texto sin espacios: " + sinEspacios);

        scanner.close();
    }
}