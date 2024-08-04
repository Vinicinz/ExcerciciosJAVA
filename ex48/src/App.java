
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double inicial = sc.nextDouble();
            System.out.print("Withdraw limit:: ");
            Double limit = sc.nextDouble();
            Account acc = new Account(number, holder, inicial, limit);
            System.out.println(acc);
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            try {
                acc.withdraw(amount);
                System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
            }
            catch (BusinessException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(acc);
		}
    }
}
