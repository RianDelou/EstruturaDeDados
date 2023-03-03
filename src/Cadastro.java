import java.util.Arrays;
import java.util.Objects;

public class Cadastro {
    private final Funcionario[] funcionarioLista;
    private int total;

    public Cadastro(int tamanho) {

        this.funcionarioLista = new Funcionario[tamanho];

    }

    public void admitir(String matricula) {
        int result = busca(matricula);

        if (result != -1) {
            System.out.println("Já existe um funcionario com está matricula!");
        } else {
            Funcionario f = new Funcionario(matricula);
            this.funcionarioLista[this.total] = f;
            this.total++;
            System.out.println("Cadastramento realizado");
        }
    }

    public void exibir() {
        System.out.println("Todos os funcionarios cadastrados: " + Arrays.toString(funcionarioLista));
    }

    public int busca(String matricula) {

        Funcionario procurado = new Funcionario(matricula);

        for (int i = 0; i <= this.total - 1; i++) {
            if (this.funcionarioLista[i].compareTo(procurado) == 0) {
                return i;
            }
        }
        return -1;
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
        Funcionario aumento = new Funcionario();

        for (int i = 0; i <= this.total - 1; i++) {
            if (this.funcionarioLista[i].compareTo(aumento) == 0) {
                aumento.aplicarAumento(percentualParaAplicar);
            } else {
                System.out.println("Matricula inexistente");
            }
        }
    }

        public void exibirDados (String matricula){
            Funcionario exibirFuncionario = new Funcionario();

            for (int i = 0; i < this.total - 1; i++) {
                if (this.funcionarioLista[i].compareTo(exibirFuncionario) == 0) {
                            exibirFuncionario.toString();
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

