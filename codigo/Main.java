import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Emprestimo emp = new Emprestimo();
    static Equipamento eqp = new Equipamento();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // array dos objetos
        ArrayList<Emprestimo> arrayEmprestimo = new ArrayList<>();
        ArrayList<Cliente> arrayCliente = new ArrayList<>();

        // atributos para addEquipamento

        int opcaoMenu = 99;
        while (opcaoMenu != 0) {
            System.out.println("-------");
            System.out.println("\n1 - Setor De Equipamentos");
            System.out.println("\n2 - Setor De Cliente");
            System.out.println("\n2 - Setor De Aluguel");
            System.out.println("\n0 - Para Encerrar o Sistema");
            System.out.println("-------");

            System.out.println("\nDigite a opcao que deseja: ");
            opcaoMenu = input.nextInt();
            input.nextLine(); // limpando o buffer do teclado
            switch (opcaoMenu) {
                case 1:
                    subMenuEquipamento();
                    break;
                case 2:
                    subMenuCliente();

                    break;
                case 3:
                    subMenuEmprestimo();
                    break;
                default:
                    System.out.println("Opcao Invalida!");

            }
        }

    }

    public static void subMenuEquipamento() {
        int opcaoMenu = 99;
        while (opcaoMenu != 0) {
            System.out.println("-------");
            System.out.println("\n1 - Cadastrar Equipamentos");
            System.out.println("\n2 - Listar Equipamentos");
            System.out.println("\n3 - Edit Equipamentos");
            System.out.println("\n4 - Remover Equipamentos");
            System.out.println("\n0 - Para Voltar ao Menu Principal");

            System.out.println("-------");

            System.out.println("\nDigite a opcao que deseja: ");
            opcaoMenu = input.nextInt();
            input.nextLine(); // limpando o buffer do teclado
            switch (opcaoMenu) {
                case 1:
                    Equipamento.adicionarEquipamento(input);
                    break;
                case 2:
                    Equipamento.listarEquipamentoP();
                    break;
                case 3:
                    Equipamento.editarEquipamento();
                    break;
                case 4:
                    Equipamento.excluirEquipamento();
                    break;
                default:
                    System.out.println("Opcao Invalida");

            }
        }

    }

    public static void subMenuCliente() {
        int opcaoMenu = 99;
        while (opcaoMenu != 0) {
            System.out.println("-------");
            System.out.println("\n1 - Cadastrar Cliente");
            System.out.println("\n2 - Listar Cliente");
            System.out.println("\n3 - Edit Cliente");
            System.out.println("\n4 - Remover Cliente");
            System.out.println("\n0 - Para Voltar ao Menu Principal");

            System.out.println("-------");

            System.out.println("\nDigite a opcao que deseja: ");
            opcaoMenu = input.nextInt();
            input.nextLine(); // limpando o buffer do teclado
            switch (opcaoMenu) {
                case 1:
                    Cliente.adicionarCliente(input);

                    break;
                case 2:
                    Cliente.listarCliente();

                    break;
                case 3:
                    Cliente.editarCliente();
                    break;
                case 4:
                    Cliente.excluirCliente();
                    break;
                default:
                    System.out.println("Opcao Invalida");

            }
        }

    }

    public static void subMenuEmprestimo() {
        int opcaoMenu = 99;
        while (opcaoMenu != 0) {
            System.out.println("-------");
            System.out.println("\n1 - Fazer um Emprestimo");
            System.out.println("\n2 - Ver Equipamentos Disponiveis");
            System.out.println("\n3 - Imprimir Emprestimos");

            System.out.println("\n0 - Para Voltar ao Menu Principal");

            System.out.println("-------");

            System.out.println("\nDigite a opcao que deseja: ");
            opcaoMenu = input.nextInt();
            input.nextLine(); // limpando o buffer do teclado
            switch (opcaoMenu) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    emp.imprimirValor();
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opcao Invalida");

            }
        }

    }

}
