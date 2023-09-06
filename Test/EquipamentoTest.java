import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipamentoTest {

	Equipamento equipamento = new Equipamento("Estante", "guardar remedios", 2);
	
	
	@Test
	void verificarSeEquipamentoExiste() {
		assertEquals(2, equipamento.getCodigoEquipamento());
	}
	
	@Test
	void addEqp() {
		Equipamento equipamento = new Equipamento("Estante", "guardar remedios", 2);
        equipamento.armazenamento.add(equipamento);
		assertEquals("Estante",equipamento.getTipoEquipamento());
		assertEquals("guardar remedios",equipamento.getDescricaoEquipamento());
		assertEquals(2,equipamento.getCodigoEquipamento());



	}
	

}
