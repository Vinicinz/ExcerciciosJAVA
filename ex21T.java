package udemy_java;

public class ex21T {
    public String name;
    public Double salarioBruto;
    public Double imposto;

    public Double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void salarioNovo(double porcentagem) {
        salarioBruto += salarioBruto * (porcentagem / 100);
    }

    public Double salarioNovo() {
        return salarioLiquido();
    }
}
