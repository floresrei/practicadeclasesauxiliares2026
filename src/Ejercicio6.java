import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.next(); // Tomamos solo una palabra

        // Invertimos la palabra de forma sencilla
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();

        // Comparamos ignorando diferencias entre mayúsculas y minúsculas
        if (palabra.equalsIgnoreCase(palabraInvertida)) {
            System.out.println("La palabra '" + palabra + "' SÍ es palíndroma.");
        } else {
            System.out.println("La palabra '" + palabra + "' NO es palíndroma.");
        }

        scanner.close();
    }
}
