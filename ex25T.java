package udemy_java;

public class ex25T {
    private int id;
    private String name;
    private double value;

    public ex25T(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ex25T(int id, String name, double initialDeposit) {
        this.id = id;
        this.name = name;
        deposit(initialDeposit);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount) {
        value += amount;
    }

    public void withdraw(double amount) {
        value -= amount + 5;
    }

    public String toString() {
        return "Account: "
                + id
                + ", Name: "
                + name
                + ", balance: R$"
                + String.format("%.2f", value);
    }
}
