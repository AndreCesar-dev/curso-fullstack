package LacosRepeticao;

import java.util.Scanner;

public class Ex03TicketMedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;

      /*   System.out.println("digite o valor do ticket: ");
        double valor = sc.nextDouble();*/
        for (int i = 0; i < 7; i++) {
            System.out.println("digite o valor do ticket " + (i + 1) + ":");
            double valor = sc.nextDouble();
            soma += valor;
        }
    /*    int i = 0;
        double soma = 0;

        while (i < 7) {
            System.out.println("digite o valor do ticket: ");
            double valor = sc.nextDouble();
            soma = soma + valor;
            i++;
    } */ 
    double media = soma / 7; 
     System.out.println("total de vendas: " + soma);
     System.out.printf("ticket medio: %.2f", media );
     sc.close();
} 


}

