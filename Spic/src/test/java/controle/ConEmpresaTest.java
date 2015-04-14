package controle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.swing.JOptionPane;

import org.junit.Test;

public class ConEmpresaTest extends ConEmpresa {

	@Test
	public void deveAceitarNomeValidoENaoLancarExcecao() throws Exception {
		ConEmpresa c = new ConEmpresa();
		c.validaFantasia("Teste");
	}

	@Test
	public void naoDeveAceitarNomeNulo() throws Exception {
		ConEmpresa c = new ConEmpresa();
		try {
			c.validaFantasia(null);
		} catch (Exception ex) {
			assertEquals("Fantasia inválida", ex.getMessage());
		}
	}

	@Test
	public void naoDeveAceitarNomeVazio() throws Exception {
		ConEmpresa c = new ConEmpresa();
		try {
			c.validaFantasia("");
		} catch (Exception ex) {
			assertEquals("Fantasia inválida", ex.getMessage());
		}
	}

	@Test
	public void deveAceitarUmCnpjValido() throws Exception {
		ConEmpresa c = new ConEmpresa();
		c.validaCnpj("000000000000000");
	}

	@Test
	public void naoDeveAceitarUmCnpjCom14Caracteres() {
		ConEmpresa c = new ConEmpresa();
		try {
			c.validaCnpj("00000000000000");
			fail("Devia lançar exceção");
		} catch (Exception e) {
			assertEquals("Número de CNPJ inválido!!", e.getMessage());
		}
	}

	@Test
	public void deveAceitarCnpjValido() throws Exception {
		ConEmpresa c = new ConEmpresa();
		c.validaCnpj("100000000000000");
		assertEquals("100.000.000/0000-00", c.mostraCnpj());
	}
	
	@Test
	public void deveAceitarCnpjValidoComecandoPorZero() throws Exception {
		ConEmpresa c = new ConEmpresa();
		c.validaCnpj("000000000000000");
		assertEquals("000.000.000/0000-00", c.mostraCnpj());
	}

}
