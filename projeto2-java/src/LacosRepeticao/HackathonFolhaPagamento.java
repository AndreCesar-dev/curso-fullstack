package LacosRepeticao;

import java.util.Scanner;

public class HackathonFolhaPagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdCalculos =0;

        while (true) {
            System.out.println("digite o nome do funcionario: ");
            String nome = sc.nextLine();

            System.out.println("digite o cargo: ");
            System.out.println("(1) - estagiario ");
            System.out.println("(2) - junior ");
            System.out.println("(3) - pleno ");
            System.out.println("(4) - senior ");
            int codCargo = sc.nextInt();

            System.out.println("digite o salario bruto: ");
            double salarioBruto = sc.nextDouble();
            sc.nextLine();

            String nomeCargo = " ";
            double descontoInss = 0;
            double descontoIR = 0;

            switch (codCargo) {
                case 1:
                    nomeCargo = "Estagiario";
                    descontoInss = 0.05 * salarioBruto;
                    descontoIR = 0;
                    break;
                case 2:
                    nomeCargo = "Junior";
                    descontoInss = 0.07 * salarioBruto;
                    descontoIR = 0.02*salarioBruto;
                    break;
                case 3:
                    nomeCargo = "Pleno";
                    descontoInss = 0.09 * salarioBruto;
                    descontoIR = 0.05*salarioBruto;
                    break;
                case 4:
                    nomeCargo = "Senior";
                    descontoInss = 0.11 * salarioBruto;
                    descontoIR = 0.07*salarioBruto;
                    break;
            
                default:
                System.out.println("opção invalida. Digite novamente: ");
                    continue;
            }
            qtdCalculos++;

            System.out.printf("=== Holerite ===\n");
            System.out.printf("Nome: %s\n", nome);
            System.out.printf("Cargo: %s\n", nomeCargo);
            System.out.printf("Salario bruto: %.2f\n" , salarioBruto);
            System.out.printf("Descontos: R$: %.2f (INSS: R$ %.2f | IR: R$ %.2f)\n", (descontoInss + descontoIR), descontoInss,descontoIR);
            System.out.printf(" Salario liquido: R$: %.2f ",(salarioBruto - descontoInss - descontoIR));

            System.out.println("");
            System.out.println("deseja calcular outro funcionario? (digite 'sair' para encerrar): ");
            String opcao = sc.nextLine();

            if (opcao.equals("sair")){
                break;
            }
        }
        sc.close();

        System.out.printf("Programa encerrado. total e calculos realizados: %.d\n",qtdCalculos);
    }

}