package udemy_java;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double salario, imposto, caso1, caso2;

        salario = sc.nextDouble();

        if (salario <= 2000.00) {
            System.out.println("paga nada");
        }
        if (salario > 2000.01 && salario <= 3000.00) {
            caso1 = salario - 2000;
            imposto = caso1 * 0.08;
            System.out.println("paga isso: " + imposto);
        }
        if (salario > 3000.01 && salario <= 4500.00) {
            caso2 = salario - 3000;
            imposto = caso2 * 0.18 + 80;
            System.out.println("paga isso: " + imposto);
        }
        if (salario > 4500.01) {
            imposto = (salario - 4500) * 0.28 + 350;
            System.out.println("Paga isso: " + imposto);
        }
        sc.close();

        /*
         * Era possivel fazer a conta de maneira bem mais simples usando a seguinte
         * expressao:
         * 
         * if (salario <= 3000){
         * imposto = (salario - 2000) * 0.08;}
         * 
         * desta forma não seria necessario criar a quantidade de variaveis que eu
         * criei, e tornaria a visualização do programa bem mais facil.
         * 
         * modifiquei o ultimo caso pra expressao que o professor sugeriu.
         */
    }

}