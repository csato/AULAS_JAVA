/**
*
*  
*/

class PedidoCompra{

	public static void main (String[] args){
		//operadores
		// += -= %=
		// * % - + / %
		// ++ --
		int contador = 10;

		System.out.println("init"+contador);

		contador++;
		System.out.println("posfixado "+contador);

		++contador;
		System.out.println("prefixado "+contador);

		int totalEstoque = 20;
		int valor = ++contador + totalEstoque;

		System.out.println("contador "+contador);
		System.out.println("valor "+valor);
	
		//operadores lógicos
		// && ||  >= <= < > == !=  !
	
		//operador ternário
		int quantReqrida = 20;
		int estoque =40;
		boolean temEstoque = quantReqrida < estoque;

		//if condicao {}
		//if (estoque > quantReqrida) ; pegadinha de prova 
		// o que executa depois do if - só o ";"
			if (estoque > quantReqrida) 
			{
			System.out.println("gejoprgjdpgjdp");
			}
		






	}








}
