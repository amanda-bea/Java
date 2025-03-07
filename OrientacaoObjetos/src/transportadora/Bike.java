package transportadora;


public class Bike extends Vehicle{
	private int numPassanger;
	private float weight;
	
	public Bike(String cor, String marca, String modelo, int numPassanger, float weight) {
		super(cor, modelo, marca);
		this.numPassanger = numPassanger;
		this.weight = weight;
	}

	@Override
	public int numberOfPassenger() {
		return numPassanger;
	}
	
	@Override
	public void drive() {
		System.out.println("Guiando a bicicleta " + getMarca() + " " + getModelo() + " " + getCor() + " peso máximo " + maxWeight());
	}

	public int getNumPassanger() {
		return numPassanger;
	}

	public void setNumPassanger(int numPassanger) {
		this.numPassanger = numPassanger;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float maxWeight() {
		return this.weight;
	}
}
