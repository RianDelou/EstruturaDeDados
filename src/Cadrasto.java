
import java.util.Arrays;
import java.util.Objects;
    public class Cadrasto {
        private static Funcionario[] funcionario;
        private Funcionario contador; //*

        public Cadrasto(Funcionario[] funcionario, Funcionario contador) {
            Cadrasto.funcionario = funcionario;
            this.contador = contador;
        }

        public static void admitir () {
            Funcionario funcionario1 = new Funcionario();

            if(Objects.equals(funcionario1.getMatricula(), funcionario1.getMatricula())) {
                System.out.print("cadastro não pode ser efetuado."); // (if com warning)
            } else {
                for(int i = 0; i < funcionario.length; i++) {

                    funcionario[i] = funcionario[i + 1];

                }

                System.out.print("funcionario adicionado.");
            }

        }

        public static void exibir () {

            System.out.print("informações de todos os funcionarios: "+ Arrays.toString(funcionario));

        }
    }

