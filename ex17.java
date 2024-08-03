package udemy_java;

import java.util.Scanner;

public class ex17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite 3 numeros: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Digite outros 3 numeros: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double pX = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));

        double pY = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

        System.out.println("A area do X é: " + areaX);
        System.out.println("A area do y é: " + areaY);
        if (areaX > areaY) {
            System.out.println("O maior triangulo é o X");
        } else {
            System.out.println(" O maior triangulo é o Y");
        }

        sc.close();

    }

}
