package EstruturasImperativas;

import java.util.Scanner;

public class Rendimento_carro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // ENTRADAS
        System.out.println("digite o modelo do seu carro: ");
        String modelo = entrada.nextLine();

        System.out.println("digite o ano do seu carro: ");
        int ano = entrada.nextInt();

        System.out.println("qual foi a distancia percorrida: ");
        double distancia = entrada.nextDouble();

        System.out.println("qual foi o consumo do seu carro: ");
        double consumo = entrada.nextDouble();

        entrada.close();
        
        // PROCESSAMENTO
        double rendimento = distancia / consumo;

        // SAIDA
        System.out.printf("o carro modelo %s do ano %d rende %.2f km/l \n", modelo, ano, rendimento);

    }
}
