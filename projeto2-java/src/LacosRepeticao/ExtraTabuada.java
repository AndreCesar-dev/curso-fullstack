package LacosRepeticao;

import java.util.Scanner;

public class ExtraTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int numero = sc.nextInt();

        while (numero <= 0 || numero >= 10) {
            System.out.println("numero invalido. Digite novo numero: ");
            numero = sc.nextInt();
        }

        System.out.println("Qual tabuada voce deseja exibir, conforme as opçoes abaixo: \n");
        System.out.println("(1) para soma");
        System.out.println("(2) para subtração");
        System.out.println("(3) para multiplicaçao");
        System.out.println("(4) para divisao");
        int operacao = sc.nextInt();

        while (operacao < 1 || operacao > 4) {
            System.out.println("opção invalida. Digite novamente: ");
            operacao = sc.nextInt();
        }

        switch (operacao) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                 System.out.println(numero + " + " + i + " = " + (numero + i));
                }
                break;
            case 2:
                for (int i = 1; i <= 10; i++) {
                 System.out.println(numero + " - " + i + " = " + (numero - i));
                }
                break;
                
            case 3:
                for (int i = 1; i <= 10; i++) {
                 System.out.println(numero + " * " + i + " = " + (numero * i));
                }
                break;
            case 4: 
                for (int i = 1; i <= 10; i++) {
                 System.out.println(numero + " / " + i + " = " + (numero / i));
                }
                break;
                
        }
            sc.close();
    }
}
