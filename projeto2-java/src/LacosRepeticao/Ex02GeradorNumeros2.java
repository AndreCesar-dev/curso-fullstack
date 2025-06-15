package LacosRepeticao;

import java.util.Scanner;

public class Ex02GeradorNumeros2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int valor = sc.nextInt();
        for (int i = 0; i < 6; i++) {
            valor++;
            System.out.println(valor);
        }
        /*
         * //inciaalizando o contador
         * int i = 0;
         * // criterio de parada
         * while ( i < 6) {
         * valor ++;
         * System.out.println(valor);
         * //atualizando o contador
         * i++;
         * }
         */
        sc.close();
    }
}
