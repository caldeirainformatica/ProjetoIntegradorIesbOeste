package controle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import model.Produtos;

/*
 * 
 * 
 *@author Daniel Fiuza
 * 
 * 
 * 
 */

public class ConProdutos {

	public Produtos produto = new Produtos();

	// Validar codigoBarras
	public boolean validarCodigoBarras(String codigoBarras) throws Exception {

		try {
			if (codigoBarras == "" || codigoBarras == null
					|| codigoBarras.trim() == "" || codigoBarras.length() > 13) {

				Exception campoVazioException = new Exception(
						"Valor incorreto!");
				return false;

			} else {

				produto.setCodigoBarras(Long.parseLong(codigoBarras));
				return true;

			}
		} catch (NumberFormatException e) {

			throw new Exception("Caracteres inválidos");

		}

	}

	public boolean validarDescricao(String descricao) {

		if (descricao == "" || descricao == null || descricao.trim() == "") {

			Exception campoVazioException = new Exception("Valor incorreto!");
			return false;

		} else {

			produto.setDescricao(descricao);
			return true;

		}

	}

	public boolean validarAplicacao(String aplicacao) {

		if (aplicacao == "" || aplicacao == null || aplicacao.trim() == "") {

			Exception campoVazioException = new Exception("Valor incorreto!");
			return false;

		} else {

			produto.setAplicacao(aplicacao);
			return true;

		}

	}

	public boolean validarMedida(String medida) {

		if (medida == "" || medida == null || medida.trim() == ""
				|| medida.length() != 2) {

			Exception campoVazioException = new Exception("Valor incorreto!");
			return false;

		} else {

			produto.setMedida(medida);
			return true;

		}
	}

	public boolean validarValorVenda(String valorVenda) throws Exception {

		try {

			if (valorVenda == "" || valorVenda == null
					|| valorVenda.trim() == "") {

				return false;

			} else {

				produto.setValorVenda(Float.parseFloat(valorVenda));
				return true;

			}
		} catch (NumberFormatException e) {

			new Exception("Valor inválido!!");
			return false;
		}

	}

	public boolean validarValorCusto(String valorCusto) throws Exception {

		try {

			if (valorCusto == "" || valorCusto == null
					|| valorCusto.trim() == "") {

				return false;

			} else {
				produto.setValorCusto(Float.parseFloat(valorCusto));
				return true;
			}
		} catch (NumberFormatException e) {

			new Exception("Valor inválido!!");
			return false;
		}

	}

	public boolean validarQuantidade(String quantidade) throws Exception {

		try {

			if (quantidade == "" || quantidade == null
					|| quantidade.trim() == "") {
				return false;
			} else {

				produto.setQuantidade(Double.parseDouble(quantidade));
				return true;
			}

		} catch (NumberFormatException Exception) {

			new Exception("Valor inválido!");
			return false;

		}

	}

}
