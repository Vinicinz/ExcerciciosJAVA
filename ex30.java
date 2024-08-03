package udemy_java;

import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, menores;
        double altmedia, alturatotal, mediamenores;

        System.out.println("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        menores = 0;
        alturatotal = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                menores++;
            }
            alturatotal = alturatotal + alturas[i];
        }

        altmedia = alturatotal / n;
        mediamenores = ((double) menores / n) * 100;

        System.out.printf("\nAltura media = %.2f\n", altmedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", mediamenores);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.printf("%s\n", nomes[i]);
            }
        }

        sc.close();
    }
}
