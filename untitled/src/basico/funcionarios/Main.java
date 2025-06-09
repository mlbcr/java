package basico.funcionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int cod_func;
        String nome_func;
        double salario;

        System.out.print("Insira o código do funcionário: ");
        cod_func = input.nextInt();

        input.nextLine();

        System.out.print("Insira o nome do funcionário: ");
        nome_func = input.nextLine();

        System.out.print("Deseja informar o salário inicial (s/n)? ");
        char resp = input.next().charAt(0);
        if (resp == 's'){
            System.out.print("Informe o salário inicial: ");
            salario = input.nextDouble();
        } else {
            salario = 0;
        }

        Funcionario funcionario = new Funcionario(cod_func, nome_func, salario);

        funcionario.mostrarFuncionario();

        System.out.print("\nInforme o percentual de aumento: ");
        double aumento = input.nextInt();

        funcionario.aumentarSalario(aumento);
        funcionario.mostrarFuncionario();

        System.out.print("\nInforme o número de faltas: ");
        int faltas = input.nextInt();

        funcionario.descontarFaltas(faltas);
        funcionario.mostrarFuncionario();
    }
}
