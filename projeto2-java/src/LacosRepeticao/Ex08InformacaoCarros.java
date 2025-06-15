package LacosRepeticao;

import java.util.Scanner;

public class Ex08InformacaoCarros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int grupo = 1; grupo <= 4; grupo++) {
            System.out.println("Grupo" + grupo + ":");

            int carroMaisNovo = 0;
            int carroMaisRapido = 0;
            int somaVelocidade = 0;

            for (int carro = 1; carro <= 3; carro++) {
                System.out.println("Digite o ano do carro " + carro + ":");
                int ano = sc.nextInt();
                System.out.println("Digite a velocidade do carro " + carro + ":");
                int velocidade = sc.nextInt();

                if (carro == 1 || ano > carroMaisNovo) {
                    carroMaisNovo = ano;
                }
                if (carro == 1 || velocidade > carroMaisRapido) {
                    carroMaisRapido = velocidade;
                }
                somaVelocidade = somaVelocidade + velocidade;

            }

            double medidavelocidade = somaVelocidade / 3;
            System.err.println("Ano do carro mais novo: " + carroMaisNovo);
            System.out.println("velocidade do mais rapido: " + carroMaisRapido + "km/h");
            System.out.printf("A velocidade media: %.2f km/h\n ", medidavelocidade);
           
        }
        sc.close();

        /*
         * Scanner scanner = new Scanner(System.in);
         * 
         * 
         * // Repetir o processo 4 vezes (para os 4 grupos)
         * for (int grupo = 1; grupo <= 4; grupo++) {
         * System.out.println("Grupo " + grupo + ":");
         * 
         * // Variáveis para armazenar o ano mais novo e a maior velocidade
         * int anoMaisNovo = 0;
         * int maiorVelocidade = 0;
         * int somaVelocidade = 0;
         * 
         * // Ler dados de 3 carros
         * for (int carro = 1; carro <= 3; carro++) {
         * System.out.print("Digite o ano do carro " + carro + ": ");
         * int ano = scanner.nextInt();
         * 
         * System.out.print("Digite a velocidade do carro " + carro + ": ");
         * int velocidade = scanner.nextInt();
         * 
         * // Atualiza o ano mais novo
         * if (carro == 1 || ano > anoMaisNovo) {
         * anoMaisNovo = ano;
         * }
         * 
         * // Atualiza a maior velocidade
         * if (carro == 1 || velocidade > maiorVelocidade) {
         * maiorVelocidade = velocidade;
         * }
         * 
         * // Acumula a velocidade para calcular a média depois
         * somaVelocidade += velocidade;
         * }
         * 
         * // Calcula a média das velocidades
         * double mediaVelocidade = somaVelocidade / 3.0;
         * 
         * // Mostra os resultados do grupo
         * System.out.println("Ano do carro mais novo: " + anoMaisNovo);
         * System.out.println("Maior velocidade: " + maiorVelocidade + " km/h");
         * System.out.printf("Velocidade média: %.2f km/h\n", mediaVelocidade);
         * System.out.println(); // linha em branco entre grupos
         * }
         * 
         * scanner.close();
         */
    }
}
