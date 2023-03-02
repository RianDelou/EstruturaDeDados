import java.util.Arrays;
import java.util.Objects;

public class Cadastro {
        private final Funcionario[] funcionarioLista;
        private int total;

        public Cadastro(int tamanho) {

            this.funcionarioLista = new Funcionario[tamanho];

        }

        public void admitir (String matricula) {
            int result = busca(matricula);

            if (result != -1) {
                System.out.println("Já existe um funcionario com está matricula!");
            } else {
                Funcionario f = new Funcionario(matricula);
                this.funcionarioLista[this.total] = f;
                System.out.println("Cadastramento realizado");
            }
        }

        public void exibir() {
                System.out.println("Todos os funcionarios cadastrados: "+ Arrays.toString(funcionarioLista));
            }

        public int busca (String matricula) {

                Funcionario procurado = new Funcionario(matricula);

                for (int i = 0; i <= this.total - 1; i++) {
                    if (this.funcionarioLista[i].compareTo(procurado) == 0) {
                        return i;
                    }
                }
                return -1;
            }


        public void aumentoFuncionario(int matricula, double percentualParaAplicar) {
                Funcionario aumento = new Funcionario();

            if(busca(String.valueOf(matricula)) == matricula) {
                aumento.aplicarAumento(percentualParaAplicar);
            } else {
                System.out.println("matricula inexistente. ");
            }

        }

        public void exibirDados (int matricula) {
                Funcionario exibirFuncionario = new Funcionario();

            if(busca(String.valueOf(matricula)) == matricula) {
                System.out.print(exibirFuncionario.getMatricula());
            } else {
                System.out.println("matricula inexistente. ");
            }

        }

        public void demitir (String matricula) {
            Funcionario demitirFuncionario = new Funcionario();

            if(Objects.equals(matricula, demitirFuncionario.getMatricula())) {
                matricula ==
            } else {
                System.out.println("Matricula não encontrada");
            }
        }
        //próxima função
    }