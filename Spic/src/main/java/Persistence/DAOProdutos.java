package Persistence;

//importes necessários para está classe funcionar utilizando conexão com o banco de dados

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Classe especifica para conexão com o atuação direta no banco de dados
//com a utilização de inclusão de produtos, alteração e outros
public class DAOProdutos {

	private Connection connection;

	// Comando sql para inclusão de produtos, deixando bem generico para incluir
	// qualquer tipo de dados
	public void insert(ConstrutorProduto p) {
		String sql = "insert into produtos"
				+ "(codigoBarras, descricao, aplicacao, medida, dataValidade, dataFabricacao, lote"
				+ "values (?,?,?,?,?,?,?)"; // metodo generico para variaveis
		try {
			this.connection = new ConnectionFactory().getConnection();
			/*
			 * conexão com a classe fabrica de conexões, faz a abertura do
			 * contato com o banco de dados
			 */
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, p.getCodigoBarras());
			stmt.setString(2, p.getDescricao());
			stmt.setString(3, p.getAplicacao());
			/*
			 * aqui nós setamos as informações na variavel stmt do tipo
			 * PreparedStatement em outras palavras, prepare o comando sql para
			 * ser enviado ao banco de dados
			 */
			stmt.setString(4, p.getMedida());
			stmt.setDate(5, new Date(p.getDataValidade().getTimeInMillis()));
			stmt.setDate(6, new Date(p.getDataFabricacao().getTimeInMillis()));
			stmt.setString(7, p.getLote());

			// stmt.execute tem a função de executar o comando no bd, em seguida
			// comando para fechar a conexão com o bd
			stmt.execute();
			stmt.close();
		} catch (SQLException e) { // se existir erros, devem ser tratados aqui
			throw new RuntimeException(e);
		}
	}

	// Comando sql para alteração de produtos, deixando bem generico para
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
