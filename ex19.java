package udemy_java;

import java.util.Scanner;

public class ex19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        product product = new product();
        System.out.println("enter product data: ");

        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantid = sc.nextInt();

        System.out.println(product);

        System.out.println();
        System.out.println("Coloque o numero de produtos a ser adicionado: ");
        int quantid = sc.nextInt();
        product.addProd(quantid);

        System.out.println(product);

        sc.close();
    }

}
