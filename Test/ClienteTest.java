import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteTest {

    @Test
    public void testAdicionarCliente() {
    // Crie um novo Cliente
    Cliente novoCliente = new Cliente("ian",3);

    // Adicione o novo cliente à lista de armazenamento
    Cliente.armazenamentoCliente.clear(); // Limpa a lista ates de adicionar
    Cliente.adicionarCliente(novoCliente);

    // Ver se o cliente foi adicionado com sucesso
    assertEquals(1, Cliente.armazenamentoCliente.size());
    assertEquals(novoCliente, Cliente.armazenamentoCliente.get(0));
}
  
}
