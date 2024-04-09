package ex2;

import br.edu.fateczl.fila.Fila;

public class OperacaoController {
	
	public static void Caixa (Fila<Cliente> fila) {
		float valorTotal;
		int tam = fila.size();
		for(int i = 0; i < tam; i++) {
			Cliente cliente = new Cliente();
			cliente = fila.remove();
			valorTotal = cliente.getQuantidadePecas() *
					cliente.getValorPecas();
			System.out.println("Nome do Cliente: " + cliente.getNome() +
			"\nValor Total da Compra: " + valorTotal + "\n");
			
		}
	}

}
