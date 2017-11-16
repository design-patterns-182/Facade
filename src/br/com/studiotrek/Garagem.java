package br.com.studiotrek;

import java.util.List;

/***
 * <p>
 * 	Classe de representação de garagem.
 * </p>
 * @author kleber
 * @version 1.0
 */
public class Garagem {
	public Carro getCarroDisponivel() throws Exception {
		List<Carro> carros = new Carro().getListCarros();

		for (Carro carro : carros) {
			if (carro.getOcupacao() == false) {
				return carro;
			}
		}

		throw new Exception("não existe carro disponivel no momento");
	}

	public String enviarCarro(Carro carro) throws Exception {
		if (carro != null) {
			return "estamos enviado o carro: " + carro.getModelo() + " com o motorista: " + carro.getNomeMotorista() + " "
					+ carro.enviarCarro();
		}

		throw new Exception("erro ao enviar carro");
	}

}
