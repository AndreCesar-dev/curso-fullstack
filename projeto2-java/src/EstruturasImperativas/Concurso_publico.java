package EstruturasImperativas;

import java.util.Scanner;

public class Concurso_publico {
    public static void main(String[] args) {
        Scanner concurso = new Scanner(System.in);

        System.out.println("Digite a quantidade de homens: ");
        int qtdhomens = concurso.nextInt();

        System.out.println("digite a quantidade de mulheres: ");
        int qtdmulher = concurso.nextInt();

        System.out.println("quantidade de ausentes: ");
        int qtdausentes = concurso.nextInt();

        concurso.close();

        int totalcandidatos = qtdausentes + qtdhomens + qtdmulher;
        double p1 = (double) qtdhomens / totalcandidatos * 100;
        double p2 = (double) qtdausentes / (qtdhomens+qtdmulher) *100;

        System.out.printf("P1: %.4f %%\n",p1);
        System.out.printf("P2: %.4f %%\n",p2);



    }
}
