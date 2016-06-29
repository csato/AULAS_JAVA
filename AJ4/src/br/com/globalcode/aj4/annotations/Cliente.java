package br.com.globalcode.aj4.annotations;

/**
 * Essa classe é para teste
 * 
 * @version
 * @author Gustavo
 * 
 */

public class Cliente {

	private int codigo;

	@GUIVisible(nomeCampo = "Nome:")
	private String nome;

	@GUIVisible(nomeCampo = "Endereco:")
	private String endereco;

	@GUIVisible(nomeCampo = "Documento:")
	private String documento;

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
