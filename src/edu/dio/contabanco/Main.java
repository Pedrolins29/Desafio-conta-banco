package edu.dio.contabanco;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 0.0;

        System.out.println("Olá, seja bem-vindo(a/e) ao banco! \n");

        System.out.println("Por favor, digite o seu nome completo: ");
        String nomeCompletoCliente = input.nextLine();
        System.out.println("O dado está correto? [s/n] " + nomeCompletoCliente);
        String confirmacao = input.next();
        if(confirmacao.equalsIgnoreCase("n")) {
            System.out.println("Por favor, digite o seu nome completo novamente: ");
            nomeCompletoCliente = input.nextLine();
        }

        System.out.print("Por favor, digite o número da Agência: ");
        System.out.println();
        String agenciaBancaria = input.next();
        System.out.println("O dado está correto? [s/n] " + agenciaBancaria);
        confirmacao = input.next();
        if(confirmacao.equalsIgnoreCase("n")) {
            System.out.println("Por favor, digite novamente o número da Agência: ");
            agenciaBancaria = input.next();
        }

        System.out.println("Por favor, digite o número da Conta: ");
        int numeroDaConta = input.nextInt();
        System.out.println("O dado está correto? [s/n] " + numeroDaConta);
        confirmacao = input.next();
        if(confirmacao.equalsIgnoreCase("n")) {
            System.out.println("Por favor, digite novamente o número da Conta: ");
            numeroDaConta = input.nextInt();
        }

        System.out.println("Deseja realizar um depósito? [s/n] ");
        if(input.next().equalsIgnoreCase("s")) {
            System.out.print("Valor a ser depositado R$");
            saldo = input.nextDouble();
        }

        String dadosDaConta = "Olá ".concat(nomeCompletoCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agenciaBancaria).concat(", número ").concat(Integer.toString(numeroDaConta));

        System.out.println("Deseja consultar o seu saldo? [s/n]");
        if (input.next().equalsIgnoreCase("s")) {
            if(saldo == 0) {
                dadosDaConta += ", e seu saldo é R$".concat(Double.toString(saldo));
            } else {
                dadosDaConta += ", e seu saldo é R$".concat(Double.toString(saldo)).concat(", já está disponível para saque");
            }
        }

        System.out.println("----------");
        System.out.println(dadosDaConta);
        System.out.println("----------");

        input.close();
    }

}
