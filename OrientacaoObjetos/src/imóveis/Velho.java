package imóveis;

public class Velho extends Imovel {
	private double p;
	public Velho() {
		
	}
	public Velho(String endereco, double preco) {
		super(endereco, preco);
	}
	@Override
	public void imprimirDados() {
		System.out.printf("O velho imóvel no endereço %s custa R$ %.2f\n", this.getEndereco(), this.precoFinal(getPreco(), p));
	}
	private double precoFinal(double preco, double p) {
		return (getPreco() * (1 - (p/100)));
	}
	public double getP() {
		return p;
	}
	public void setP(double p) {
		this.p = p;
	}
}
