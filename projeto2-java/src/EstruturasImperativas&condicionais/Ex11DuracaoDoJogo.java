import java.util.Scanner;

public class Ex11DuracaoDoJogo {
    public static void main(String[] args) {
        Scanner duracao = new Scanner(System.in);

        System.out.println("Hora inicial: ");
        int hrInicial = duracao.nextInt();

        System.out.println("Hora final: ");
        int hrFinal = duracao.nextInt();

        int duracaoJogo;

        if (hrFinal >= hrInicial) {
            duracaoJogo = hrFinal - hrInicial;
        }else {
            duracaoJogo = (24 - hrInicial) + hrFinal;
        }

        duracao.close();

        System.out.println("O Jogo durou: " +duracaoJogo+ "h");
    }
}
