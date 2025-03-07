package imóveis;

public class Novo extends Imovel {
	private double p;

	public double getP() {
		return p;
	}
	public void setP(double p) {
		this.p = p;
	}
	public Novo() {
		
	}
	public Novo(String endereco, double preco) {
		super(endereco, preco);
	}
	@Override
	public void imprimirDados() {
		System.out.printf("O novo imóvel no endereço %s custa R$ %.2f\n", this.getEndereco(), this.precoFinal(getPreco(), p));
	}
	private double precoFinal(double preco, double p) {
		return (getPreco() * (1 + (p/100)));
	}
}
