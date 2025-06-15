import java.util.Scanner;

public class CalculadoraAvancada {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("digite o primeiro numero: ");
    double numero1 = sc.nextDouble();

    System.out.println("digite o segundo numero: ");
    double numero2 = sc.nextDouble();
     
    System.out.println("Escolha uma opção:");
    System.out.println("(1) para soma");
    System.out.println("(2) para subtração");
    System.out.println("(3) para multiplicação");
    System.out.println("(4) para divisao");
    int opção = sc.nextInt();

    double resultado = 0;

    switch (opção) {
        case 1:
            resultado = numero1 + numero2;
            break;
        case 2:
            resultado = numero1 - numero2;    
            break;
        case 3:
            resultado = numero1*numero2;
            break;
        case 4:
            resultado = numero1/numero2;        
        default:
        System.out.println("opção invalida");
            break;
    }   System.out.println("Resultado da operação: " + resultado);

    if (resultado >=0) {
        System.out.println("o numero é positivo.");            
        
    } else {
        System.out.println("o numero é negativo");
    }
    if (resultado % 2 == 0) {
        System.out.println("o numero é par");
    } else{
        System.out.println("o numero é impar");

    }
    sc.close();


}
}
