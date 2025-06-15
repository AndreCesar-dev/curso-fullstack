package EstruturasImperativas;

import java.util.Scanner;

public class Calculadora_Imc {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Altura: ");
        double altura = sc.nextDouble();

        System.out.println("Digite o seu Peso: ");
        double peso = sc.nextDouble();

        sc.close();

        double imc = peso / (altura * altura);

        //System.out.println("O seu imc é igual a: " + imc);
        System.out.printf("IMC = %.2f" , imc);


    }
}
