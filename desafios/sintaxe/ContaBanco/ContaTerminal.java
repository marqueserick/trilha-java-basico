import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String agencia;
        String numero;
        String nome;
        System.out.println("Seja bem-vindo\nPara iniciar, digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Que prazer te atender "+ nome+". Para continuar digite o número da sua agência com 4 dígitos.");
        agencia = scanner.nextLine();
        System.out.println("Ok! Agora preciso que digite o número da sua conta.");
        numero = scanner.nextLine();
        Conta conta = new Conta(nome, agencia, numero);
        conta.confirmarCriacaoConta();

    }
}

class Conta {
    private String numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public Conta(String nome, String agencia, String numero) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nome;
        this.saldo = 0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void confirmarCriacaoConta(){
        String mensagemConfirmacao = "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s" +
                " e seu saldo %.2f já está disponível para saque.";
        System.out.printf(mensagemConfirmacao, nomeCliente, agencia, numero, saldo);
    }
}