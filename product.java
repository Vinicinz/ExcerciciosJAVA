package udemy_java;

public class product {

    public String name;
    public double price;
    public int quantid;

    public double totalValue() {
        return price * quantid;
    }

    public void addProd(int quantid) {
        this.quantid += quantid;
    }

    public void remProd(int quantid) {
        this.quantid += quantid;
    }

    public String toString() {
        return name + ", R$" + price + ", " + quantid;

    }
}
