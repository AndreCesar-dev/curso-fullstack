import java.util.Scanner;

public class Ex10ConversaoAnoMesDia {
    public static void main(String[] args) {
        Scanner conversao = new Scanner(System.in);

        System.out.println("Quantidade de dias: ");
        int qtdDias = conversao.nextInt();

        int ano = qtdDias / 365;
        int resto = qtdDias % 365;
        int mes = resto / 30;
        int dias = resto % 30;

        conversao.close();

        System.out.println( ano + " ano (s)\n" + mes + " mês (es)\n" +dias+ " dia (s)"); 

    }
}
