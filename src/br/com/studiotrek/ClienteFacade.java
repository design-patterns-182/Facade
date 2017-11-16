package br.com.studiotrek;

/***
 * <p>
 * Classe responsável pelo encapsulamento das etapas que um processo deve seguir.
 * Todo o fluxo de processo está encapsulado em <code>RealizarSolicitacao(Cliente cliente)<code>
 * e passamos um <code>Cliente</code> como argumento pois quem realiza a solicitação é o cliente.
 * <p>
 * 
 * @author <a href="mailto:klebernunes182@gmail.com"> kleber </a>
 * @version 1.0
 */
public class ClienteFacade {
	private Solicitacao solicitacao;
	private Garagem garagem;

	public ClienteFacade(Solicitacao solicitacao, Garagem garagem) {
		this.solicitacao = solicitacao;
		this.garagem = garagem;
	}

	public void RealizarSolicitacao(Cliente cliente) {
		try {
			this.solicitacao.verificarSolicitacao();
			Carro carro = this.garagem.getCarroDisponivel();
			String mensagem = this.garagem.enviarCarro(carro);
			cliente.alerta(mensagem);
		} catch (Exception e) {
			cliente.alerta(e.getMessage());
		}
	}

}
