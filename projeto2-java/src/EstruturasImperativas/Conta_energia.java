package EstruturasImperativas;

import java.util.Scanner;

public class Conta_energia {
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);

        System.out.println("valor salario minimo: ");
        double salariominimo = conta.nextDouble();

        System.out.println("quantidade de quilowhatt: ");
        double kw = conta.nextDouble();

        conta.close();

        double valorkw = salariominimo/1000;
        double valorConta = valorkw*kw;
        double desconto = valorConta - valorConta*0.15;

        System.out.printf("O valor em reais de cada kw é R$ %.3f \n",valorkw);
        System.out.printf("O valor da conta em reais é de: R$ %.2f \n",valorConta);
        System.out.printf("O valor da conta com desconta de 15%%: R$ %.2f \n",desconto);



    }
}
