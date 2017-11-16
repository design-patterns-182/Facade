package br.com.studiotrek;

public class Main {

	public static void main(String[] args) {
		Solicitacao solicitacao = new Solicitacao("Rua das Amoras", 12.45);
		Garagem garagem = new Garagem();
		
		ClienteFacade clienteFacade = new ClienteFacade(solicitacao, garagem);
		clienteFacade.RealizarSolicitacao(new Cliente("Alfredo"));
	}

}
