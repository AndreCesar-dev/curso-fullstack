import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o valor de x: ");
        int n1 = sc.nextInt();

        System.out.println("digite o valor de y: ");
        int n2 = sc.nextInt();

        System.out.println("digite o valor de z: ");
        int n3 = sc.nextInt();

        sc.close();

        double media = (n1 + n2 + n3)  / 2.0;

        System.out.printf("A media de x, y e z é: %.2f\n", media );
    }

}
