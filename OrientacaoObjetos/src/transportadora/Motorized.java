package transportadora;

public interface Motorized {
	void start();
	interface Eletric {
		void carregarBateria();
	}
	interface Fuel {
		void abastecer();
	}
}
