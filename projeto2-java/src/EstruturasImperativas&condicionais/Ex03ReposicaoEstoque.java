import java.util.Scanner;

public class Ex03ReposicaoEstoque {
    public static void main(String[] args) {
        Scanner reposicao = new Scanner(System.in);

        System.out.println("quantidade no estoque: ");
        int qtd = reposicao.nextInt();

        reposicao.close();

        if (qtd < 10) {
            System.out.println("Estoque baixo, reabastecer.");
       
        } else if (qtd >= 10) {
            System.out.println("Estoque suficiente.");
        }
            
        
    }
}
