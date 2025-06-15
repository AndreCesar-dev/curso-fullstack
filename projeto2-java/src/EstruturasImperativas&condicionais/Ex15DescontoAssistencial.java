import java.util.Scanner;

public class Ex15DescontoAssistencial {
    public static void main(String[] args) {
        Scanner desconto = new Scanner(System.in);

        System.out.println("bairro (S: Santa Ana; I: Industriários; T: Tabatinga):  ");
        String bairro = desconto.nextLine().toUpperCase().trim();

        System.out.println("renda familiar: ");
        double rendaFamilia = desconto.nextDouble();

        System.out.println("consumo de energia R$: ");
        double consumo = desconto.nextDouble();

        double valor = 0;
        desconto.close();

        if (!(bairro.equals("S") || bairro.equals("I") || bairro.equals("T"))) {
            System.out.println("bairro invalido");
            return;
        }
        if (rendaFamilia < 0 || consumo < 0) {
            System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
            return;
        }

        if (bairro.equals("S") && rendaFamilia >= 50 && rendaFamilia <= 500) {
            valor = consumo - 50;
            System.out.println("Valor a pagar: R$ " + valor);
        } else if (rendaFamilia > 500 && rendaFamilia <= 1000) {
            valor = consumo - 25;
            System.out.println("valor a pagar: R$ " + valor);
        }
        if (bairro.equals("I") && rendaFamilia >= 240 && rendaFamilia <= 1000) {
            valor = consumo - 240;
            System.out.println("Valor a pagar: R$ " + valor);
        } else if (rendaFamilia > 1000 && rendaFamilia <= 5000) {
            valor = consumo - 120;
            System.out.println("valor a pagar: R$ " + valor);
        }
        if (bairro.equals("T") && rendaFamilia >= 5000 && rendaFamilia <= 10000) {
            valor = consumo - 720;
            System.out.println("Valor a pagar: R$ " + valor);
        } else if (rendaFamilia > 10000 && rendaFamilia <= 20000) {
            valor = consumo - 360;
            System.out.println("valor a pagar: R$ " + valor);
        }

    }
}
