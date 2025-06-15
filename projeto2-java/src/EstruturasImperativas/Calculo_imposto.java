package EstruturasImperativas;

import java.util.Scanner;

public class Calculo_imposto {

    public static void main(String[] args) {
        Scanner calculoImposto = new Scanner(System.in);

        System.out.println("Salario bruto: ");
        double salarioBruto = calculoImposto.nextDouble();

        calculoImposto.close();

        double valorIr = salarioBruto * 0.05;
        double valorInss = salarioBruto * 0.11;
        double desconto = valorIr + valorInss;
        double salarioLiquido = salarioBruto - desconto;

        System.out.printf("valor do Ir: %.2f\n",valorIr);
        System.out.printf("Valor do inss: %.2f\n",valorInss);
        System.out.printf("descontos: R$: %.2f\n",desconto);
        System.out.printf("salario liquido: R$: %.2f\n",salarioLiquido);
    }
}