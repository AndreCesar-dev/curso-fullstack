import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o valor de x: ");
        int x = sc.nextInt();

        System.out.println("digite o valor de y: ");
        int y = sc.nextInt();

        System.out.println("digite o valor de z: ");
        int z = sc.nextInt();

        sc.close();

        double media = (x + y + z)  / 2.0;

        System.out.printf("A media de x, y e z é: %.2f\n", media );
    }

}
