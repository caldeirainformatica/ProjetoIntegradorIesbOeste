package testes;

import java.sql.Connection;
import java.sql.SQLException;

import model.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
			System.out.println("conexão aberta");
			conn.close();
	
	}

}
