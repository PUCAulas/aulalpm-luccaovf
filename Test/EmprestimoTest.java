import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class EmprestimoTest {

	@Test
    public void testCalculaDiasEmprestimo() {
		
		
        LocalDate dataInicio = LocalDate.of(2023, 9, 1);
        LocalDate dataFim = LocalDate.of(2023, 9, 5);
        Cliente cliente = null;
        Equipamento equipamento = null;
        Emprestimo emprestimo = new Emprestimo(1000.0, 5, dataInicio, dataFim, cliente, equipamento);

        long resultado = emprestimo.calculaDiasEmprestimo();

        assertEquals(4, resultado); // Espera-se que a diferença entre as datas seja 4 dias
		
	}
}
