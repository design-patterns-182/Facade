package br.com.studiotrek;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/***
 * <p>
 * 	Classe de representação de veiculo.
 * </p>
 * @author kleber
 * @version 1.0
 */
public class Carro {
	private String nomeMotorista;
	private String modelo;
	private Boolean ocupacao;

	public String getNomeMotorista() {
		return nomeMotorista;
	}

	public void setNomeMotorista(String nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Boolean getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(Boolean ocupacao) {
		this.ocupacao = ocupacao;
	}

	public List<Carro> getListCarros() {
		List<Carro> carros = new ArrayList<Carro>();

		for (int i = 0; i < 10; i++) {
			Carro carro = new Carro();
			carro.setNomeMotorista("Motorista " + 1);
			carro.setModelo("Corsa Preto - Placa AAA-123" + 1);
			if (i % 2 == 0) {
				carro.setOcupacao(true);
			} else {
				carro.setOcupacao(false);
			}

			carros.add(carro);
		}

		return carros;
	}

	public String enviarCarro() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return "carro enviado às " + formato.format(new Date());
	}

}
