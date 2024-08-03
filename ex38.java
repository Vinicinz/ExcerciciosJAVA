package udemy_java;

import java.util.Scanner;

public class ex38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos quartos serão alugados?");
        int n = sc.nextInt();

        ex38T[] vetor = new ex38T[10];

        for (int i = 1; i <= n; i++) {
            System.out.println("Quarto numero #" + i);

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("email: ");
            String email = sc.nextLine();

            System.out.println("qual quarto?");
            int quarto = sc.nextInt();

            vetor[quarto] = new ex38T(name, email);

        }

        System.out.println();
        System.out.println("Quartos ocupados:");

        for (int i = 0; i < 10; i++) {
            if (vetor[i] != null) {
                System.out.println(i + ": " + vetor[i]);
            }
        }
        sc.close();
    }
}
