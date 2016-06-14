package CollectionExemplo;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Carro carro1 = new Carro("9.0", "azul");
		Carro carro2 = new Carro("8.0", "vermelho");
		Carro carro3 = new Carro("9.0", "azul");
		
		carro1.equals(carro2);
		carro1.equals(carro3);
	}

}
