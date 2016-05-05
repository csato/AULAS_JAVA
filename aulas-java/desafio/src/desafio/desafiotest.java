package desafio;

public class desafiotest {
	
	public int solution(int[] valores){
		
		int resultado = 0; 
		for (int valor : valores){
			resultado ^⁼ valor;
			System.out.println(valor);
		}
		return resultado;
	}
}