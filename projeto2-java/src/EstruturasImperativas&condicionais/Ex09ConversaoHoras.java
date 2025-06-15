import java.util.Scanner;

public class Ex09ConversaoHoras {
    public static void main(String[] args) {
        Scanner conversor = new Scanner(System.in);

        System.out.println("digite a qtd de segundos: ");
        int qtdSegundos = conversor.nextInt();

        int hora = qtdSegundos / 3600;
        int resto = qtdSegundos % 3600;
        int minuto = resto / 60;
        int segundos = resto % 60;

        if (qtdSegundos >= 3600) {
            hora = qtdSegundos / 3600;
            resto = qtdSegundos % 3600;

        }
        if (qtdSegundos >= 60) {
            minuto = resto / 60;
            resto = qtdSegundos % 60;
        }
        if (qtdSegundos >= 1) {
            segundos = resto;
        }

        System.out.printf("HH:MM:SS %02d:%02d:%02d", hora, minuto, segundos);

        conversor.close();

    }
}
