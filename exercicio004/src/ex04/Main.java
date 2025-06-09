package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int num_func, horas_trabalhadas;
        double valor_hora;

        Scanner input = new Scanner(System.in);

        num_func = input.nextInt();
        horas_trabalhadas = input.nextInt();
        valor_hora = input.nextDouble();

        double salario = horas_trabalhadas * valor_hora;

        System.out.printf("NUMERO = %d\nSALARIO = R$ %.2f", num_func, salario);
        input.close();
    }
}
