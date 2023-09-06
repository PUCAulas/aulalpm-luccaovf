import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteTest {

	Cliente cliente = new Cliente("Jorge", 2);
	
	@Test
	void verificarSeClienteExiste() {
		assertEquals(2, cliente.getId());
	}
	
	

}
