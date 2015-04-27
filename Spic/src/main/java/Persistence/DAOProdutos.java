package Persistence;

//importes necess�rios para est� classe funcionar utilizando conex�o com o banco de dados

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Classe especifica para conex�o com o atua��o direta no banco de dados
//com a utiliza��o de inclus�o de produtos, altera��o e outros
public class DAOProdutos {

	private Connection connection;

	// Comando sql para inclus�o de produtos, deixando bem generico para incluir
	// qualquer tipo de dados
	public void insert(ConstrutorProduto p) {
		String sql = "insert into produtos"
				+ "(codigoBarras, descricao, aplicacao, medida, dataValidade, dataFabricacao, lote"
				+ "values (?,?,?,?,?,?,?)"; // metodo generico para variaveis
		try {
			this.connection = new ConnectionFactory().getConnection();
			/*
			 * conex�o com a classe fabrica de conex�es, faz a abertura do
			 * contato com o banco de dados
			 */
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, p.getCodigoBarras());
			stmt.setString(2, p.getDescricao());
			stmt.setString(3, p.getAplicacao());
			/*
			 * aqui n�s setamos as informa��es na variavel stmt do tipo
			 * PreparedStatement em outras palavras, prepare o comando sql para
			 * ser enviado ao banco de dados
			 */
			stmt.setString(4, p.getMedida());
			stmt.setDate(5, new Date(p.getDataValidade().getTimeInMillis()));
			stmt.setDate(6, new Date(p.getDataFabricacao().getTimeInMillis()));
			stmt.setString(7, p.getLote());

			// stmt.execute tem a fun��o de executar o comando no bd, em seguida
			// comando para fechar a conex�o com o bd
			stmt.execute();
			stmt.close();
		} catch (SQLException e) { // se existir erros, devem ser tratados aqui
			throw new RuntimeException(e);
		}
	}

	// Comando sql para altera��o de produtos, deixando bem generico para
	// incluir qualquer tipo de dados
	public void update(ConstrutorProduto p) {
		String sql = "update produtos set codigoBarras=?, descricao=?, aplicacao=?, medida=?"
				+ "dataValidade=?, dataFabricacao=?, lote=? where id=?";

		try {
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, p.getCodigoBarras());
			stmt.setString(2, p.getDescricao());
			stmt.setString(3, p.getAplicacao());
			stmt.setString(4, p.getMedida());
			stmt.setDate(5, new Date(p.getDataValidade().getTimeInMillis()));
			stmt.setDate(6, new Date(p.getDataFabricacao().getTimeInMillis()));
			stmt.setString(7, p.getLote());
			stmt.setLong(8, p.getIdProdutos());

			stmt.execute();
			stmt.close();
		}

		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void delet(ConstrutorProduto p) {
		String sql = "delete from produtos set id=?";
		try {
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, p.getCodigoBarras());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
		}
	}

	public void select(ConstrutorProduto p) {
		String sql = "select * from produtos";

		try {
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {

		}
	}
}
