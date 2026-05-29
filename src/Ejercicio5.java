import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        int contadorA = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letraActual = frase.charAt(i);
            // Comparamos si es 'a' o 'A' (con y sin tilde)
            if (letraActual == 'a' || letraActual == 'A' || letraActual == 'á' || letraActual == 'Á') {
                contadorA++;
            }
        }

        System.out.println("La vocal 'A' aparece " + contadorA + " veces.");

        scanner.close();
    }
}
