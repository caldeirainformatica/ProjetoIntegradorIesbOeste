package Persistence;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

import BusinessRules.Produtos;

public class DAOProdutos {

	private Connection connection;

	public void DAOProdutos() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(ConstrutorProduto p) {
		String sql = "insert into produtos"
				+ "(codigoBarras, descricao, aplicacao, medida, dataValidade, dataFabricacao, lote"
				+ "values (?,?,?,?,?,?,?)";
		try {
			DAOProdutos();
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, p.getCodigoBarras());
			stmt.setString(2, p.getDescricao());
			stmt.setString(3, p.getAplicacao());
			stmt.setString(4, p.getMedida());
			stmt.setDate(5, new Date(p.getDataValidade().getTimeInMillis()));
			stmt.setDate(6, new Date(p.getDataFabricacao().getTimeInMillis()));
			stmt.setString(7, p.getLote());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void update(ConstrutorProduto p){
		DAOProdutos();
		String sql = "update produtos"
				+ "(codigoBarras, descricao, aplicacao, medida, dataValidade, dataFabricacao, lote"
				+ "values (?,?,?,?,?,?,?)";
		try{
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.executeUpdate();
		}
		catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}
