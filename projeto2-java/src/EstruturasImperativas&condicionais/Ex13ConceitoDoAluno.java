import java.util.Scanner;

public class Ex13ConceitoDoAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double notaAluno = sc.nextDouble();
        char conceito = ' ';

        if (notaAluno >= 9) {
            conceito = 'A';
        } else if (notaAluno >= 8 && notaAluno < 9) {
            conceito = 'B';
        } else if (notaAluno >= 7 && notaAluno < 8) {
            conceito = 'C';
        } else {
            conceito = 'D';
        }

        System.out.println("conceito: " + conceito);

        switch (conceito) {
            case 'A':
                System.out.println("parabens");
                break;
            case 'B':
                System.out.println("muito bem.");
                break;
            case 'C':
                System.out.println("quase la...");
                break;
            default:
                System.out.println("lascou-se.");
                break;
        }

        sc.close();

    }
}
