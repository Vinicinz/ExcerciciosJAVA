package udemy_java;

import java.util.Scanner;

public class ex23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarAtual = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double quant = sc.nextDouble();

        double result = ex23T.dollarPraReal(quant, dollarAtual);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);
        sc.close();
    }
}
