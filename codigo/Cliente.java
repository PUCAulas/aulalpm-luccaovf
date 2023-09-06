import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cliente {
    public String nome;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    static ArrayList<Cliente> armazenamentoCliente = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    // Salvando equipamento
    public void salvarCliente(ArrayList<Cliente> armazenamentoCliente) {
        armazenamentoCliente.addAll(0, armazenamentoCliente);
    }

    // metodo para adicionar equipamento
    public static void adicionarCliente(Scanner scanner) {
        String nome;

        System.out.println("\nDigite o nome do Cliente: ");
        nome = input.nextLine();
        int codigoCliente = random.nextInt(99999999);
        System.out.println("\nCodigo Gerado Automaticamente: " + codigoCliente);

        Cliente novoCliente = new Cliente(nome, codigoCliente);
        armazenamentoCliente.add(novoCliente);
    }

    // metodo para listar todos equipamentos
    public static void listarCliente() {
        System.out.println("\nLista de Clientes:");
        for (Cliente cliente : armazenamentoCliente) {
            System.out.println(
                    "ID: " + cliente.getId() + ", Nome: " + cliente.getNome());
        }
    }

    // metodo para editar todos equipamentos
    public static void editarCliente() {
        int codigoAlter = 0;

        System.out.println("Digite o codigo que deseja alterar o cliente: ");
        codigoAlter = input.nextInt();
        input.nextLine();

        for (Cliente cliente : armazenamentoCliente) {
            if (cliente.getId() == codigoAlter) {
                System.out.println("Equipamento Encontrado, nome: " + cliente.getNome());

                System.out.println("Digite o novo nome do cliente: ");
                String novoNome = input.nextLine();
                cliente.setNome(novoNome);
                System.out.println("Cliente Alterado Com Sucesso");

            } else {
                System.out.println("Cliente com o codigo: " + codigoAlter + " Nao encontrado");
            }
        }
    }

    // metodo para excluir equipamento
    static void excluirCliente() {
        int codigoExcluir = 0;
        System.out.println("Digite o codigo do cliente que deseja excluir: ");
        codigoExcluir = input.nextInt();

        Cliente clienteRemovido = null;
        for (Cliente cliente : armazenamentoCliente) {
            if (cliente.getId() == codigoExcluir) {
                clienteRemovido = cliente;
                armazenamentoCliente.remove(clienteRemovido);
                System.out.println("Cliente removido com sucesso!");
                break;
            } else {
                System.out.println("Codigo Invalido");
            }

        }
    }
}
