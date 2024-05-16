import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Bem vindo ao sistema ContaTerminal");

        // Importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        // Obter pela scanner os valores digitados no terminal
        System.out.println("Digite o seu nome: ");
        System.out.print("Usuário: ");
        String nome = scanner.next();

        System.out.println("Digite o número da sua agência: ");
        System.out.print("Usuário: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da sua conta: ");
        System.out.print("Usuário: ");
        int conta = scanner.nextInt();

        float saldo = 237.48f; // Adicionado um ponto e vírgula e f para indicar que é um float

        // Exibir a mensagem conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o Scanner
        scanner.close();

        // Exibir a mensagem conta criada



    }
}
