package ManipulacaoDeTexto;

import java.util.Scanner;

public class Ex04GeradorSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // usuario digita a senha com no minimo 10 caracteres
        System.out.println("digite uma senha:");
        String senha = sc.nextLine();

        // se a senha for incorreta ele repete e pede uma nova senha.
        while (senha.length() < 10) {
            System.out.println("Senha invalida. Digite uma nova senha: ");
            senha = sc.nextLine();
            }
        // apos coletar senha correta realiza a operacao pra descobrir o tamanho da senha e dividir por 2
            int numeroCaracteres = senha.length();

            int indiceMeio = numeroCaracteres/2;
        // nesse trecho definimos a primeira parte da senha e a segunda parte    
            String primeiraParte= senha.substring(0, indiceMeio); // comeca no indice 0 e termina no indice do meio
            String segundaParte = senha.substring(indiceMeio); // pega o indice do meio ate o final

            String doisPrimeirosSegParte = segundaParte.substring(0, 2); // aqui definmos as duas primeiras strings para criar uma nova senha e termina no 2 OBS: o 2 nao esta incluso seria string [0,1,2[ 
            String tresUltimosPrimParte = primeiraParte.substring(primeiraParte.length()-3); // aqui definimos os tres ultimos digitos da string para criar nova senha 

            String senhaFinal = doisPrimeirosSegParte + "%%" + tresUltimosPrimParte; // aqui definimos a senha final 7

        // aqui imprimimos a saida do programa    
            System.out.println("parte 1: " + primeiraParte);
            System.out.println("parte 2: " + segundaParte);
            System.out.println("senha: " + senhaFinal);
            
        
        sc.close();
    }
}
