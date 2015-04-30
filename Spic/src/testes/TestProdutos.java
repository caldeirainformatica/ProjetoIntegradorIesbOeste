package testes;

import static org.junit.Assert.*;
import model.Produtos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import model.Produtos;


import org.junit.Test;



public class TestProdutos {

	@Test
	public void deveImprimirDataEmFormatoBrasileiro() throws ParseException {
		Produtos p = new Produtos();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date data = df.parse("12/04/2015");
		p.setDataValidade("12/04/2015");
		System.out.println(p.getDataValidade());
		 assertEquals(data, p.getDataValidade());
	}


}
