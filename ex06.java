package udemy_java;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double area, pi, raio;

        pi = 3.14159;
        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);

        System.out.printf("Area é de: %.4f", area);

        sc.close();
    }

}
