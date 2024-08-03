package udemy_java;

import java.util.Scanner;

public class ex31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("quantos numeros voce vai digitar?");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i <= n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i] + " é um numero negativo");
            }
        }

        sc.close();
    }

}
