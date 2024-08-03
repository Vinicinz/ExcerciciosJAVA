package udemy_java;

public class ex13 {
    public static void main(String[] args) {
        double preco = 34.5;

        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);

        /*
         * double desconto;
         * if (preco < 20) {
         * desconto = preco * 0.1;
         * } else {
         * desconto = preco * 0.05;
         * }
         * 
         * 
         * Geralmente a estrutura de ifs fica desta forma, mas com a condição ternaria é
         * possivel deixar mais clean o codigo.
         */
    }

}
