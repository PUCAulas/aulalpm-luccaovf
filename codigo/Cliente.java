import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cliente {
    public String nome;
    static ArrayList<Cliente> armazenamentoCliente = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();
    
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

    

    // Salvando cliente
    public void salvarCliente(ArrayList<Cliente> armazenamentoCliente) {
        armazenamentoCliente.addAll(0, armazenamentoCliente);
    }

    // metodo para adicionar cliente

    public static void adicionarCliente(Scanner scanner) {

        String nome;

        System.out.println("\nDigite o nome do Cliente: ");
        nome = input.nextLine();
        int codigoCliente = random.nextInt(99999999);
        System.out.println("\nCodigo Gerado Automaticamente: " + codigoCliente);

        Cliente novoCliente = new Cliente(nome, codigoCliente);
        armazenamentoCliente.add(novoCliente);
    }

    // metodo para listar todos clientes
    public static void listarCliente() {
        System.out.println("\nLista de Clientes:");
        for (Cliente cliente : armazenamentoCliente) {
            System.out.println(
                    "ID: " + cliente.getId() + ", Nome: " + cliente.getNome());
        }
    }

    // metodo para editar todos clientes
    public static void editarCliente() {
        int codigoAlter = 0;

        System.out.println("Digite o codigo que deseja alterar o cliente: ");
        codigoAlter = input.nextInt();
        input.nextLine();

        Cliente clienteEditado;
        clienteEditado = Cliente.encontraCliente(codigoAlter);
        if(clienteEditado != null) {
        	System.out.println("Cliente Encontrado, nome: " + clienteEditado.getNome());
                
        	System.out.println("Digite o novo nome do cliente: ");
        	String novoNome = input.nextLine();
        	clienteEditado.setNome(novoNome);
        	System.out.println("Cliente Alterado Com Sucesso");
        }
        else
        	System.out.println("Cliente com o codigo: " + codigoAlter + " Nao encontrado");
    }

    // metodo para excluir cliente
    static void excluirCliente() {
        int codigoExcluir = 0;
        System.out.println("Digite o codigo do cliente que deseja excluir: ");
        codigoExcluir = input.nextInt();

        Cliente clienteExcluido;
        clienteExcluido = Cliente.encontraCliente(codigoExcluir);
        
         if (clienteExcluido != null) {
             armazenamentoCliente.remove(clienteExcluido);
             System.out.println("Cliente removido com sucesso!");
         } else {
             System.out.println("Codigo Invalido");
         }
    }
    
    public static Cliente encontraCliente(int id) {
    	Cliente encontrado;
    	for(Cliente cliente : armazenamentoCliente) {
    		if(cliente.getId() == id) {
    			encontrado = cliente;
    			return encontrado;
    		}
    	}
		return null;
    }
}
