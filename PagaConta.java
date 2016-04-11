class PagaConta{

	public static void main (String[] args){

		String loja = " CEM ";
		String produto = " TV LED ";
		double valorTotalCompra = 2300.00;	
		int totalParcelas = 18;
		
		//Saber qual é o valor de cada parcela
		double parcela;
		parcela = (2300.00/18);
		
		System.out.println("parcela "+ parcela);

		//Adicionar 0.123 de juros nas parcelas
		
		double juros = parcela * 0.123;
		parcela += juros;
		//ou parcelascomjuros * 1.123;

		//Imprimir total + juros do carne

		System.out.println("parcela com juro "+ parcela);

		//Pagar um numero X de parcelas

		double parcelaPaga = 10 * parcela;
		System.out.println("parcelas pagas "+ parcelaPaga);

		//Avaliar se o carne está totalmente quitado 
		if( parcelaPaga > valorTotalCompra )
			System.out.println("acabei de pagar" );

		System.out.println("continue pagando!!!" );



	}

}
