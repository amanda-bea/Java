package transportadora;


public abstract class Vehicle implements Passengers, Load {
	private String cor;
	private String modelo;
	private String marca;
	
	public Vehicle() {}
	public Vehicle(String cor, String modelo, String marca) {
		this.cor = cor;
		this.modelo = modelo;
		this.marca = marca;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public float maxWeight() {
		return 0;
	}

	@Override
	public int numberOfPassenger() {
		return 0;
	}
	
	abstract void drive();

}
