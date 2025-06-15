package LacosRepeticao;

import java.util.Scanner;

public class Ex07InversorDeAlgoritmo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numeral com 4 digitos: ");
        int numero = sc.nextInt();

        //verificando se numero tem 4 digitos.
        if (numero < 1000 || numero > 9999) {
            System.out.println("numero invalido");
        } else{
            int invertido = 0;
            
            //fazendo a inversao do numero
            while (numero > 0) {
                int ultimoDigito = numero % 10; // pega o ultimo digito
                invertido = invertido * 10 + ultimoDigito; // constroi o numero invertido
                numero = numero / 10; // remove o ultimo digito
            }
            System.out.println("O numero invertido é: " + invertido);
        }
        sc.close();
        
    }
}
