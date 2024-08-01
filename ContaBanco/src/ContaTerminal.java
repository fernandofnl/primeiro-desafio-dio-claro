import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        double saldo = 237.48;

        
        System.out.println("Por favor, informe o seu nome."); //Exibir mensagens para o nosso uruário
        String nome = scanner.nextLine(); // Obter o dado digitado

        System.out.println("Por favor, digite o número da agência.");
        String agencia = scanner.nextLine();

        System.out.println("Informe o número da conta.");
        int numeroConta = scanner.nextInt();


        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque\".");

        scanner.close();
    }
}
