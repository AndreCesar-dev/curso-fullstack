package ManipulacaoDeTexto;

import java.util.Scanner;

public class Ex03BuscaSobrenome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String aluno = sc.nextLine();

        boolean verificação = aluno.toLowerCase().contains("silva");

        if (verificação) {
            System.out.println("tem Silva");
        } else{
            System.out.println("nao tem Silva");
        }

        
        sc.close();
    }
}
