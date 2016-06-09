/**
 * 
 */
package Herois;

/**
 * @author aluno
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Batman batman = new Batman();
		Aquaman aquaman = new Aquaman();
		Tempestade tempestade = new Tempestade();
		Flash flash = new Flash();
		
		//usarHabilidadeEspecial(batman);
		//usarHabilidadeEspecial(aquaman);
		
		usarHabilidade(batman);
		usarHabilidade(tempestade);
		usarHabilidade(aquaman);
		usarHabilidade(flash);
		
		LevantaVoo(tempestade);
	}
	
	private static void LevantaVoo(Voador voador) {
		voador.levantarVoo();
		
	}

	private static void usarHabilidade(Heroi heroi) {
		heroi.usarHabilidadeEspecial();
		
	}


}
