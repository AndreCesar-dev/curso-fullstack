package LacosRepeticao;

import java.util.Scanner;

public class RepeticaoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero positivo e maior que 0: ");
        double numero = sc.nextDouble();

        while (numero <=0) {
            System.out.println("Digite um numero positivo e maior que 0:");
            numero = sc.nextDouble();
        }
        System.out.println("O numero é valido.");
        sc.close();
    }

}
