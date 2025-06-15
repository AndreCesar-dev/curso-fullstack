package EstruturasImperativas;

import java.util.Scanner;

public class Rateio {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de apartamentos: ");
        int apartamentos = sc.nextInt();

        System.out.println("Valor da conta de energia: ");
        double contaEnergia = sc.nextDouble();

        System.out.println("Valor da conta de agua: ");
        double contaAgua = sc.nextDouble();

        sc.close();

        double rateio = (contaEnergia + contaAgua)/apartamentos;
        System.out.printf("o valor total que cada apartamento deve pagar é de %.2f reais.",rateio);


    }
}
