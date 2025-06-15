package LacosRepeticao;

import java.util.Scanner;

public class Ex05CalculoDoLucro {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     /*    int i = 0; */
        double somaValorVEndas = 0;
        double somaValorCustos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("digite o valor da venda: ");
            double valorVenda = sc.nextDouble();
            
            somaValorVEndas += valorVenda;

            System.out.println("digite o valor do custo: ");
            double valorCusto = sc.nextDouble();

            somaValorCustos += valorCusto;
        }

       /*  while (i < 5) {
            System.out.println("digite o valor da venda: ");
            double valorVenda = sc.nextDouble();
            somaValorVEndas += valorVenda;
            
            System.out.println("digite o valor do custo: ");
            double ValorCusto = sc.nextDouble();
            somaValorCustos += ValorCusto;
            i++;
        }*/
        double lucro = somaValorVEndas - somaValorCustos;

        System.out.println("lucro nas vendas : " + lucro);

        sc.close();
            
        
        



    }
}
