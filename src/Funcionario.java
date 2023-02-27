import java.util.Objects;
import java.util.Scanner;

public class Funcionario {
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

        return "";

    }

    public int compareTo(String ma, String ma2) {

        if(Objects.equals(ma, ma2)) {
            return 0;
        }
        return 1;
    } //duvidas no compareTo, esse método não está completo ou correto

    public double aplicarAumento() {
        Scanner input = new Scanner(System.in);

        double aumento;
        double aumentoCalculo;

        System.out.print("digite o aumento em porcentagem (0 a 100) : ");
        aumento = input.nextInt();

        aumentoCalculo = aumento/100 * salario + salario;

        return aumentoCalculo;

    }
}