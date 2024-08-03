package udemy_java;

public class ex23T {

    public static double IOF = 0.06;

    public static double dollarPraReal(Double quant, double dollarAtual) {
        return quant * dollarAtual * (1.0 + IOF);

    }

}
