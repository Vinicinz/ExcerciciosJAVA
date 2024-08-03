package udemy_java;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, delta, x1, x2;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        delta = (int) (Math.pow(b, 2.0) - 4 * a * c);
        x1 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
        x2 = (int) ((-b - Math.sqrt(delta)) / (2 * a));

        System.out.println("O valor de delta é: " + delta);
        System.err.println("O valor de x1 é: " + x1);
        System.err.println("O valor de x2 é: " + x2);

        sc.close();

    }

}
