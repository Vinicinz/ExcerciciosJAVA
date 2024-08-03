package udemy_java;

public class ex22t {

    public String nome;
    public int nota1;
    public int nota2;
    public int nota3;

    public int notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public String status() {
        if (notaFinal() > 60) {
            return "Aluno passou";
        } else {
            return "Aluno não passou";
        }
    }

}
