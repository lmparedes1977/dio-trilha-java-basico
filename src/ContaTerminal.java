import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner textEntry = new Scanner(System.in);
        Scanner numberEntry = new Scanner(System.in);
        int accountNumber;
        String branchNumber, clientName;
        double balance;

            System.out.println("===========================================================");
            System.out.println("====          WELCOME TO DIO BANK CORPORATION          ====");
            System.out.println("===========================================================\n");
            System.out.println(" Para abertuda de conta, degite o número de conta desejado:");
            accountNumber = numberEntry.nextInt();
            System.out.println(" Digite o número da agência desejado, com dígito verificador,\n no formato 'XXXX-X': ");
            branchNumber = textEntry.nextLine();
            System.out.println(" Digite o nome do cliente: ");
            clientName = textEntry.nextLine();
            System.out.println(" Digite o valor do depósito inicial: ");
            balance = numberEntry.nextDouble();
            System.out.println("\n===========================================================\n");
            System.out.printf(" Olá %s, obrigado por criar uma conta em nosso banco,\n sua agência é %s, conta %d e seu saldo R$ %.2f\n já está disponível para saque.\n", clientName, branchNumber, accountNumber, balance);


    }
}