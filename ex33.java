package udemy_java;

import java.util.Scanner;

public class ex33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 1; i <= n; i++) {
            System.out.println("dados da " + i + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double somaAltura = 0;
        for (int i = 0; i < n; i++) {
            somaAltura += altura[i];

        }

        System.out.println("Altura media é de: " + (somaAltura / n));

        double count = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                count++;
            }
        }
        System.out.println("Pessoas com menos de 16: " + (count / n) * 100 + "%");

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }
        }

        sc.close();

    }

}
