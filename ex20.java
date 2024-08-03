package udemy_java;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ex20T valor = new ex20T();
        System.out.println("Insira dois valores de um retangulo");
        valor.largura = sc.nextDouble();
        valor.altura = sc.nextDouble();

        System.out.println("Area = " + valor.area());
        System.out.println("Perimetro = " + valor.perimetro());
        System.out.println("Diagonal = " + valor.diagonal());

        sc.close();
    }

}
