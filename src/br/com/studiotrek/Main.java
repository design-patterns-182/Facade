package br.com.studiotrek;

public class Main {

	public static void main(String[] args) {
		
		Estoque estoque = new Estoque();
		Financeiro financeiro = new Financeiro();
		PosVenda posVenda = new PosVenda();
		
		PedidoFacade pedidoFacade = new PedidoFacade(estoque, financeiro, posVenda);
		Pedido pedido = new Pedido("Notebook", "Manuel Alves", "Rua das Pitangas, 111, São Paulo, SP");
		pedidoFacade.registrarPedido(pedido);
	}
	
}
