import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Equipamento {
    public String tipoEquipamento;
    public String descricaoEquipamento;
    private Integer codigoEquipamento;

    // criando os construtores
    Equipamento(String tipoEquipamento, String descricaoEquipamento, Integer codigoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
        this.descricaoEquipamento = descricaoEquipamento;
        this.codigoEquipamento = codigoEquipamento;
    }

    Equipamento() {

    }

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public String getDescricaoEquipamento() {
        return descricaoEquipamento;
    }

    public void setDescricaoEquipamento(String descricaoEquipamento) {
        this.descricaoEquipamento = descricaoEquipamento;
    }

    public Integer getCodigoEquipamento() {
        return codigoEquipamento;
    }

    public void setCodigoEquipamento(Integer codigoEquipamento) {
        this.codigoEquipamento = codigoEquipamento;
    }
    
    
    ArrayList<Equipamento> arrayEquipamento = new ArrayList<>();
    static ArrayList<Equipamento> armazenamento = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();


    
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
        System.out.println("Equipamento Adicionado");
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
    static void excluirEquipamento() {
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
    
    public static Equipamento encontraEquipamento(int id) {
    	Equipamento encontrado;
    	for(Equipamento equipamento : armazenamento) {
    		if(equipamento.getCodigoEquipamento() == id) {
    			encontrado = equipamento;
    			return encontrado;
    		}
    	}
		return null;
    }
    }
