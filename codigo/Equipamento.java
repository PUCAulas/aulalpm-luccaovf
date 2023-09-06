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

}
