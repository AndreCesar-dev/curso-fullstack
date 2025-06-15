import java.util.Scanner;

public class Ex04DescontoVendas {
    public static void main(String[] args) {
        Scanner desconto = new Scanner(System.in);

        System.out.println("valor da compra: ");
        double valorCompra = desconto.nextDouble();

        desconto.close();

        double descontoFinal = valorCompra - valorCompra*0.10; 

        if (valorCompra > 500) {
            System.out.printf("valor a pagar: R$: %.2f",descontoFinal);
        } else if (valorCompra <=500) {
            System.out.printf("intem nao tem desconto.");
            
        }

    }
}
