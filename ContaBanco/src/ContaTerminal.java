import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String mensagemConta = ("Digite no numero da conta.");
        String mensagemAgencia = ("Digite no numero da agencia."); 
        String mensagemNome = ("Digite o seu nome.");
        String mensagemSaldoConta = ("Digite o saldo da conta.");
        int numConta = informeConta(scanner, mensagemConta);
        String agenciaConta = informeAgenciaNome(scanner, mensagemAgencia);
        String nomeCliente = informeAgenciaNome(scanner, mensagemNome);
        double saldoConta = informeSaldoConta(scanner, mensagemSaldoConta);
        imprimeMensagem(nomeCliente,agenciaConta,numConta,saldoConta);
        scanner.close();
    }

    public static Integer informeConta(Scanner scanner, String mensagem){
        System.out.println(mensagem);     
        int numero = scanner.nextInt();
        return numero;
    }

    public static String informeAgenciaNome(Scanner scanner, String mensagem){
        System.out.println(mensagem);
        String informacao = scanner.next();       
        return informacao;
    }

    public static Double informeSaldoConta(Scanner scanner, String mensagem){
        System.out.println(mensagem);     
        double numero = scanner.nextDouble();
        return numero;
    }

    public static void imprimeMensagem(String nome, String agencia, int conta, double saldo){
       System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia 
        + ", conta " + conta +" e seu saldo " + saldo +" já está disponível para saque." );
    }

}
