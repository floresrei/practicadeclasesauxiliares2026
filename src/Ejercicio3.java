import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        StringBuilder resultado = new StringBuilder();
        boolean capitalizarSiguiente = true;

        for (char c : cadena.toCharArray()) {
            if (Character.isWhitespace(c)) {
                resultado.append(c);
                capitalizarSiguiente = true; // El próximo carácter visible debe ser mayúscula
            } else if (capitalizarSiguiente) {
                resultado.append(Character.toUpperCase(c));
                capitalizarSiguiente = false;
            } else {
                resultado.append(c);
            }
        }

        System.out.println("Resultado: " + resultado.toString());

        scanner.close();
    }
}
