package udemy_java;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu numero");
        int n = sc.nextInt();
        ex27T[] vect = new ex27T[n];

        for (int i = 0; i < n; i++) {
            System.out.print("digite um nuemro: ");
            int num = sc.nextInt();
            vect[i] = new ex27T(num);
        }

        System.out.println(vect);
        sc.close();
    }
}
