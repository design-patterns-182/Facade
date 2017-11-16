package br.com.studiotrek;

/***
 * <p>
 * 	Classe de representação de cliente.
 * </p>
 * @author kleber
 * @version 1.0
 */
public class Cliente {
	private String nome;

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void alerta(String mensagem) {
		System.out.println("Usuario " + nome + " " + mensagem);
	}

}
