package udemy_java;

import java.util.Scanner;

public class ex25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ex25T account;

        System.out.print("enter the accont number: ");
        int id = sc.nextInt();
        System.out.print("enter your name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there an inicial deposit(y/n)?: ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter inical value: ");
            double initialDeposit = sc.nextDouble();
            account = new ex25T(id, name, initialDeposit);
        } else {
            System.out.println("ok");
            account = new ex25T(id, name);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();

    }

}
