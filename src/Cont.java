import java.util.Scanner;

public class Cont {
    public static void main(String[] args) {
        String nome = "Deborah Campos";
        String tipoConta = "Corrente";
        double saldo = 1600.00;
        int opcao = 0;

        String menu = """
                ** Digite sua opção: **
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n*******************************");


        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja tranferir");
                double valorTransferencia = leitura.nextDouble();
                if (valorTransferencia > saldo) {
                    System.out.println("Não possui saldo suficiente para transferência");
                } else {
                    saldo -= valorTransferencia;
                    System.out.println("Novo saldo R$ " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido ");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("Novo saldo R$ " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opcão Inválida!!");
            }
        }

    }
}
