class Turma {
	Aluno [] alunos ;
	
	Professor professor;
	
	int capacidade = 7;
	
	Sala sala;
	
	Curso curso;
	
	void iniciaTurma (){
		alunos = new Aluno[capacidade];
	}
	
	//matricular aluno
	//Sintaxe : [modificadores], tipo de retorno, nomeMetodo ([Parametros]), {}

	void matricular (Aluno aluno){
		
		System.out.println("Aluno "+aluno.nome+"  Matriculado!!");
		
		
	}
	
}
