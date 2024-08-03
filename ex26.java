package udemy_java;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu numero");
        int n = sc.nextInt();
        ex26T[] vect = new ex26T[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ex26T(name, price);
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }

        System.out.println(sum);
        sc.close();
    }

}
