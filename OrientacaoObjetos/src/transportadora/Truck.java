package transportadora;


public class Truck extends Vehicle implements Motorized.Fuel {
	private int numPassenger;
	private float weight;
	
	public Truck() {}
	public Truck(String cor, String marca, String modelo, int numPassenger, float weight) {
		super(cor, marca, modelo);
		this.numPassenger = numPassenger;
		this.weight = weight;
	}
	
	public int getNumPassenger() {
		return numPassenger;
	}
	public void setNumPassenger(int numPassenger) {
		this.numPassenger = numPassenger;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	@Override
	public void abastecer() {
		System.out.println("Abastecendo o caminhão " + getMarca() + " " + getModelo());
	}

	@Override
	void drive() {
		System.out.println("Dirigindo o caminhão " + getMarca() + " " + getModelo() + " " + getCor() + " peso máximo " + maxWeight());
	}
	public float maxWeight() {
		return this.weight;
	}
	public int numberOfPassenger() {
		return numPassenger;
	}
	public void start() {
		System.out.println("Caminhão " + getMarca() + " " + getModelo() + " movimentando");
	}
}
