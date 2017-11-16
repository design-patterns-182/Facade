package br.com.studiotrek;

import org.junit.Assert;
import org.junit.Test;

public class SolicitacaoTest {

	/***
	 * <p>
	 * O valor máximo para uma solicitação ser aceita deve ser de R$ 30.00
	 * </p>
	 */

	@Test
	public void testVerificarSolicitacao() {
		try {
			Solicitacao solicitacao = new Solicitacao("Rua das Orquidias", 15.0);
			solicitacao.verificarSolicitacao();
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

}
