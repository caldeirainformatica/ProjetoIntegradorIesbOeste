package testes;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

import businessRules.Produtos;

public class TestProdutos {

	@Test
	public void deveImprimirDataEmFormatoBrasileiro() throws ParseException {
		Produtos p = new Produtos();
		p.setDataValidade(2015,04,15);
		p.setDataFabricacao(2015,04,15);
		assertEquals(p.getDataFabricacao(), p.getDataValidade());
	}

}
