import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Equipamento> armazenamento = new ArrayList<>();

    static Equipamento eqp = new Equipamento();
    static Random random = new Random();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // array dos objetos
        ArrayList<Emprestimo> arrayEmprestimo = new ArrayList<>();
        ArrayList<Cliente> arrayCliente = new ArrayList<>();
        ArrayList<Equipamento> arrayEquipamento = new ArrayList<>();

        // atributos para addEquipamento

        int opcaoMenu = 99;
        while (opcaoMenu != 0) {
            System.out.println("-------");
            System.out.println("\n1 - Cadastrar Equipamentos");
            System.out.println("\n2 - Listar Equipamentos");
            System.out.println("\n3 - Edit Equipamentos");
            System.out.println("\n4 - Remover Equipamentos");

            System.out.println("-------");

            System.out.println("\nDigite a opcao que deseja: ");
            opcaoMenu = input.nextInt();
            input.nextLine(); // limpando o buffer do teclado
            switch (opcaoMenu) {
                case 1:
                    adicionarEquipamento(input);
                    break;
                case 2:
                    listarEquipamentoP();
                    break;
                case 3:
                    editarEquipamento();
                    break;
                case 4:
                    excluirEquipamento();
                    break;
                case 5:
                    break;
                case 6:
                    break;

            }
        }

    }

    public void listarClinte(ArrayList<Cliente> arrayCliente) {
        int cont = 0;
        for (Cliente i : arrayCliente) {
            System.out.println("Numero do Cliente: " + cont + ", Nome Cliente: " + i.getNome());
            cont++;
        }
    }

    public void listarEquipamento(ArrayList<Equipamento> armazenamento) {
        int cont = 0;
        for (Equipamento i : armazenamento) {
            System.out.println("Numero do Equipamento: " + cont + ", Nome Equipamento: " + i.getTipoEquipamento()
                    + ", Descricao Equipamento: " + i.getDescricaoEquipamento());
            ;
            cont++;
        }
    }

    public void realizarAluguel(ArrayList<Emprestimo> arrayEmprestimo) {

    }

    // Salvando equipamento
    public void salvarEquipamento(ArrayList<Equipamento> armazenamento) {
        armazenamento.addAll(0, armazenamento);
    }

    // metodo para adicionar equipamento
    public static void adicionarEquipamento(Scanner scanner) {
        String tipoEquipamento, descricao;

        System.out.println("\nDigite o nome do Equipamentos: ");
        tipoEquipamento = input.nextLine();
        System.out.println("\nDigite a descricao do Equipamento: ");
        descricao = input.nextLine();
        int codigoEquipamento = random.nextInt(99999999);
        System.out.println("\nCodigo Gerado Automaticamente: " + codigoEquipamento);

        Equipamento novoEquipamento = new Equipamento(tipoEquipamento, descricao, codigoEquipamento);
        armazenamento.add(novoEquipamento);
    }

    // metodo para listar todos equipamentos
    public static void listarEquipamentoP() {
        System.out.println("\nLista de Equipamentos:");
        for (Equipamento equipamento : armazenamento) {
            System.out.println(
                    "ID: " + equipamento.getCodigoEquipamento() + ", Nome: " + equipamento.getTipoEquipamento() +
                            ", Descricao: " + equipamento.getDescricaoEquipamento());
        }
    }

    // metodo para editar todos equipamentos
    public static void editarEquipamento() {
        int codigoAlter = 0;

        System.out.println("Digite o codigo que deseja alterar o equipamento: ");
        codigoAlter = input.nextInt();
        input.nextLine();

        for (Equipamento equipamento : armazenamento) {
            if (equipamento.getCodigoEquipamento() == codigoAlter) {
                System.out.println("Equipamento Encontrado, nome: " + equipamento.getTipoEquipamento() + " Descricao: "
                        + equipamento.getDescricaoEquipamento());

                System.out.println("Digite o novo nome do equipamento: ");
                String novoNome = input.nextLine();
                System.out.println("Digite a novo descricao: ");
                String novaDesc = input.nextLine();
                equipamento.setTipoEquipamento(novoNome);
                equipamento.setDescricaoEquipamento(novaDesc);
                System.out.println("Equipamento Alterado Com Sucesso");

            } else {
                System.out.println("Equipamento com o codigo: " + codigoAlter + " Nao encontrado");
            }
        }

    }

    // metodo para excluir equipamento
    private static void excluirEquipamento() {
        int codigoExcluir = 0;
        System.out.println("Digite o codigo do equipamento que deseja excluir: ");
        codigoExcluir = input.nextInt();

        Equipamento equipamentoRemovido = null;
        for (Equipamento equipamento : armazenamento) {
            if (equipamento.getCodigoEquipamento() == codigoExcluir) {
                equipamentoRemovido = equipamento;
                armazenamento.remove(equipamentoRemovido);
                System.out.println("Equipamento removido com sucesso!");
                break;
            } else {
                System.out.println("Codigo Invalido");
            }

        }

    }
}
