package EstruturasImperativas;

import java.util.Scanner;

public class Media_Aritmetica {
    
    public static void main(String[] args) {
        Scanner media = new Scanner(System.in);
      
        System.out.println("digite a nota1: ");
        double nota1 = media.nextDouble();

        System.out.println("digite a nota2: ");
        double nota2 = media.nextDouble();

        media.close();

        double mediafinal = (nota1 + nota2)/2;
        System.out.println("A media final do aluno foi igual a: " + mediafinal);


    }
}
