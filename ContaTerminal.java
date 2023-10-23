import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = terminal.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = validarInteiro(terminal);

        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = terminal.nextLine();

        System.out.print("Por favor, digite o Saldo: ");
        double saldo = validarDouble(terminal);

        // Exibir a mensagem com as informações fornecidas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }

    // Método para validar um inteiro
    private static int validarInteiro(Scanner terminal) {
        while (true) {
            try {
                return Integer.parseInt(terminal.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número inteiro válido.");
            }
        }
    }

    // Método para validar um número decimal (double)
    private static double validarDouble(Scanner terminal) {
        while (true) {
            try {
                return Double.parseDouble(terminal.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido.");
            }
        }
    }
}

