import java.util.Scanner;

public class Ex07ImpostoCasal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Renda do homem: ");
        double rendaHomem = sc.nextDouble();

        System.out.println("Renda mulher: ");
        double rendaMulher = sc.nextDouble();

        sc.close();
        double rendaConjunta = rendaHomem + rendaMulher;
        double aliquota;

        if (rendaConjunta <= 900) {
            aliquota = 0;
        } else if (rendaConjunta <= 1500) {
            aliquota = 0.10;
        } else if (rendaConjunta <= 2500) {
            aliquota = 0.15;
        } else {
            aliquota = 0.25;
        }
        double impostoRenda = rendaConjunta * aliquota;
        double rendaLiquida = rendaConjunta - impostoRenda;

        System.out.printf("Renda conjunta: %.2f\n",rendaConjunta);
        System.out.printf("percentual do Ir %.2f %%\n ",aliquota*100);
        System.out.printf("valor do IR: R$ %.2f\n",impostoRenda);
        System.out.printf("renda liquida: %.2f\n", rendaLiquida);


    }

}
