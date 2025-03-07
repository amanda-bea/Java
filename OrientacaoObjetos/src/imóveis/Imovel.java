package imóveis;


abstract class Imovel {
	private String endereco;
	private double preco;
	
	public Imovel() {
		
	}
	
	public Imovel(String endereco, double preco) {
		this.endereco = endereco;
		
		if (preco > 0)
			this.preco = preco;
		else
			this.preco = 0.0;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public abstract void imprimirDados();
	
}