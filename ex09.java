package udemy_java;
import java.util.Scanner;

public class ex09 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod1, num1, cod2, num2;
        double valor1, valor2, pagar;

        cod1 = sc.nextInt();
        num1 = sc.nextInt();
        valor1 = sc.nextDouble();

        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        valor2 = sc.nextDouble();

        pagar = num1 * valor1 + num2 * valor2;

        System.out.printf("Valor a se pagar é de R$%.2f", pagar);

        sc.close();

    }

}
