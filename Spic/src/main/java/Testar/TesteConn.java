package Testar;

import java.sql.Connection;
import java.sql.SQLException;

import Persistence.ConnectionFactory;

public class TesteConn {

	public static void main(String[] args) throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
			System.out.println("conexão aberta");
			conn.close();
	
	}

}
