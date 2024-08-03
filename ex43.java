package udemy_java;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ex43 {

    private String name;
    private ex43E level;
    private Double baseSalary;
    private ex43T departament;
    private List<ex43T> contracts = new ArrayList<>();

    public void Worker() {

    }

    public ex43(Double baseSalary, ex43T departament, ex43E level, String name) {
        this.baseSalary = baseSalary;
        this.departament = departament;
        this.level = level;
        this.name = name;
    }

    public void addContract(ex43T contract) {
        contracts.add(contract);
    }

    public void removeContract(ex43T contract) {
        contracts.remove(contract);
    }

    public void income(int year, int mouth) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (ex43T c : contracts) {
            cal.setTime(c.getData());
            int c_year = cal.get(Calendar.YEAR);
            int c_mouth = cal.get(Calendar.MONTH);
            if (year == c_year && mouth == c_mouth) {
                sum += c.totalValue();
            }

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ex43E getLevel() {
        return level;
    }

    public void setLevel(ex43E level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public ex43T getDepartament() {
        return departament;
    }

    public void setDepartament(ex43T departament) {
        this.departament = departament;
    }

    public List<ex43T> getContracts() {
        return contracts;
    }
}
