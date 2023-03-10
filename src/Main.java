import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String matricula;
        int choise;
        double percentualDoAumento;
        char executarNovamente;

        Cadastro totalDeCadastro = new Cadastro(1000);

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("""
                     1 – Admitir novo funcionário
                     2 – Exibir todos os funcionários da empresa
                     3 – Aplicar aumento de salário a um funcionário
                     4 – Exibir os dados de um funcionário
                     5 – Demitir um funcionário""");

            choise = input.nextInt();

            if(choise == 1) {

                System.out.println("Digite a matricula do novo funcionario: ");
                matricula = input.next();
                totalDeCadastro.admitir(matricula);

            } else if (choise == 2) {

                totalDeCadastro.exibir();

            } else if (choise == 3) {

                System.out.print("Digite a matricula e o aumento em porcentagem respectivamente: ");
                matricula = input.next();
                percentualDoAumento = input.nextDouble();

                totalDeCadastro.aumentoFuncionario(matricula, percentualDoAumento);

            } else if (choise == 4) {

                System.out.print("Digite a matricula para exibir os dados do funcionario: ");
                matricula = input.next();

                totalDeCadastro.exibirDados(matricula);

            } else if (choise == 5) {
                System.out.println("Digite a matricula para demitir o funcionario");
                matricula = input.next();

                totalDeCadastro.demitir(matricula);
            }

            System.out.println("\nDeseja fazer outra alteração? (s/n) ");
            executarNovamente = input.next().charAt(0);

        } while (executarNovamente == 's');
    }
}