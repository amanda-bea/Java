package transportadora;


public class EletricBike extends Bike implements Motorized.Eletric {
	
	
	public EletricBike(String cor, String modelo, String marca, int numPassangers, float weight) {
		super(cor, modelo, marca, numPassangers, weight);
	}
	@Override
	public void carregarBateria() {
		System.out.println("Carregando a bateria da bicicleta " + getCor());

	}
	public void start() {
		System.out.println("Bicicleta elétrica " + getMarca() + " " + getModelo() + " que tem peso máximo " + maxWeight() + " e número de Passageiro " + numberOfPassenger());
		
	}
	
}

