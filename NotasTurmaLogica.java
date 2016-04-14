class NotasTurmaLogica{

	public static void main (String[] args){
		
		String [] nomes = new String[10];

		float[] notas = new float [10];
		

		//System.out.println("Nomes " + nomes);

		//System.out.println("nomes[1]" + nomes[1]);

		//System.out.println("notas "+ notas);
		//System.out.println("notas[1] "+ notas[1]);

		nomes[0]="Jose";
		notas[0] = 6.5F;
		nomes[1]="Maria";
		notas[1] = 6.7F;
		nomes[2]="João";
		notas[2] = 6.9F;
		nomes[3]="Jairo";
		notas[3] = 7.1F;
		
		for (int i =0; i<10;i++){
		
			if (nomes[i]!=null){
				System.out.println("nomes " + nomes[i]);
				System.out.println("notas "+ notas[i]);
			}


		}

	}



























}
