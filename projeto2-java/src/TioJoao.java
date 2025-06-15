public class TioJoao {
    public static void main(String[] args) {
        
        double valorDia = 0.01;
        double total = 0.0;

        for (int dia = 1; dia <= 31; dia++) {
            System.out.printf("Dia %2d: R$: %.2f\n", dia, valorDia);
            total += valorDia;
            valorDia *= 2;
        }
        System.out.printf("O total acumulado apos 31 dias é: %.2f" , total);
    }
}
