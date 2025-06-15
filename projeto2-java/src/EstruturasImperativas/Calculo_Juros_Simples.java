package EstruturasImperativas;

import java.util.Scanner;

public class Calculo_Juros_Simples {

    public static void main(String[] args) {
        Scanner juros = new Scanner(System.in);

        System.out.println("Valor do emprestimo: ");
        double valorEmprestimo = juros.nextDouble();

        System.out.println("Quantidade de meses: ");
        int meses = juros.nextInt();

        juros.close();

        double jurosFinal = valorEmprestimo + (valorEmprestimo * (meses*0.05));
        System.out.printf("total a ser pago é de R$: %.2f",jurosFinal);
    }
}
                      
