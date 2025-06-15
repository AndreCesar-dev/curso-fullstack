package EstruturasImperativas;

import java.util.Scanner;

public class Reajuste_preço {
    
    public static void main(String[] args) {
        Scanner Reajuste = new Scanner (System.in);

        System.out.println("Nome do curso: ");
        String curso = Reajuste.nextLine();

        System.out.println("Valor atual: ");
        double valor = Reajuste.nextDouble();

        Reajuste.close();

        double novo_valor = valor+valor*(7.5/100);
        
        System.out.printf("O curso %s custa %.2f apos o reajuste.",curso,novo_valor);





    }

}
