
class TesteCelular {

	public static void main(String[] args) {
		
// <classe> <nome variavel> [ = <new> <classe>() ];
		Celular motox = new Celular();
		
		motox.bateria = "XYZ ";
		motox.cor = "Preto";
		motox.fabricante = "Moto";
		motox.modelo = "motog";
		motox.nome = "motog 123";
		motox.processador = "dualcore";
		motox.memoriaRam = 4.0f;
		motox.qualidadeSom = 123;
		motox.sistemaOperacional = "Android";
		motox.tamanho = 13.5f;
		motox.tamanhoTela =4.5f;
		
		System.out.println("Moto x " + motox);
	}

}
