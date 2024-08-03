package udemy_java;

import java.util.Scanner;

public class ex37 {
    // Fiz tudo errado esse aqui, então estarei criando outro arquivo pra tentar
    // novamente.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        String[] email = new String[n];
        int[] quarto = new int[9];
        int entrada = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("entrada #" + i);
            System.out.print("Nome: ");
            sc.nextLine();
            nome[i] = sc.nextLine();
            System.out.print("email: ");
            email[i] = sc.nextLine();
            System.out.println("quarto: ");
            entrada = sc.nextInt();
            if (entrada >= 0 && entrada <= 9) {
                quarto[entrada] = entrada;
            } else {
                System.out.println("entrada invalida!");
            }
        }

        System.out.println("quartos ocupados: ");
        for (int i = 0; i < 9; i++) {
            if (quarto[i] != 0) {
                for (int h = 0; i < n; h++) {
                    System.out.println("quarto: " + i + ": " + nome[h]);
                }

            }
            sc.close();
        }
    }
}
