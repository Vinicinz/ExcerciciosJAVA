package udemy_java;

import java.util.Locale;

public class ex02 {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office Desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Product:");
        System.out.printf("%s, Which price is $%.2f %n", product1, price1);
        System.out.printf("%s, Which price is $%.2f %n", product2, price2);
        System.out.printf("%nRecord: %d Years old, code %d and gender: %c %n", age, code, gender);
        System.out.printf("%nMeasue with eight decimal places: %.8f %n", measure);
        System.out.printf("Ronded(three decimal places): %.3f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);

    }

}