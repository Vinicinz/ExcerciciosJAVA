package udemy_java;

import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter em cada vetor?");
        int n = sc.nextInt();
        int resultado = 0;
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++) {
            vetorB[i] = sc.nextInt();
        }

        System.out.println("Vetor resultante é: ");
        for (int i = 0; i < n; i++) {
            resultado = vetorA[i] + vetorB[i];
            System.out.println(resultado);
        }

        sc.close();
    }

}
