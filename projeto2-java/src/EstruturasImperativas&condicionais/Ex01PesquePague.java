import java.util.Scanner;

public class Ex01PesquePague {
    
    public static void main(String[] args) {
        
        Scanner peso = new Scanner(System.in);

        System.out.println("Peso dos peixes: ");
        double pesoPeixe = peso.nextDouble();

        peso.close();

        if (pesoPeixe > 50) {
            double excesso = pesoPeixe - 50;
            double multa = excesso * 4;
            
            System.out.printf("Excesso do peso: %.2f kg\n",excesso);
            System.out.printf("multa: R$ %.2f ",multa);

            
        } 
            else{
                System.out.println("peso ok!");
            }
    }
}
