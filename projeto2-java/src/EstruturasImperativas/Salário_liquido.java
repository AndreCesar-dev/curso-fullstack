package EstruturasImperativas;

import java.util.Scanner;

public class Salário_liquido {
    
    public static void main(String[] args) {
        Scanner salario = new Scanner (System.in);

        System.out.println("Salário base: ");
        double salarioBase = salario.nextDouble();
    
        System.out.println("Vantagens: ");
        double vantagens = salario.nextDouble();

        System.out.println("Desconto: ");
        double desconto = salario.nextDouble();

        salario.close();

        double salarioLiquido = salarioBase + vantagens - desconto;

        System.err.printf(" Salário líquido é de R$ %.2f", salarioLiquido);
    
    }
}
