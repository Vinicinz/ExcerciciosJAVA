
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

    private LocalDate manufatureDate;


    public UsedProduct(String name, Double price, LocalDate manufatureDate) {
        super(name, price);
        this.manufatureDate = manufatureDate;
    }

    public LocalDate getManufatureDate() {
        return manufatureDate;
    }

    public void setManufatureDate(LocalDate manufatureDate) {
        this.manufatureDate = manufatureDate;
    }

    @Override
    public String toString() {
        return getName() + " (used) R$" + getPrice() + "(Manufacture date: " + manufatureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

}
