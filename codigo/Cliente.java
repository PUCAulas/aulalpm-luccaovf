public class Cliente {
    private Integer codigoCliente;
    public String nome;
    
    public Cliente(Integer codigoCliente, String nome) {
        this.codigoCliente = codigoCliente;
        this.nome = nome;
    }
    public Integer getCodigoCliente() {
        return codigoCliente;
    }
    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}