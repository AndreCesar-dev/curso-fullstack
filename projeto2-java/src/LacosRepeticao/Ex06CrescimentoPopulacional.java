package LacosRepeticao;

import java.util.Scanner;

public class Ex06CrescimentoPopulacional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a populacao do pais A: ");
        double popA = sc.nextDouble();
        System.out.println("digite a populacao do pais B: ");
        double popB = sc.nextDouble();

        int anos = 0;
        if (popA >= popB) {
            System.out.println("Erro populacao do pais A deve ser menor que do pais B.");
        } else {
            while (popA < popB) {
                popA += popA * 0.03;
                popB += popB * 0.015;
                anos++;
            }
        }

        System.out.println("serao necessarios " + anos
                + " anos para que a população do pais A ultrapasse ou iguale a população do pais B ");

                sc.close();

    }
}
