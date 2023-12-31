import java.util.Scanner;


public class Main {
 
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
   
        // atributos para addEquipamento

        int opcaoMenu = 99;
        while (opcaoMenu != 0) {
            System.out.println("-------");
            System.out.println("\n1 - Setor De Equipamentos");
            System.out.println("\n2 - Setor De Cliente");
            System.out.println("\n3 - Setor De Aluguel");
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
            System.out.println("\n1 - Fazer um Alugel");
            System.out.println("\n2 - Listar Alugueis");
            System.out.println("\n3 - Editar Alugueis");
            System.out.println("\n4 - Excluir Alugueis");
            System.out.println("\n5 - Relatorio Mes Atual Alugueis");
            System.out.println("\n6 - Alugueis Cliente Especifico");

            System.out.println("\n0 - Para Voltar ao Menu Principal");

            System.out.println("-------");

            System.out.println("\nDigite a opcao que deseja: ");
            opcaoMenu = input.nextInt();
            input.nextLine(); // limpando o buffer do teclado
            switch (opcaoMenu) {
                case 1:
                	Emprestimo.adicionarEmprestimo(input);
                    break;
                case 2:
                	Emprestimo.listarEmprestimos();
                    break;
                case 3:
                    Emprestimo.editarEmprestimo();
                    break;
                case 4:
                	Emprestimo.excluiremprestimo();
                    break;
                case 5:
                	Emprestimo.listarRelatorioMensal();
                    break;
                case 6:
                	Emprestimo.listarEmprestimoCliente();
                    break;
                default:
                    System.out.println("Saindo do Menu Alugueis");
                  
            }
        }

    }

}
