package basico.banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double deposito_inicial;

        System.out.print("Insira o número da conta: ");
        int num_conta = input.nextInt();

        input.nextLine();

        System.out.print("Insira o titular da conta: ");
        String titular = input.nextLine();

        System.out.print("Existe um depósito inicial (s/n)? ");
        char resp = input.next().charAt(0);

        if (resp == 's'){
            System.out.print("Insira o valor do depósito inicial: ");
            deposito_inicial = input.nextDouble();
        } else {
            deposito_inicial = 0;
        }

        Conta conta = new Conta(num_conta, titular, deposito_inicial);

        input.nextLine();
        conta.mostrarConta();

        System.out.print("\nInsira um valor de depósito: ");
        double novo_deposito = input.nextDouble();

        conta.realizarDeposito(novo_deposito);
        conta.mostrarConta();

        System.out.print("\nInsira um valor de depósito: ");
        double novo_saque= input.nextDouble();

        conta.realizarSaque(novo_saque);
        conta.mostrarConta();
    }
}
