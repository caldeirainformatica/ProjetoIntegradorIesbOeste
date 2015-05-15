package persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import controle.ConLote_velho;
import model.Lotes;

public class DaoLote {

	public DaoLote() {
	}
	
		ConectaBanco conecta = new ConectaBanco();
		ConLote_velho lot = new ConLote_velho();
		
		public void inserirLote(Lotes l) throws Exception{
			try{
				conecta.conexao();
				PreparedStatement pst = conecta.conn.prepareStatement("insert into lote (lote, dataValidade, dataFabricacao,produto_idproduto)values (?,?,?,?)");
				
				pst.setString(1,l.getLote());
				pst.setDate(2, l.getDataValidade());
				pst.setDate(3,l.getDataFabricacao());
				pst.setInt(4, l.getProduto_idproduto());
				
			}catch(SQLException e){
				
				throw new Exception("Erro ao inserir"+ e.getMessage());
				
			}
		
			
			
		}
		
	

}
