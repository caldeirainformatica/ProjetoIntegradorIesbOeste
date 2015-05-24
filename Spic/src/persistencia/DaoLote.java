package persistencia;
/*
 * 
 * @author: Daniel Fiuza
 * 
 * 
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controle.ConLote;
import model.Lotes;

public class DaoLote {

	public DaoLote() {
	}
	
		ConectaBanco conecta = new ConectaBanco();
		ConLote lot = new ConLote();
		ResultSet rs;
		
		public void inserirLote(Lotes l) throws Exception{
			try{
				conecta.conexao();
				PreparedStatement pst = conecta.conn.prepareStatement("insert into lotes (lote, dataValidade, dataFabricacao)values (?,?,?)");
				
				pst.setString(1,l.getLote());
				pst.setDate(2, l.getDataValidade());
				pst.setDate(3,l.getDataFabricacao());
				pst.executeUpdate();
				
				JOptionPane.showConfirmDialog(null, "Inserido Shoow!! :D");
			}catch(SQLException e){
				
				throw new Exception("Erro ao inserir! :"+ e.getMessage());
				
			}
		
			
			
		}
		
		public void selecionarLote(Lotes l) throws Exception{
			try{
				conecta.conexao();
				PreparedStatement pst = conecta.conn.prepareStatement("select * from lotes where idlotes = ? or lote = ? or dataValidade = ? or dataFabricacao = ? ");
				pst.setInt(1,l.getIdlote());
				pst.setString(2, l.getLote());
				pst.setDate(3, l.getDataValidade());
				pst.setDate(4, l.getDataFabricacao());
				
				rs = pst.executeQuery();
				rs.next();
				l.setIdlote(Integer.valueOf(rs.getString("idlotes")));
				l.setLote(rs.getString("idlotes"));
				l.setLote(rs.getString("lote"));
				l.setLote(rs.getString("dataValidade"));
				l.setLote(rs.getString("dataFabricacao"));
				
				if(l .getLote() == null || l.getDataValidade() == null || l.getDataFabricacao() == null){
					
					JOptionPane.showMessageDialog(null, "Null");
					
				}else{
					
					JOptionPane.showMessageDialog(null,l.getIdlote() + " "+l.getLote() + " "+ l.getDataValidade() + " " + l.getDataFabricacao());
					
					
				}

			}catch(SQLException e){
				
				
				throw new Exception("erro ao pesquisar lote!!"+e.getMessage());
				
				
			}
			
			
		}
		
	

}
