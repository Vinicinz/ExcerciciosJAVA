package udemy_java;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ex21T sal = new ex21T();

        System.out.println("Digite o Nome do funcionario");
        sal.name = sc.nextLine();
        System.out.println("salario bruto: ");
        sal.salarioBruto = sc.nextDouble();
        System.out.println("Digite o imposto: ");
        sal.imposto = sc.nextDouble();

        System.out.printf("O Funcionario %s recebe R$%.2f %n", sal.name, sal.salarioLiquido());

        System.out.println("quanto o funcionario começará a receber em porcentagem?");
        Double porcentagem = sc.nextDouble();
        sal.salarioNovo(porcentagem);

        System.out.println("O funcionario passará a receber: " + sal.salarioNovo());
        sc.close();
    }

}
