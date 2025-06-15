package EstruturasImperativas;

import java.util.Scanner;

public class Promoção_loja {
    public static void main(String[] args) {
        Scanner promoçao = new Scanner(System.in);

        System.out.println("produto 1: ");
        double produto1 = promoçao.nextDouble();

        System.out.println("produto 2: ");
        double produto2 = promoçao.nextDouble();

        System.out.println("produto 3: ");
        double produto3 = promoçao.nextDouble();

        promoçao.close();

        double desconto = produto1 + produto2 + (produto3*0.5);

        System.out.printf("o valor da compra foi de R$: %.2f",desconto);

    }



}
