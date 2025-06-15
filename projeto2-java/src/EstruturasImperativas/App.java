package EstruturasImperativas;

//criação da classe.


public class App {

    public static void main(String[] args) {
        System.out.println("Ola mundo, André César programador chegando ai!!");

        // declaracao de variaveis

        int idade = 31;
        double altura = 1.80;

        double produto = idade * altura;
        String mensagem = "Idade x Altura = " + produto;

        System.out.println("O valor final do produto é : " + mensagem);

        // resolvendo a lista de exercicios ESTRUTURAS IMPERATIVAS

        // EX01 - Calculadora

        double n1 = 5;
        double n2 = 10;
        double soma = n1 + n2;
        double subtração = n1 - n2;
        double multiplicação = n1 * n2;
        double divisão = n1 / n2;
        
        System.out.println("o valor das 4 operações com os numero 05 e 10 sao: ");
        System.out.println("soma = "+soma);
        System.out.println( "subtração = "+ subtração);
        System.out.println( "multiplicação = "+ multiplicação);
        System.out.println( "divisão = "+ divisão);

        

    }
}
