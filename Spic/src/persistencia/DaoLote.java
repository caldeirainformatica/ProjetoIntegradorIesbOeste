package persistencia;
/*
 * 
 * @author: Daniel Fiuza
 * 
 * 
 */
import java.sql.PreparedStatement;
import java.sql.SQLException;

import controle.ConLote;
import model.Lotes;

public class DaoLote {

	public DaoLote() {
	}
	
		ConectaBanco conecta = new ConectaBanco();
		ConLote lot = new ConLote();
		
		public void inserirLote(Lotes l) throws Exception{
			try{
				conecta.conexao();
				PreparedStatement pst = conecta.conn.prepareStatement("insert into lotes (lote, dataValidade, dataFabricacao)values (?,?,?)");
				
				pst.setString(1,l.getLote());
				pst.setDate(2, l.getDataValidade());
				pst.setDate(3,l.getDataFabricacao());
				pst.executeUpdate();
			}catch(SQLException e){
				
				throw new Exception("Erro ao inserir! :"+ e.getMessage());
				
			}
		
			
			
		}
		
	

}
