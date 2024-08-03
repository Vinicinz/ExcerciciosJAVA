package udemy_java;

import java.util.Date;

public class ex43T {

    private Date data;
    private Double valuePerHour;
    private Integer hours;

    public void HourContract(){

    }

    public ex43T(Date data, Integer hours, Double valuePerHour) {
        this.data = data;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public double totalValue(){
        return valuePerHour * hours;
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
        
    }

}
