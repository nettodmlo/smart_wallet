import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Wallet wallet = new Wallet();

        System.out.println("Seja bem-vindo a Carteira Inteligente!\n");
        System.out.println("Inicialmente, digite seu rendimento mensal: ");
        wallet.setRendmensal(sc.nextDouble());
        System.out.println("Certo! agora vamos lá: quanto você gastou? ");
        wallet.setGastoAtual(sc.nextDouble());
        System.out.println("Calculando rendimento mensal + gastos atuais...\n");
        System.out.println("Você gastou " + wallet.getGastoAtual() + "R$ e resta do seu salário o total de: " + wallet.getCalcMensal() + "R$");

    }
}