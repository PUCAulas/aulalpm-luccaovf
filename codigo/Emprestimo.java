import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Emprestimo {
	private double valorEmprestimo;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private Cliente cliente;
	private Equipamento equipamento;
	private int id;
	
	static ArrayList<Emprestimo> armazenamentoEmprestimo = new ArrayList<>();
	static Scanner input = new Scanner(System.in);
    static Random random = new Random();
	
	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public double getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(double valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}


	public Emprestimo(double valorEmprestimo, LocalDate dataInicio, LocalDate dataFim,
			Cliente cliente, Equipamento equipamento, int id) {
		this.valorEmprestimo = valorEmprestimo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.setCliente(cliente);
		this.setEquipamento(equipamento);
		this.setId(id);
	}

	public long calculaDiasEmprestimo() {
		long qtdDias = ChronoUnit.DAYS.between(dataInicio, dataFim);
		return qtdDias;
	}

	public void imprimirValor() {
		double valorTotal = this.calculaDiasEmprestimo() * this.valorEmprestimo;
		System.out.println("O valor por dia do aluguel eh: " + this.valorEmprestimo + "\nO valor total do aluguel: "
				+ valorTotal + "\n");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	// metodo para adicionar aluguel/emprestimo
    public static void adicionarEmprestimo(Scanner scanner) {
        double valorEmprestimo;
        LocalDate dataInicio, dataFim;
        Cliente cliente;
        int dia, mes, ano;
        Equipamento equipamento;
        int codigoEmprestimo;
        int idProcura;

        System.out.println("\nDigite o id do cliente do aluguel: ");
        idProcura = input.nextInt();
        cliente = Cliente.encontraCliente(idProcura);
        System.out.println("\nDigite o id do equipamento do aluguel: ");
        idProcura = input.nextInt();
        equipamento = Equipamento.encontraEquipamento(idProcura);
        
        System.out.println("\nDigite o valor diario do aluguel: ");
        valorEmprestimo = input.nextDouble();
        codigoEmprestimo = random.nextInt(99999999);
        System.out.println("\nCodigo Gerado Automaticamente: " + codigoEmprestimo);
        
        System.out.println("\nDigite o dia do inicio do aluguel: ");
        dia = input.nextInt();
        System.out.println("Digite o mes do inicio do aluguel: ");
        mes = input.nextInt();
        System.out.println("Digite o ano do inicio do aluguel: ");
        ano = input.nextInt();
        dataInicio = LocalDate.of(ano, mes, dia);
        
        System.out.println("\nDigite o dia do fim do aluguel: ");
        dia = input.nextInt();
        System.out.println("Digite o mes do fim do aluguel: ");
        mes = input.nextInt();
        System.out.println("Digite o ano do fim do aluguel: ");
        ano = input.nextInt();
        dataFim = LocalDate.of(ano, mes, dia);
        Emprestimo novoEmprestimo = new Emprestimo(valorEmprestimo,dataInicio, dataFim, cliente, equipamento, codigoEmprestimo);
        armazenamentoEmprestimo.add(novoEmprestimo);
    }

    // metodo para listar todos Emprestimos
    public static void listarEmprestimos() {
        System.out.println("\nLista de Alugueis:");
        for (Emprestimo emprestimo : armazenamentoEmprestimo) {
            System.out.println("ID: " + emprestimo.getId());
            emprestimo.imprimirValor();
        }
    }

    // metodo para editar todos emprestimos
    public static void editarEmprestimo() {
        int codigoAlter = 0;

        System.out.println("Digite o codigo do aluguel que deseja alterar: ");
        codigoAlter = input.nextInt();
        input.nextLine();

        for (Emprestimo emprestimo : armazenamentoEmprestimo) {
            if (emprestimo.getId() == codigoAlter) {
                System.out.println("Aluguel Encontrado, ID: " + emprestimo.getId());

                System.out.println("\nDigite novo o valor diario do aluguel: ");
                double valorEmprestimo = input.nextDouble();
                emprestimo.setValorEmprestimo(valorEmprestimo);
                System.out.println("Valor do emprestimo alterado com sucesso!");

            } else {
                System.out.println("Cliente com o codigo: " + codigoAlter + " Nao encontrado");
            }
        }
    }

    // metodo para excluir emprestimo
    static void excluiremprestimo() {
        int codigoExcluir = 0;
        System.out.println("Digite o codigo do emprestimo que deseja excluir: ");
        codigoExcluir = input.nextInt();

        Emprestimo emprestimoRemovido = null;
        for (Emprestimo emprestimo : armazenamentoEmprestimo) {
            if (emprestimo.getId() == codigoExcluir) {
            	emprestimoRemovido = emprestimo;
                armazenamentoEmprestimo.remove(emprestimoRemovido);
                System.out.println("Cliente removido com sucesso!");
                break;
            } else {
                System.out.println("Codigo Invalido");
            }

        }
    }
    
    public static Emprestimo encontraEmprestimo(int id) {
    	Emprestimo encontrado;
    	for(Emprestimo emprestimo : armazenamentoEmprestimo) {
    		if(emprestimo.getId() == id) {
    			encontrado = emprestimo;
    			return encontrado;
    		}
    	}
		return null;
    }
}
