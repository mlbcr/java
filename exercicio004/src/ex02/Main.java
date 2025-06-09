package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double raio = input.nextInt();
        double PI = 3.14159;

        double area = Math.pow(raio, 2) * PI;
        System.out.printf("A = %f", area);
    }
}
