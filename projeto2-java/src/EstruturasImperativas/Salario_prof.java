package EstruturasImperativas;

import java.util.Scanner;

public class Salario_prof {
    public static void main(String[] args) {
        Scanner salariofinal = new Scanner(System.in);

        System.out.println("Digite a quantida de horas trabalhadas: ");
        double horas = salariofinal.nextDouble();

        System.out.println("Digite o valor da hora: ");
        double valor = salariofinal.nextDouble();
        
        salariofinal.close();

        double salario = horas*valor;

        System.out.printf("O salario do professor sera de: %.2f reais", salario);
    }
}
