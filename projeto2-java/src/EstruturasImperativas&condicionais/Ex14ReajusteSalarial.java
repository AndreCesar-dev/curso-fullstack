import java.util.Scanner;

public class Ex14ReajusteSalarial {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner reajuste = new Scanner(System.in);

        System.out.println("Idade: ");
        int idade = reajuste.nextInt();
        reajuste.nextLine();

        System.out.println("Sexo: F (femenino) ou M (masculino): ");
        String sexo = reajuste.nextLine();
        
        System.out.println("Salário: ");
        double salario = reajuste.nextDouble();

        double percentual = 0;

        if (30 < idade) {
            if (sexo.equals("M") && salario <= 3000) {
                percentual = 30;
            } else if (sexo.equals("F")) {
                percentual = 50;
            
            }  
        } else if (30 >= idade) {
            if (sexo.equals("F")) {
                percentual = 40;
                
            } else if (sexo.equals("M")){
                percentual = 20;
            }
        }
        if (percentual > 0) {
            double aumento = salario * (percentual / 100);
            double novoSalario = salario + aumento;

            reajuste.close();

            System.out.printf("Novo salário: R$ %.2f (%.0f%%)", novoSalario, percentual);            
        } else {
            System.out.println("(0%) Não recebe aumento");
        }
    }
}
