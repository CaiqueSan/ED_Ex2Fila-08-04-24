package ex2;

import java.util.Random;
import br.edu.fateczl.fila.Fila;

public class Principal {

	public static void main(String[] args) {
		 Fila<Cliente> fila = new Fila<Cliente>();
		 
		 for (int i = 1; i < 21; i++) {
			 Random rand = new Random();
			 int random = (rand.nextInt(50 - 20 + 1)+ 20);
			 float random2 = 5.00f + rand.nextFloat() * (100.00f - 5.00f);
			 Cliente cliente = new Cliente();
			 String nome = "Cliente" + i;
			 cliente.setNome(nome);
			 cliente.setQuantidadePecas(random);
			 cliente.setValorPecas(random2);
			 fila.insert(cliente);
		 }
		 
//		 System.out.println(fila.size());
		 OperacaoController.Caixa(fila);
		 
//		 for (int i = 1; i < 21; i++) {
//			Cliente cliente = new Cliente();
//			cliente = fila.remove();
//			System.out.println(cliente.toString());
//		 }

	}

}
