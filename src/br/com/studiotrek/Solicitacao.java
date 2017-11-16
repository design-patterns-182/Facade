package br.com.studiotrek;

/***
 * <p>
 * Classe de representação de uma solicitação.
 * </p>
 * 
 * @author kleber
 * @version 1.0
 */
public class Solicitacao {
	private String endereco;
	private Double valor;

	public Solicitacao(String endereco, Double valor) {
		super();
		this.endereco = endereco;
		this.valor = valor;
	}

	public String getEndereco() {
		return endereco;
	}

	public Double getValor() {
		return valor;
	}

	public void verificarSolicitacao() throws Exception {
		if (this.valor > 30.0) {
			throw new Exception("valor superior ao permitido");
		}
	}

}
