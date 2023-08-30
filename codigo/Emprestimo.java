import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
	private double valorEmprestimo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Cliente cliente;
    private Equipamento equipamento;
    
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

    
    //registrar emprestimo o array de emprestimo vai estar no main
	public Emprestimo(double valorEmprestimo, Integer numeroDeDias, LocalDate dataInicio, LocalDate dataFim,
			Cliente cliente, Equipamento equipamento) {
		this.valorEmprestimo = valorEmprestimo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.setCliente(cliente);
		this.setEquipamento(equipamento);
	}
    
	public long calculaDiasEmprestimo() {
		long qtdDias = ChronoUnit.DAYS.between(dataInicio, dataFim);
		return qtdDias;
	}
	
	public void imprimirValor() {
		double valorTotal = this.calculaDiasEmprestimo()*this.valorEmprestimo;
		System.out.println("O valor por dia do aluguel eh: "+this.valorEmprestimo+"\nO valor total do aluguel: "+valorTotal+"\n");
	}
	
   
}
