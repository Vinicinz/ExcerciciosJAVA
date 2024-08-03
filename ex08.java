package udemy_java;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, valorHoras;
        double hora, salario;

        num = sc.nextInt();
        valorHoras = sc.nextInt();
        hora = sc.nextDouble();

        salario = hora * valorHoras;

        System.out.println("numero do funcionario: " + num);
        System.out.printf("Salario = R$%.2f", salario);

        sc.close();
    }

}
