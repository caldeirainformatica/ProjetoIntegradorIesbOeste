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
				
					
			
					JOptionPane.showMessageDialog(null, l.getIdlote() + " "+ l.getLote() + " "+ formataDataHueHueBRBR(l.getDataValidade().toString()) + " " + formataDataHueHueBRBR(l.getDataFabricacao().toString()));
					
					

			}catch(SQLException e){
				
				
				throw new Exception("erro ao pesquisar lote!!"+e.getMessage());
				
				
			}
			
			
		}
		
		public String formataDataHueHueBRBR(String data){
			
			if(data.matches("\\d{4}-\\d{2}-\\d{2}")){
				
				String[] dataArray = data.split("-");
				data = 	dataArray[2]	+ "/" + dataArray[1] + "/"+ dataArray[0];
				
			
			}
			return data;
			
			
		}
	

}
