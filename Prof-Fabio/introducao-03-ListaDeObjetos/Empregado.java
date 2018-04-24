public class Empregado {
    private static int contador = 0;
    private int numero;
    private String nome;
    private double salario;

    public Empregado(String nome, double salario) {
        this.numero = ++contador;
        this.nome = nome;
        this.salario = salario;
    }

    public void imprime() {
        System.out.println("Número = " + this.numero + "  Nome = " + this.nome + "  Salário = " + this.salario);
    }

    public int getNumero() {
        return this.numero;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setSalario(double s) {
        this.salario = s;
    }

    public boolean Equals(Object obj) {
        Integer n = (Integer)obj;
        return n == this.numero;
    }
}
