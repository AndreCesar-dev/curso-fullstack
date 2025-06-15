import java.util.Scanner;
 
public class Ex05MaiorDeTres {
    public static void main(String[] args) {
        Scanner maiorMenor = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int n1 = maiorMenor.nextInt();

        System.out.println("digite o segundo numero: ");
        int n2 = maiorMenor.nextInt();

        System.out.println("digite o terceiro numero: ");
        int n3 = maiorMenor.nextInt();

        int maior = n1;
        int menor = n1;

        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;            
        }
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        System.out.println("maior numero: " + maior);
        System.out.println("menor numero: " + menor);

        maiorMenor.close();
    }
}
