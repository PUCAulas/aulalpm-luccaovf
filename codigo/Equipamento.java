import java.util.ArrayList;
import java.util.Scanner;

public class Equipamento {
    public String tipoEquipamento;
    public String descricaoEquipamento;
    private Integer codigoEquipamento;
    // criando array
    ArrayList<Equipamento> armazenamento = new ArrayList<>();

    // criando scanner
    Scanner input = new Scanner(System.in);

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

    // addEquipamento
    void addEquipamento(Equipamento newEqp) {
        armazenamento.add(newEqp);

    }

    void imprimir() {
        System.out.println("-------- Listagem Dos Equipamentos -------- ");
        System.out.println("\nNome Do Equipamento: " + tipoEquipamento);
        System.out.println("\nDescricao do Equipamento: " + descricaoEquipamento);
        System.out.println("\nCodigo Do Equipamento: " + codigoEquipamento);
    }
}
