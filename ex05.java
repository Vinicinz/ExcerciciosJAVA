package udemy_java;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, soma;
        x = sc.nextInt();
        y = sc.nextInt();

        soma = x + y;

        System.out.printf("A soma é de %d + %d é de: %d ", x, y, soma);

        sc.close();
    }

}
