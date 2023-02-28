
import java.util.Arrays;
import java.util.Objects;
    public class Cadrasto {
        private final Funcionario[] funcionarioLista;
        private int total;

        public Cadrasto(int tamanho) {

            this.funcionarioLista = new Funcionario[tamanho];

        }

        public void admitir (String matricula) {
           int result = busca(matricula);

           if(result != -1) {
               System.out.println("Já existe um funcionario com está matricula!");
           } else {
               Funcionario f = new Funcionario(matricula);
               this.funcionarioLista[this.total] = f;
               System.out.println("Cadastramento realizado");
           }


        }

        public int busca (String matricula) {

            if (this.total == 0) { //reduntante
                return -1;
            } else {
                Funcionario procurado = new Funcionario(matricula);
                for (int i = 0; i <= this.total - 1; i++) {
                    if (this.funcionarioLista[i].compareTo(procurado) == 0) {
                        return i;
                    }
                }
                return -1;
            }
        }

        //próxima função
    }