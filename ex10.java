package udemy_java;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C, tri, cir, tra, qua, ret;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        tri = A * C / 2;
        cir = 3.14159 * Math.pow(C, 2);
        tra = ((A + B) * C) / 2;
        qua = Math.pow(B, 2);
        ret = A * B;

        System.out.printf("Triangulo de area: %.3f %n", tri);
        System.out.printf("Circulo de area: %.3f %n", cir);
        System.out.printf("Trapezio de area: %.3f %n", tra);
        System.out.printf("Quadrado de area: %.3f %n", qua);
        System.out.printf("Retangulo de area: %.3f %n", ret);

        sc.close();
    }

}
