import java.util.Scanner;

public class ExExtraImc {
    public static void main(String[] args) {
        
        Scanner imc = new Scanner(System.in);
        
        System.out.println("digite seu peso: ");
        double peso = imc.nextDouble();

        System.out.println("digite sua altura: ");
        double altura = imc.nextDouble();

        double imcFinal = peso / (altura * altura);

        if (imcFinal < 20) {
            System.out.println("abaixo do peso");
        } else if (imcFinal >= 20 && imcFinal < 25) {
            System.out.println("peso normal");
        } else if (imcFinal >= 25 && imcFinal < 30) {
            System.out.println("Sobrepeso");
        } else if (imcFinal >= 30 && imcFinal < 40) {
            System.out.println("obeso");
        } else{
            System.out.println("obesidade morbida");
        }

         imc.close();

    }
}
