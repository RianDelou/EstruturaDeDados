import java.util.Scanner;
public class ExemploListaEncadeada1 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        LSE lista1 = new LSE();
        LSE lista2 = new LSE();
        int op, ano;
        String matr, nome, cargo;
        double salario;
        Funcionario f;

        do {
            exibeOpcoes();
            op = in.nextInt(); in.nextLine();
            switch (op) {
                case 1: System.out.print("Informe a matrícula do funcionário: ");
                    matr = in.nextLine();
                    f = new Funcionario(matr);
                    System.out.print("Informe o nome do funcionário: ");
                    nome = in.nextLine();
                    f.setNome(nome);
                    System.out.print("Informe o cargo do funcionário: ");
                    cargo = in.nextLine();
                    f.setCargo(cargo);
                    System.out.print("Informe o salário do funcionário: ");
                    salario = in.nextDouble(); in.nextLine();
                    f.setSalario(salario);
                    System.out.print("Informe o ano de contratação do funcionário: ");
                    ano = in.nextInt(); in.nextLine();
                    f.setAno(ano);
                    lista1.inserir(f);
                    break;
                case 2: System.out.print("Informe a matrícula do funcionário: ");
                    matr = in.nextLine();
                    f = new Funcionario(matr);
                    // FALTA FAZER: preencher dados do funcionário
                    lista2.inserir(f);
                    break;
                case 3: // lista1.exibir();
                    break;
                case 4: // lista2.exibir();
                    break;
                case 0: System.out.println("Fim de programa");
                    break;
                default: System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }

    public static void exibeOpcoes() {
        System.out.println("Programa de controle de cadastro de funcionários");
        System.out.println("OPÇÕES");
        System.out.println("1 – Inserir novo funcionário na lista 1");
        System.out.println("2 – Inserir novo funcionário na lista 2");
        System.out.println("3 – Exibir todos os funcionários da lista 1");
        System.out.println("4 – Exibir todos os funcionários da lista 2");
        System.out.println("0 – Encerrar o programa");
        System.out.print("Informe a opção: ");
    }
}

