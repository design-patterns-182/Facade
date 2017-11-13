package br.com.studiotrek;

public class Pedido {

	private String produto;
	private String cliente;
	private String enderecoEntrega;

	public Pedido(String produto, String cliente, String enderecoEntrega) {
		super();
		this.produto = produto;
		this.cliente = cliente;
		this.enderecoEntrega = enderecoEntrega;
	}

	public String getProduto() {
		return produto;
	}

	public String getCliente() {
		return cliente;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

}
