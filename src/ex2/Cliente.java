package ex2;

public class Cliente {
	
	String Nome;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getQuantidadePecas() {
		return QuantidadePecas;
	}
	public void setQuantidadePecas(int quantidadePecas) {
		QuantidadePecas = quantidadePecas;
	}
	public float getValorPecas() {
		return ValorPecas;
	}
	public void setValorPecas(float valorPecas) {
		ValorPecas = valorPecas;
	}
	int QuantidadePecas;
	float ValorPecas;
	
	@Override
	public String toString() {
		return "Nome: " + this.Nome + "\nQuantidade de peças: " + this.QuantidadePecas +
				"\nValor da Peça: " + this.ValorPecas + "\n";
	}

}
