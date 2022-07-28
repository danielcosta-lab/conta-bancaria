import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double saldo = 237.48;

        System.out.println("Por favor, insira o numero da sua agencia = ");
        String agencia = sc.nextLine();

        System.out.println("\n");

        System.out.println("Insira o numero da sua conta = ");
        int numeroConta = sc.nextInt();

        System.out.println("\n");

        System.out.print("Insira seu nome completo = ");
        sc.nextLine();
        String nomeCompleto = sc.nextLine();

        System.out.println("\n");

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque" , nomeCompleto, agencia, numeroConta, saldo);

        System.out.println("\n");

        sc.close();
    }
}
