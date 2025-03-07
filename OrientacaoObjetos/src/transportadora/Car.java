package transportadora;


public class Car extends Vehicle {
	private int numPassenger;
	private float weight;
	
	public Car() {}
	public Car(String cor, String modelo, String marca, int numPassenger, float weight) {
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
	void drive() {
		System.out.printf("Dirigindo o carro %s %s que tem peso máximo %f e número de Passageiro %d\n", getMarca(), getModelo(), maxWeight(), numberOfPassenger());
	}
	public int numberOfPassenger() {
		return numPassenger;
	}
	public float maxWeight() {
		return this.weight;
	}
}
