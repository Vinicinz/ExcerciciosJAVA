package udemy_java;

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        double count;
        System.out.println("Digite a baixo o numero de pessoas: ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome da pessoa: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            System.out.print(" Digite a idade: ");
            idade[i] = sc.nextInt();

        }

        count = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                count++;
                System.out.println(nomes[i] + "é menor de 16 anos");
            }
        }
        System.out.printf("a porcentagem de pessoas é de %.2f por cento", ((count / n) * 100));

        sc.close();
    }
}
