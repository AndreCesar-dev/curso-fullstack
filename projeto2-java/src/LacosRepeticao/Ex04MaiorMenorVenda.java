package LacosRepeticao;

import java.util.Scanner;

public class Ex04MaiorMenorVenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        double maior;
        double menor;

        System.out.println("digite o valor da venda 1: ");
        double valor = sc.nextDouble();
        maior = valor;
        menor = valor;
        
        for (int i = 1; i < 10; i++) {
            System.out.println("digite o valor da venda " + (i + 1 ) + ": ");
             valor = sc.nextDouble();
            
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }
       /*  while (i < 10) {
            System.out.println("digite o valor da venda: ");
            valor = sc.nextDouble();
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
            i++;
        } */
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        sc.close();

    } 
    
}
