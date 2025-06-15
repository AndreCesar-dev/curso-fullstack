import java.util.Scanner;

public class Ex12DefinicaoDeAnimais {
    public static void main(String[] args) {
        Scanner animal = new Scanner(System.in);

        System.out.println("Palavra 1 - vertebrado ou invertebrado: ");
        String palavra1 = animal.nextLine();

        System.out.println("Palavra 2 - ave , mamifero, inseto ou anelideo: ");
        String palavra2 = animal.nextLine();

        System.out.println("Palavra 3 - carnivoro, onivoro, hematofago ou herbivoro: ");
        String palavra3 = animal.nextLine();

        String definicao = "Animal não identificado";

        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    definicao = "Águia";
                } else if (palavra3.equals("onivoro")) {
                    definicao = "Pomba";
                }
            } else if (palavra2.equals("mamifero")) {
                if (palavra3.equals("onivoro")) {
                    definicao = "Homem";
                } else if (palavra3.equals("herbivoro")) {
                    definicao = "Vaca";
                }
            }
        } else if (palavra1.equals("invertebrado")) {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    definicao = "Pulga";
                } else if (palavra3.equals("herbivoro")) {
                    definicao = "Lagarta";
                }
            } else if (palavra2.equals("anelideo")) {
                if (palavra3.equals("hematofago")) {
                    definicao = "Sanguessuga";
                } else if (palavra3.equals("onivoro")) {
                    definicao = "Minhoca";

                }
            }
        }
        animal.close();

        System.out.println("O animal é: " + definicao);
    }

}