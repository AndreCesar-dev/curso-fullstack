package LacosRepeticao;

import java.util.Scanner;

public class ExtraSomaNumerosIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("digite o primeiro numero: ");
            int numero1 = sc.nextInt();

            System.out.println("digite o segundo numero: ");
            int numero2 = sc.nextInt();

            int menorNumero = Math.min(numero1, numero2);
            int maiorNumero = Math.max(numero1, numero2);
            int soma = 0;

            for (int j = menorNumero; j <= maiorNumero; j++) {
                System.out.print(j + " ");
                soma += j;
            }

            System.out.println("soma = " + soma);
        }
        sc.close();
    }
}
