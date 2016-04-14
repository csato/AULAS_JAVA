class NotasTurmaLogica{

	public static void main (String[] args){
		
		String [] nomes = new String[10];

		float[] notas = new float [10];
		//notas.length

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
		for (int i =0; i<10;i++){
			nomes[i] = "Aluno Matricula - 00 " + ( i+20);
			notas[i] = 6.5F + 0.2F*i;
		//		if (i!=0){
		//			notas[i] = notas[i-1]+0.2F;
		//		}else 
		//		notas[i] = 6.5F;
		}
		for (int i =0; i<10;i++){
			System.out.println(nomes[i]+" - "+ notas[i]);
		}
		System.out.println("tamanho notas "+ notas.length);
			
	}
}


