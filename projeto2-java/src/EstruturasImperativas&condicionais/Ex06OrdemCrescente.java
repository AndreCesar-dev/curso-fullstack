import java.util.Scanner;

public class Ex06OrdemCrescente {
    public static void main(String[] args) {
        Scanner ordem = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int a = ordem.nextInt();

        System.out.println("digite o segundo numero: ");
        int b = ordem.nextInt();

        System.out.println("digite o terceiro numero: ");
        int c = ordem.nextInt();

        int menor, meio, maior;

        if (a <= b && a <= c) {
            menor = a;

            if (b <= c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }

        } else if (b <= a && b <= c) {
            menor = b;

            if (a <= c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a <= b ) {
                meio = a;
                maior = b;
            } else{
                meio = b;
                maior = a;
            }
        } 



            System.out.println("ordem crescente: " + menor + " , " + meio + " , " + maior);

            ordem.close();

    }
}
