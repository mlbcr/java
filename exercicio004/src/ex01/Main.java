package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int soma = n1 + n2;
        System.out.printf("SOMA = %d", soma);
    }
}
