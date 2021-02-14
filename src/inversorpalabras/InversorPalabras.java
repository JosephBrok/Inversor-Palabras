package inversorpalabras;
import java.util.Scanner;

/**
 *
 * @author José Ignacio Pérez Luis
 * Ejemplo basico de un programa que invierte las palabras desarrollado en NetBeans
 */
public class InversorPalabras {

    public static void main(String[] args) {

        String palabra = "";
        String palabraInvertida = "";
        int longitudPalabra = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa una palabra: ");
        palabra = entrada.nextLine();

        for (longitudPalabra = palabra.length(); longitudPalabra != 0; longitudPalabra--) {
            palabraInvertida += palabra.substring(longitudPalabra - 1, longitudPalabra);
        }

        System.out.println("Resultado de palabra: " + palabraInvertida);
        System.out.println("");

    }
}
