package Persistence;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;

public class ProdutosBean {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/spic";
	static final String DB_USER = "root";
	static final String DB_PASS = "root";
	private JdbcRowSet rowSet = null;

	public ProdutosBean() {
		try {
			Class.forName(JDBC_DRIVER);
			rowSet = new JdbcRowSetImpl();
			rowSet.setUrl(DB_URL);
			rowSet.setUsername(DB_USER);
			rowSet.setPassword(DB_PASS);
			rowSet.setCommand("SELECT * FROM Produtos");
			rowSet.execute();
		}

		catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	public Produtos create(Produtos p) {
		try {
			rowSet.moveToInsertRow();
			rowSet.updateInt("idProdutos", p.getIdProdutos());
			rowSet.updateInt("codigoBarras", p.getCodigoBarras());
			rowSet.updateString("descricao", p.getDescricao());
			rowSet.updateString("aplicacao", p.getAplicacao());
			rowSet.updateString("medida", p.getMedida());
			rowSet.updateDate("dataValidade", p.getDataValidade());
			rowSet.updateDate("dataFabricacao", p.getDataFabricacao());
			rowSet.updateString("lote", p.getLote());
			rowSet.insertRow();
			rowSet.moveToCurrentRow();
		} catch (SQLException ex) {
			try {
				rowSet.rollback();
				p = null;
			} catch (SQLException e) {

			}
			ex.printStackTrace();
		}
		return p;
	}

	public Produtos update(Produtos p) {
		try {
			rowSet.updateInt("idProdutos", p.getIdProdutos());
			rowSet.updateInt("codigoBarras", p.getCodigoBarras());
			rowSet.updateString("descricao", p.getDescricao());
			rowSet.updateString("aplicacao", p.getAplicacao());
			rowSet.updateString("medida", p.getMedida());
			rowSet.updateDate("dataValidade", p.getDataValidade());
			rowSet.updateDate("dataFabricacao", p.getDataFabricacao());
			rowSet.updateString("lote", p.getLote());
			rowSet.updateRow();
			rowSet.moveToCurrentRow();
		} catch (SQLException ex) {
			try {
				rowSet.rollback();
			} catch (SQLException e) {

			}
			ex.printStackTrace();
		}
		return p;
	}

	public void delete() {
		try {
			rowSet.moveToCurrentRow();
			rowSet.deleteRow();
		} catch (SQLException ex) {
			try {
				rowSet.rollback();
			} catch (SQLException e) {
			}
			ex.printStackTrace();
		}

	}

	public Produtos moveFirst() {
		Produtos p = new Produtos();
		try {
			rowSet.first();
			p.setIdProdutos(rowSet.getInt("idProdutos"));
			p.setCodigoBarras(rowSet.getInt("codigoBarras"));
			p.setDescricao(rowSet.getString("descricao"));
			p.setAplicacao(rowSet.getString("aplicacao"));
			p.setMedida(rowSet.getString("medida"));
			p.setDataValidade(rowSet.getDate("dataValidade"));
			p.setDataFabricacao(rowSet.getDate("dataFabricacao"));
			p.setLote(rowSet.getString("lote"));

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return p;
	}

	public Produtos moveLast() {
		Produtos p = new Produtos();
		try {
			rowSet.last();
			p.setIdProdutos(rowSet.getInt("idProdutos"));
			p.setCodigoBarras(rowSet.getInt("codigoBarras"));
			p.setDescricao(rowSet.getString("descricao"));
			p.setAplicacao(rowSet.getString("aplicacao"));
			p.setMedida(rowSet.getString("medida"));
			p.setDataValidade(rowSet.getDate("dataValidade"));
			p.setDataFabricacao(rowSet.getDate("dataFabricacao"));
			p.setLote(rowSet.getString("lote"));

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return p;
	}

	public Produtos moveNext() {
		Produtos p = new Produtos();
		try {
			if (rowSet.next() == false)
				rowSet.previous();
			p.setIdProdutos(rowSet.getInt("idProdutos"));
			p.setCodigoBarras(rowSet.getInt("codigoBarras"));
			p.setDescricao(rowSet.getString("descricao"));
			p.setAplicacao(rowSet.getString("aplicacao"));
			p.setMedida(rowSet.getString("medida"));
			p.setDataValidade(rowSet.getDate("dataValidade"));
			p.setDataFabricacao(rowSet.getDate("dataFabricacao"));
			p.setLote(rowSet.getString("lote"));

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return p;
	}

	public Produtos movePrevious() {
		Produtos p = new Produtos();
		try {
			if (rowSet.previous() == false)
				rowSet.next();
			p.setIdProdutos(rowSet.getInt("idProdutos"));
			p.setCodigoBarras(rowSet.getInt("codigoBarras"));
			p.setDescricao(rowSet.getString("descricao"));
			p.setAplicacao(rowSet.getString("aplicacao"));
			p.setMedida(rowSet.getString("medida"));
			p.setDataValidade(rowSet.getDate("dataValidade"));
			p.setDataFabricacao(rowSet.getDate("dataFabricacao"));
			p.setLote(rowSet.getString("lote"));

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return p;
	}

	public Produtos getCurrent() {
		Produtos p = new Produtos();
		try {
			rowSet.moveToCurrentRow();
			p.setIdProdutos(rowSet.getInt("idProdutos"));
			p.setCodigoBarras(rowSet.getInt("codigoBarras"));
			p.setDescricao(rowSet.getString("descricao"));
			p.setAplicacao(rowSet.getString("aplicacao"));
			p.setMedida(rowSet.getString("medida"));
			p.setDataValidade(rowSet.getDate("dataValidade"));
			p.setDataFabricacao(rowSet.getDate("dataFabricacao"));
			p.setLote(rowSet.getString("lote"));

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return p;
	}

}
