import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class EmprestimoTest {
//classe de teste da classe emprestimo
	@Test
    public void testCalculaDiasEmprestimo() {
		//teste da funcao que calcula o numero de dias de um emprestimo
		
        LocalDate dataInicio = LocalDate.of(2023, 9, 1);
        LocalDate dataFim = LocalDate.of(2023, 9, 5);
        Cliente cliente = null;
        Equipamento equipamento = null;//o cliente e equipamento para esse teste foram desconsiderados
        Emprestimo emprestimo = new Emprestimo(1000.0, dataInicio, dataFim, cliente, equipamento, 1);//criando um emprestimo de valor diario de 1000 e com as datas especificadas anteriormente

        long resultado = emprestimo.calculaDiasEmprestimo();
        assertEquals(4, resultado); // Espera-se que a diferença entre as datas seja 4 dias
	}
	
	
}
