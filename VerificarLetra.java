import java.util.Scanner;

public class VerificarLetra {

    public static int contarOcorrenciasA(String texto) {
        int contador = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma string:");
        String texto = scanner.nextLine();
        scanner.close();

        int ocorrencias = contarOcorrenciasA(texto);

        if (ocorrencias > 0) {
            System.out.println("A letra 'a' aparece " + ocorrencias + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }
}

