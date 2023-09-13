import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteTest {

    @Test
    public void testAdicionarCliente() {
    Cliente novoCliente = new Cliente("1",3);

    Cliente.armazenamentoCliente.clear(); 
    Cliente.adicionarCliente(novoCliente);

    assertEquals(1, Cliente.armazenamentoCliente.size());
    assertEquals(novoCliente, Cliente.armazenamentoCliente.get(3));
}
    @Test
    public void testEditarCliente() {
    Cliente cliente = new Cliente("1", 2);
    
    Cliente.armazenamentoCliente.clear();
    Cliente.adicionarCliente(cliente);
  
    Cliente.editarCliente();
    assertEquals("IanEditado", cliente.getNome());
}
   
    @Test
    public void testExcluirCliente() {
    Cliente cliente = new Cliente("1", 2);
        
        Cliente.armazenamentoCliente.clear(); 
        Cliente.adicionarCliente(cliente);

        
        Cliente.excluirCliente();
        assertEquals(0, Cliente.armazenamentoCliente.size());
    }
  
}
