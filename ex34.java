package udemy_java;

import java.util.Scanner;

public class ex34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numero você vai digitar? ");
        int n = sc.nextInt();
        int[] numero = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numero[i] = sc.nextInt();
        }

        int count = 0;
        System.out.println("Numeros pares: ");
        for (int i = 0; i < n; i++) {
            if (numero[i] % 2 == 0) {
                System.out.print(numero[i] + "  ");
                count++;
            }
        }

        System.out.println("\nQuantidade de pares é de: " + count);
        sc.close();

    }

}
