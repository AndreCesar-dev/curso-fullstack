package ManipulacaoDeTexto;

import java.util.Scanner;

public class Ex01QuantidadeDeLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdLetrasA = 0;

        for (int j = 0; j < 5; j++) {
            System.out.println("digite frase " +(j+1) + ":");
            String frase = sc.nextLine();

            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
                    qtdLetrasA++;
                }

            }
        }
        System.out.println("quantidade de letras a " + qtdLetrasA);

        sc.close();

        /*
         * char primeiroChar = frase.charAt(0);
         * 
         * System.out.println(primeiroChar);
         */

    }
}
