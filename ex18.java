package udemy_java;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        triangle x, y;
        x = new triangle();
        y = new triangle();

        System.out.println("Digite 3 numeros: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite outros 3 numeros: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

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