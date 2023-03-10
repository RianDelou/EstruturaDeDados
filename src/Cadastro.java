import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Cadastro {
    private final Funcionario[] funcionarioLista;
    private int total;

    public Cadastro(int tamanho) {

        this.funcionarioLista = new Funcionario[tamanho];

    }

    public void admitir(String matr) {

        Scanner input = new Scanner(System.in);
        String nome, cargo;
        double salario;
        int ano;

        if (this.total == this.funcionarioLista.length) {
            System.out.println("Cadastro cheio!!");
        } else {

            int result = this.buscaSequencialMelhorada(matr);
            if (result == -1) {
                System.out.println("Já existe um funcionário com esta matrícula!");
            } else {

                Funcionario f = new Funcionario(matr);

                System.out.println("Informe o nome do funcionário: ");
                nome = input.nextLine();
                f.setNome(nome);
                System.out.println("Informe o cargo que o funcioário irá ocupar: ");
                cargo = input.nextLine();
                f.setCargo(cargo);
                System.out.println("Informe o salário inicial do funcionário: ");
                salario = input.nextDouble();
                input.nextLine();
                f.setSalario(salario);

                Calendar cal = GregorianCalendar.getInstance();
                ano = cal.get(Calendar.YEAR);

                f.setAno(ano);

                this.funcionarioLista[this.total] = f;
                this.total++;
                System.out.println("Cadastramento realizado");

            }
        }
    }

    public void exibir() {
        System.out.println("Todos os funcionarios cadastrados: " + Arrays.toString(funcionarioLista));
    }

    public int buscaSequencialMelhorada(String matricula) {
        int i;

        Funcionario procurado = new Funcionario(matricula);

        for (i = 0; i <= this.total - 1; i++) {
            if (this.funcionarioLista[i].compareTo(procurado) >= 0) { //ordem crescente
                return i;
            }
        }
        return i;

    }

    public void aumentoFuncionario(String matricula, double percentualParaAplicar) {
        Funcionario aumento = new Funcionario(matricula);


        for (int i = 0; i <= this.total - 1; i++) {
            if (this.funcionarioLista[i].compareTo(aumento) == 0) {
                this.funcionarioLista[i].aplicarAumento(percentualParaAplicar);

                System.out.println("aumento aplicado :)");

            } else {
                System.out.println("Matricula inexistente");
            }
        }
    }

    public void exibirDados (String matricula) {

        Funcionario exibirFuncionario = new Funcionario(matricula);

        for (int i = 0; i < this.total - 1; i++) {
            if (this.funcionarioLista[i].compareTo(exibirFuncionario) == 0) {
                System.out.print(exibirFuncionario.getMatricula() + " " + exibirFuncionario.getNome() +" "+ exibirFuncionario.getSalario());
            } else {
                System.out.println("Matricula inexistente");
            }

        }
    }

    public void demitir (String matricula) {

        Funcionario demitir = new Funcionario(matricula);

        for (int i = 0; i <= this.total - 1; i++) {
            if (this.funcionarioLista[i].compareTo(demitir) == 0) {
                matricula = "demitido";
                System.out.println("funcionario " + matricula);
            } else {
                System.out.println("Matricula inexistente");
            }

        }
    }
}
