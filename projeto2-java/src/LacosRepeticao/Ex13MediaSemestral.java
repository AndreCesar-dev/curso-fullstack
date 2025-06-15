package LacosRepeticao;

import java.util.Scanner;

public class Ex13MediaSemestral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a nota 1: ");
        double nota1 = sc.nextDouble();

        while (nota1 < 0 || nota1 > 10) {
            System.out.println("nota invalida");
            
            System.out.println("digite a nota 1:");
             nota1 = sc.nextDouble();
        }
        System.out.println("digite nota 2: ");
        double nota2 = sc.nextDouble();

        while (nota2 < 0 || nota2 > 10) {
            System.out.println(" nota invalida ");

            System.out.println("digite a nota 2: ");
            nota2 = sc.nextDouble();
        }
        sc.close();

        double media = (nota1 + nota2)/2; 
        System.out.printf("A media do aluno é: %.2f",media);

    }
}
