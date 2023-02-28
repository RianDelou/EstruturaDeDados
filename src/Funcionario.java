import java.util.Objects;

public class Funcionario implements Comparable <Funcionario> {
    private String matricula;
    private String nome;
    private String cargo;
    private double salario;
    private int anoDeContratacao;

    public Funcionario(String matricula) {
        this.matricula = matricula;
    }

    public Funcionario() {

    }

    public String getMatricula() {
        return  matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public int getAnoDeContratacao() {
        return anoDeContratacao;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setCargo (String cargo) {
        this.cargo = cargo;
    }

    public void setAnoDeContratacao(int anoDeContratacao) {
        this.anoDeContratacao = anoDeContratacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {

        return this.matricula + " " + this.nome + " " + this.cargo + "RS " + this.salario + " " + this.anoDeContratacao;

    }

    public int compareTo(Funcionario other) {
        int result;
        result = this.matricula.compareTo(other.matricula);
        return result;
    }

    public void aplicarAumento(double porcentagem) {

        this.salario = this.salario + this.salario * porcentagem / 100;

    }
}