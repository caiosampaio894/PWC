import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fluxo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Leitura do endereço completo
        System.out.println("Digite o endereço completo: ");
        String enderecoCompleto = scanner.nextLine();

        // Extração do nome da rua
        String nomeRua = "";
        int indiceNumero = 0;
        for (int i = 0; i < enderecoCompleto.length(); i++) {
            if (Character.isDigit(enderecoCompleto.charAt(i))) {
                indiceNumero = i;
                break;
            }
            nomeRua += enderecoCompleto.charAt(i);
        }

        // Extração do número da rua
        String numeroRua = "";
        for (int i = indiceNumero; i < enderecoCompleto.length(); i++) {
            numeroRua += enderecoCompleto.charAt(i);
        }

        // Exibição dos resultados
        System.out.println("Nome da rua: " + nomeRua);
        System.out.println("Número da rua: " + numeroRua);
    }

}