package udemy_java;
import java.util.Scanner;

public class ex32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite quantos numero você quer digitar: ");
        int n = sc.nextInt();
        double[] valor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("digite um valor: ");
            valor[i] = sc.nextDouble();
        }

        System.out.print("valores são:");

        for (int i = 0; i < n; i++) {
            System.out.print(" " + valor[i] + ",");
        }

        Double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += valor[i];
        }

        System.out.println();

        System.out.println("a soma é de: " + soma);

        System.out.println("a media é de: " + soma / n);

        sc.close();
    }
}
