package LacosRepeticao;

import java.util.Scanner;

public class Hackathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o valor total de compras no mes: ");
        double totalCompras = sc.nextDouble();
        System.out.println("digite o numero total de compras realizadas no mes: ");
        int qtdCompras = sc.nextInt();

        int fidelidade = 0;

        if (totalCompras >= 10) {
            fidelidade = (int) totalCompras / 10;
        }
        if (qtdCompras >= 5) {
            fidelidade += 50;
        } 
        
         if (totalCompras >= 500) {
                fidelidade = fidelidade + 100;
            }
            System.out.println("total de compras no mes: " + totalCompras );
            System.out.println("numero de compras: " + qtdCompras);
            System.out.println("total de pontos é : " + fidelidade);

        if (fidelidade <= 100) {
            System.out.println("Categoria Bronze \nMensagem: Parabens! voce alcançou a categoria bronze este mes!");
        } else if (fidelidade <= 300) {
            System.out.println("Categoria Prata \nMensagem: Parabens! voce alcançou a categoria prata este mes!" );
        }else if (fidelidade <= 500) {
            System.out.println("Categoria Ouro \nMensagem: Parabens! voce alcançou a categoria ouro este mes!");
        } else {
            System.out.println("Categoria Diamante \nMensagem: Parabens! voce alcançou a categoria diamente este mes!");
        }
        sc.close();

    }
}
