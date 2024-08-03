package udemy_java;

import java.util.Scanner;

public class ex22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ex22t aluno = new ex22t();

        System.out.print("Nome do Aluno: ");
        aluno.nome = sc.nextLine();
        System.out.print("Nota do aluno no primeiro trimestre (0 - 30): ");
        aluno.nota1 = sc.nextInt();
        System.out.print("Nota do aluno no segundo trimestre (0 - 35): ");
        aluno.nota2 = sc.nextInt();
        System.out.print("Nota do aluno no terceiro trimestre (0 - 35): ");
        aluno.nota3 = sc.nextInt();

        System.out.println(aluno.status());
        sc.close();
    }

}
