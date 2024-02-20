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

        // Caso Rua Francesa
        if (posicaoVirgula == 1) {

            // Extrair o nome da rua
            nomeRua = enderecoCompleto.substring(posicaoVirgula + 1).trim();

            // Extrair o número da rua
            numeroRua = enderecoCompleto.substring(0, posicaoVirgula).trim();

            // Imprimir resultado
            System.out.println("{\"" + nomeRua + "\", \"" + numeroRua + "\"}");

        }

        // Caso rua Espanhola com Vírgula
        if(posicaoVirgula != 1 && posicaoVirgula != -1) {

            int indiceNumero = 0;
            for (int i = 0; i < enderecoCompleto.length(); i++) {
                if (Character.isDigit(enderecoCompleto.charAt(i))) {
                    indiceNumero = i;
                    break;
                }
                nomeRua += enderecoCompleto.charAt(i);
            }

            for (int i = indiceNumero; i < enderecoCompleto.length(); i++) {
                numeroRua += enderecoCompleto.charAt(i);
            }

            // Remover espaço do nome da Rua
            nomeRua = nomeRua.trim();

            // Remover vírgula extra do nome da rua
            if (nomeRua.endsWith(",")) {
                nomeRua = nomeRua.substring(0, nomeRua.length() - 1);
            }

            // Exibição dos resultados
            System.out.println("{\"" + nomeRua + "\", \"" + numeroRua + "\"}");
        }

    }
}
