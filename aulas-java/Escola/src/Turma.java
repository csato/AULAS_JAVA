class Turma {
	Aluno [] alunos ;
	
	Professor professor;
	
	int capacidade = 3;
	
	Sala sala;
	
	Curso curso;
	
	void iniciaTurma (Curso novoCurso){
		alunos = new Aluno[capacidade];
		curso = novoCurso;
		
	}
	
	
	//matricular aluno
	//Sintaxe : [modificadores], tipo de retorno, nomeMetodo ([Parametros]), {}

	void matricular (Aluno aluno){
			if (aluno == null) return;
			
			int totalinscritos = obtemAlunosInscritos();
			
			if( temVagas()){
				System.out.println("nao ha vagas");
				return;
			}
			
			alunos[totalinscritos]= aluno;
			System.out.println("Aluno nome "+aluno.nome+"  Matriculado!!!");				
			
	}
	
	boolean temVagas(){
		int i = obtemAlunosInscritos();
		return i == alunos.length;
		
	}
	
	int obtemAlunosInscritos(){
		
		int totalAlunos = 0;
		
		for (int i = 0; i < alunos.length; i++){
			
			if (alunos[i] != null) totalAlunos++;
		
		}
			return totalAlunos;
	}
		
		

		
	}
	
