package udemy_java;

import java.util.Scanner;

public class ex35 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numero você irá digitar? ");
        int n = sc.nextInt();
        int[] numero = new int[n];

        int maior = 0;
        int posicao = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numero[i] = sc.nextInt();
            if (numero[i] > maior) {
                maior = numero[i];
                posicao = i;
            }
        }

        System.out.println("Maior valor é: " + maior);
        System.out.println("Posição maior é a: " + posicao);

        sc.close();

    }

}
