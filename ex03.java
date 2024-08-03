package udemy_java;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;
        int x1, x2, x3;
        double z1, z2, z3;

        x1 = sc.nextInt();
        sc.nextLine();
        x2 = sc.nextInt();
        sc.nextLine();
        x3 = sc.nextInt();
        sc.nextLine();

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        z1 = sc.nextDouble();
        z2 = sc.nextDouble();
        z3 = sc.nextDouble();

        System.out.println("Dados Digitados: ");
        System.out.printf("%s, %s, %s %n", s1, s2, s3);
        System.out.printf("%d, %d, %d %n", x1, x2, x3);
        System.out.printf("%.2f, %.2f, %.2f %n", z1, z2, z3);

        sc.close();
    }

}
