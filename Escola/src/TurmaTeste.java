
public class TurmaTeste {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Turma turma = new Turma();
		Aluno jose = new Aluno ();
		Aluno cris = new Aluno ();
		Aluno jose2 = new Aluno ();
		Aluno cris2 = new Aluno ();
		Curso java = new Curso();
		
		jose.nome = "Jose da Silva Bisso";
		jose.cpf="234234234535647";
			
		java.nome ="academia java";
		java.dataInicio="4/4/2016";
		java.dataFim="18/7/2016";
		java.quantidadeModulos=4;
		
		
		turma.iniciaTurma(java);
		turma.matricular(jose);
		
		cris.nome = "2Jose2 da Silva2 Bisso";
		cris.cpf="22222234535647";
		turma.matricular(cris);

		cris2.nome = "2Jose2 da Silva2 Bisso";
		cris2.cpf="22222234535647";
		turma.matricular(cris);
		
		jose2.nome = "2Jose2 da Silva2 Bisso";
		jose2.cpf="22222234535647";
		turma.matricular(cris);
	
	}

}
