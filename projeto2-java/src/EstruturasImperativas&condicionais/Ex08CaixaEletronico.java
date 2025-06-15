import java.util.Scanner;

public class Ex08CaixaEletronico {
    public static void main(String[] args) {
        Scanner notas = new Scanner (System.in);

        System.out.println("digite o valor: ");
        int valor = notas.nextInt();
        int valorOriginal = valor;

        int nota100 = 0; int nota50 = 0; int nota20 = 0; int nota10 = 0; int nota5 = 0; int nota2 = 0; int nota1 = 0;

        if (valor >= 100) {
            nota100 = valor / 100;
            valor = valor % 100;
        } if (valor >= 50) {
            nota50 = valor / 50;
            valor = valor % 50;
        } if (valor >= 20) {
            nota20 = valor /20;
            valor = valor % 20;
        } if (valor >= 10) {
            nota10 = valor / 10;
            valor = valor % 10;
        } if (valor >= 5) {
            nota5 = valor / 5;
            valor = valor % 5;
        } if (valor >= 2) {
            nota2 = valor / 2;
            valor = valor % 2;
        } if (valor >= 1) {
            nota1 = valor;
        }
        System.out.println("o valor em real R$: " + valorOriginal);
        System.out.println("relação de notas necessarias: ");
        System.out.println( nota100 + " notas de R$: 100 "  );
        System.out.println( nota50 + " notas de R$: 50 " );
        System.out.println( nota20 + " notas de R$: 20 "  );
        System.out.println( nota10 + " notas de R$: 10 " );
        System.out.println( nota5 + " notas de R$: 5 "  );
        System.out.println( nota2 + " notas de R$: 2 "  );
        System.out.println( nota1 + " notas de R$: 1 "  );

        notas.close();
        
        
    }
}
