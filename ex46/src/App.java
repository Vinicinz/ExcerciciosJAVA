
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            System.out.println("Product #" + i + " Data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (ch == 'c') {
                Product prod = new Product(name, price);
                list.add(prod);
            }
            if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product prod = new UsedProduct(name, price, date);
                list.add(prod);
            }
            if (ch == 'i') {
                System.out.print("Customs fee: ");
                Double customFee = sc.nextDouble();
                Product prod = new ImportedProduct(name, price, customFee);
                list.add(prod);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product produ : list) {
            System.out.println(produ.toString());
        }

        sc.close();

    }
}
