package LacosRepeticao;

import java.util.Scanner;

public class Ex12MedicaoGlicose {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double soma = 0;

         for (int i = 0; i < 4; i++) {
            System.out.println("digite o valor da glicose " + (i+1) + ": ");
            double valor1 = sc.nextDouble();
            if (valor1 < 110) {
                System.out.println("normal."  );
            } else if ( valor1 <= 125) {
                System.out.println("alterada");
            } else{
                System.err.println("muito alta");
            }
            soma += valor1;
         }
         double media = soma/4;

         System.out.printf("media das leituras: %.2f\n" , media);
         sc.close();
    }
}
