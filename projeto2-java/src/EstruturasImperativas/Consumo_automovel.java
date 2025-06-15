package EstruturasImperativas;

import java.util.Scanner;

public class Consumo_automovel {
    
    public static void main(String[] args) {
        
        Scanner consumo = new Scanner (System.in);
        
        System.out.println("Distancia: ");
        double distancia = consumo.nextDouble();

        System.out.println("Combustivel: ");
        double combustivel = consumo.nextDouble();

        consumo.close();
        
        double consumoFinal = distancia / combustivel;

        System.out.printf("O consumo médio do veículo é de %.3f km/l",consumoFinal);
    }
}
