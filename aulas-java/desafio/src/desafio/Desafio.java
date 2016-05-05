package desafio;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
	
		int [] pares = {4,4,3,3,1};
		i= test(pares);
	}

	public int test(int [] valores){
		boolean temPar = false;
		for (int valor:){	
				if( valores[x]== valores[x+1])temPar = true;
				else temPar=false;
				}
		
		for(int y=valores.length; y>=0; y--){
			if( valores[y]== valores[y-1])temPar = true;
			else temPar=false;
			}
		}
			
		return temPar;	
		}

