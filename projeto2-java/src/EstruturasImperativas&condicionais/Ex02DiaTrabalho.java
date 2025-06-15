import java.util.Scanner;

public class Ex02DiaTrabalho {
    public static void main(String[] args) {
        Scanner aumento = new Scanner(System.in);

        System.out.println("valor salario: ");
        double salario = aumento.nextDouble();

        double nvsalario;

        aumento.close();

        if (salario < 1100 ) {
            
            // salario *= 1.10

            nvsalario = salario + (salario * 0.10);
            System.out.printf("Aumento de 10%% \nnovo salario: R$ %.2f ",nvsalario);
            
        
        } else if (salario <=2000) {
            nvsalario = salario + (salario*0.07);
            System.out.printf("Aumento de 7%% \nnovo salario: R$ %.2f ",nvsalario);
            
        } else {
            nvsalario = salario + (salario*0.05);
            System.out.printf("Aumento de 5%%\nnovo salario: R$ %.2f ",nvsalario);
        }
            
        }

    }

