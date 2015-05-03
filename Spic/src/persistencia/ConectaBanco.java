/**
 * 
 */
package persistencia;

import java.sql.*;

import javax.swing.JOptionPane;

/**
 * @author Ricardo Caldeira
 *
 */
public class ConectaBanco {
	public Statement stm; // responsavel por preparar e realizar pesquisas no
							// banco de dados
	public ResultSet rs; // responsavel por armazenar o resultado de uma
							// pesquisa passada para o statement
	private String driver = "com.mysql.jdbc.Driver"; // responsavel por
														// identificar o banco
														// de dados
	private String caminho = "jdbc:mysql://localhost:3306/spic"; // responsavel
																	// por setar
																	// o
																	// endere�o
																	// do bd
	private String usuario = "root";
	private String senha = "root";
	public Connection conn; // responsavel por realizar a conex�o com o bd

	public void conexao() {// metodo respons�vel por realizar a conex�o com o bd

		try { // tentar esse
			System.setProperty("jdbc.Drivers", driver); // seta a propriedade do
														// driver de conex�o
			conn = DriverManager.getConnection(caminho, usuario, senha); // realiza
																			// a
																			// conex�o
																			// com
																			// o
																			// bd
			// JOptionPane.showMessageDialog(null, "conectado com sucesso"); //
			// imprime uma cx de mensagem
		} catch (SQLException e) { // se de erro, fa�a isso
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,
					"falha ao conectar \n Erro" + e.getMessage()); // mensagem
																	// de erro
		}
	}

	public void executaSQL(String sql) {
		try {
			conexao();
			stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,
					rs.CONCUR_READ_ONLY);
			rs = stm.executeQuery(sql);
		} catch (SQLException e) {
			// JOptionPane.showMessageDialog(null,
			// "Erro no executasql \n Erro"+e.getMessage()); // mensagem de erro
		}
	}

	public void desconecta() { // metodo para fechar a conex�o com o bd
		try {
			conn.close(); // fecha a conex�o
			JOptionPane.showMessageDialog(null, "desconectado com sucesso"); // imprime
																				// uma
																				// cx
																				// de
																				// mensagem
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,
					"falha ao fechar a conex�o \n Erro" + e.getMessage()); // mensagem
																			// de
																			// erro
		}
	}
}
