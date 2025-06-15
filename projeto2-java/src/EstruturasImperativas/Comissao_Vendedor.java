package EstruturasImperativas;

import java.util.Scanner;

public class Comissao_Vendedor {
    
    public static void main(String[] args) {
        
        Scanner comissao = new Scanner(System.in);

        System.out.println("Valor do salario: ");
        double salario = comissao.nextDouble();

        System.out.println("Total de vendas realizadas: ");
        double vendas = comissao.nextDouble();

        comissao.close();

        double comissaoFinal = salario + (vendas *15/100);

        System.out.printf("O salario do vendedor com comissao ficou no total de %.2f Reais",comissaoFinal);

    }
}
