package EstruturasImperativas;

import java.util.Scanner;

public class Show {
    public static void main(String[] args) {
        Scanner show = new Scanner(System.in);

        System.out.println("valor hr: ");
        double valorHr = show.nextDouble();

        System.out.println("distancia km: ");
        double km = show.nextDouble();

        System.out.println("quantida de horas: ");
        double horas = show.nextDouble();

        show.close();

        double valorShow = valorHr*horas+km*50;
        double valorFrete = km*50.00*0.35;

        System.out.printf("valor do show: R$ %.2f\n",valorShow);
        System.out.printf("valor do frete: R$ %.2f\n",valorFrete);

    
    }
}
