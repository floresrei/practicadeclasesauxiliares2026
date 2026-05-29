import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] academlo) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine().trim();

        // Si la frase está vacía, la cantidad de palabras es 0
        if (frase.isEmpty()) {
            System.out.println("La frase contiene 0 palabras.");
        } else {
            // Dividimos la cadena por uno o más espacios en blanco
            String[] palabras = frase.split("\\s+");
            System.out.println("La frase contiene " + palabras.length + " palabras.");
        }

        scanner.close();
    }
}
