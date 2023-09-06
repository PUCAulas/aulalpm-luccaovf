import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipamentoTest {

	Equipamento equipamento = new Equipamento("Britadeira", "Quebrar pedras", 2);
	
	@Test
	void verificarSeEquipamentoExiste() {
		assertEquals(2, equipamento.getCodigoEquipamento());
	}
	
	

}
