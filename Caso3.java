import java.util.Scanner;


public class Caso3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o endereço completo: ");
        String enderecoCompleto = scanner.nextLine();

        // Encontrar a primeira vírgula
        int posicaoVirgula = enderecoCompleto.indexOf(',');

        // Encontrar o primeiro espaço
        int posicaoEspaco = enderecoCompleto.indexOf(' ');

        String numeroRua = "";
        String nomeRua = "";

        // Caso Rua Americana
            if(posicaoVirgula == -1) {

                // Extrair o número da rua
                if (posicaoEspaco > 0) {
                    numeroRua = enderecoCompleto.substring(0, posicaoEspaco).trim();
                }

                // Extrair o nome da rua
                if (posicaoEspaco > 0) {
                    nomeRua = enderecoCompleto.substring(posicaoEspaco + 1).trim();
                }

                // Imprimir resultado
                System.out.println("{\"" + nomeRua + "\", \"" + numeroRua + "\"}");
            }

    }
}
