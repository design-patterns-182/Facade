package br.com.studiotrek;

import org.junit.Assert;
import org.junit.Test;

/***
 * <p>
 * Classe de teste para os metodos de garagem.
 * </p>
 * 
 * @author kleber
 * @version 1.0
 */
public class GaragemTest {

	@Test
	public void testCarroDisponivel() {
		try {
			Garagem garagem = new Garagem();
			Carro carro = garagem.getCarroDisponivel();

			Assert.assertNotEquals(carro, null);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

}
