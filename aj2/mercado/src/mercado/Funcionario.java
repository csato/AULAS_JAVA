/**
 * 
 */
package mercado;

/**
 * @author aluno
 *
 */
public class Funcionario extends Pessoa {

	private String identificacao;
	private String dataAdmissao;
	private int horasTrabalhadas;
	private int horasExtras;
	
	
	public Funcionario(String identificacao, String dataAdmissao, int horasTrabalhadas, int horasExtras) {
		super();
		this.identificacao = identificacao;
		this.dataAdmissao = dataAdmissao;
		this.horasTrabalhadas = horasTrabalhadas;
		this.horasExtras = horasExtras;
	}

	/**
	 * 
	 */
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nome
	 * @param cpf
	 */
	public Funcionario(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

}
