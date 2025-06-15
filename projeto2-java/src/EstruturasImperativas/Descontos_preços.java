package EstruturasImperativas;

import java.util.Scanner;

public class Descontos_preços {

    public static void main(String[] args) {
        Scanner promoção = new Scanner (System.in);

        System.out.println("nome do produto: ");
        String produto = promoção.nextLine();

        System.out.println("valor do produto: ");
        double valor = promoção.nextDouble();

        promoção.close();
        
        double desconto = valor-valor*(4.5/100);

        System.out.printf("O valor promocional do %sserá de %.2f",produto,desconto);





    }

    
}
