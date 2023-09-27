package edu.diogbar.banco_terminal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        System.out.print("Número: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite a agência!");
        System.out.print("Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente!");
        System.out.print("Cliente: ");
        String cliente = scanner.next();

        System.out.println("Por favor, digite o valor do saldo!");
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println(
            "Olá "
            .concat(cliente)
            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .concat(agencia)
            .concat(", conta ")
            .concat(String.valueOf(conta))
            .concat(" e seu saldo R$")
            .concat(String.valueOf(saldo))
            .concat(" já está disponível para saque."));

        // System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ conta +" e seu saldo R$"+ saldo +" já está disponível para saque.");

        scanner.close();
    }
}
