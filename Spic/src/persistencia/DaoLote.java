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
				
				JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
			}catch(SQLException e){
				
				throw new Exception("Erro ao inserir! :"+ e.getMessage());
				
			}
		
			
			
		}
		
		public void selecionarLote(Lotes l) throws Exception{
			try{
				conecta.conexao();
				PreparedStatement pst = conecta.conn.prepareStatement("select * from lotes where lote = ?");
				//pst.setInt(1,l.getIdlote());
				pst.setString(1, l.getLote());
				//pst.setDate(3, l.getDataValidade());
				//pst.setDate(4, l.getDataFabricacao());
				
				rs = pst.executeQuery();
				rs.first();
				l.setIdlote(Integer.valueOf(rs.getString("idlotes")));
				l.setLote(rs.getString("lote"));
				l.setDataValidade(rs.getString("dataValidade"));
				l.setDataFabricacao(rs.getString("dataFabricacao"));
				
					
			
					JOptionPane.showMessageDialog(null, l.getIdlote() + " "+ l.getLote() + " "+ l.getDataValidade() + " " + l.getDataFabricacao());
					
					

			}catch(SQLException e){
				
				
				throw new Exception("erro ao pesquisar lote! Avise o suporte!"+"/n"+e.getMessage());
				
				
			}
			
			
		}
		
		public void deletarLote(Lotes l){
			
			try{
				conecta.conexao();
				
				PreparedStatement pst = conecta.conn.prepareStatement("DELETE FROM lotes WHERE idlotes = ? ");
				pst.setString(1,String.valueOf( l.getIdlote()));
				
				JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");
				pst.executeUpdate();
			}catch(SQLException e){
				
				JOptionPane.showMessageDialog(null, "Erro ao tentar deletar registro! Avise o suporte! "+ "/n"+e.getMessage());
				
			}
		}
		
		
		
		public void alterarLotes(Lotes l){
			
			try{
				conecta.conexao();
				PreparedStatement pst = conecta.conn.prepareStatement("update lotes  set lote = ? , dataValidade = ? , dataFabricacao = ? where idlotes = ?");
				pst.setString(1, l.getLote());
				pst.setString(2, l.getDataValidade().toString());
				pst.setString(3, l.getDataFabricacao().toString());
				pst.setString(4, String.valueOf(l.getIdlote()));
				
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Alterado com sucesso");
			}catch(SQLException e){
				JOptionPane.showMessageDialog(null, "Erro ao tentar alterar registro! Avise o suporte! "+ "/n"+e.getMessage());
				
			}
		}
		
		
	

}
