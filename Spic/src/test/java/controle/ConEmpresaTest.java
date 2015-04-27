package Controle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.swing.JOptionPane;

import org.junit.Test;

import Controle.ConEmpresas;

public class ConEmpresaTest extends ConEmpresas {

	
	
	//Teste fantasia
	@Test
	public void deveAceitarNomeValidoENaoLancarExcecao() throws Exception {
		ConEmpresas c = new ConEmpresas();
		c.validaFantasia("Teste");
	}

	@Test
	public void naoDeveAceitarNomeNulo() throws Exception {
		ConEmpresas c = new ConEmpresas();
		try {
			c.validaFantasia(null);
		} catch (Exception ex) {
			assertEquals("Campo fantasia em branco!!", ex.getMessage());
		}
	}

	@Test
	public void naoDeveAceitarNomeVazio() throws Exception {
		ConEmpresas c = new ConEmpresas();
		try {
			c.validaFantasia("");
		} catch (Exception ex) {
			assertEquals("Campo fantasia em branco!!", ex.getMessage());
		}
	}

	
	//Campo Cnpj
	@Test
	public void deveAceitarUmCnpjValido() throws Exception {
		ConEmpresas c = new ConEmpresas();
		c.validaCnpj("000000000000");
	}

	@Test
	public void naoDeveAceitarUmCnpjCom13Caracteres() {
		ConEmpresas c = new ConEmpresas();
		try {
			c.validaCnpj("0000000000000");
			fail("Devia lançar exceção");
		} catch (Exception e) {
			assertEquals("Número de CNPJ inválido!!", e.getMessage());
		}
	}

	@Test
	public void deveAceitarCnpjValido() throws Exception {
		ConEmpresas c = new ConEmpresas();
		c.validaCnpj("10000000000000");
		assertEquals("10.000.000/0000-00", c.mostraCnpj());
	}
	
	@Test
	public void deveAceitarCnpjValidoComecandoPorZero() throws Exception {
		ConEmpresas c = new ConEmpresas();
		c.validaCnpj("00000000000000");
		assertEquals("00.000.000/0000-00", c.mostraCnpj());
	}

}
