package udemy_java;

public class ex20T {

    public Double largura;
    public Double altura;

    public Double area() {
        return altura * largura;
    }

    public Double perimetro() {
        return (2 * altura) + (2 * largura);
    }

    public Double diagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }
}
