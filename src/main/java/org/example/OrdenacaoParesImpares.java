package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        System.out.println("Digite números inteiros não negativos (digite um número negativo para parar):");

        while (true) {
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        System.out.println("Números pares em ordem crescente: " + pares);
        System.out.println("Números ímpares em ordem decrescente: " + impares);

        scanner.close();
    }
}
