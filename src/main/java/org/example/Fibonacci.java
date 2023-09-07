package org.example;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro : ");
        int n = scanner.nextInt();

        int resultado = calcularFibonacci(n);

        System.out.println("Fib = " + resultado);

        scanner.close();
    }

    public static int calcularFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            int resultado = 0;

            for (int i = 2; i <= n; i++) {
                resultado = a + b;
                a = b;
                b = resultado;
            }

            return resultado;
        }
    }
}
