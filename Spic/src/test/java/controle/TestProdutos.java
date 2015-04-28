package controle;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

import BusinessRules.Produtos;

public class TestProdutos {

	@Test
	public void deveImprimirDataEmFormatoBrasileiro() throws ParseException {
		Produtos p = new Produtos();
		p.setDataValidade(21, 04, 2015);
		Calendar c =  new GregorianCalendar(2015, 04, 21);	
		assertEquals(c, p.getDataValidade());
	}

}
