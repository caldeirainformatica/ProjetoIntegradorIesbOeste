package Persistence;

// Aqui eu faço a importação da classe sql
import java.sql.*;

public class DAO {
	public static String status = ""; // Variavel que informa o status do banco de
								// dados.

	public static Connection getConnection() {
		Connection conn = null; // Variavel para a conexão
		try {
			// Driver do Mysql
			// Class.forName("com.mysql.jdbc.Driver").newInstance(); SEGUNDO A
			// CAELUM, A PARTIR DA VERSÃO 6 DO JAVA, ESTA PARTE E DESNECESSARIA
			
			
			
			// Url do banco de dados
			String url = "jdbc:mysql://localhost/spic?user=root&password=root";
			conn = DriverManager.getConnection(url);

			status = "Connection opened";
		} catch (SQLException e) {
			status = e.getMessage();// A variavel status recebe a string da
									// conexão
		}
		// catch (ClassNotFoundException e){
		// status = e.getMessage();
		// } SEGUNDO A CAELUM, A PARTIR DA VERSÃO 6 DO JAVA, ESTA PARTE E
		// DESNECESSARIA
		catch (Exception e) {
			status = e.getMessage();
		}
		return conn;
	}

}
