package persistencia;

//importes necess�rios para est� classe funcionar utilizando conex�o com o banco de dados

import java.sql.*;

import javax.swing.JOptionPane;

import model.Produtos;
import persistencia.ConectaBanco;

//Classe especifica para conex�o com o atua��o direta no banco de dados
//com a utiliza��o de inclus�o de produtos, altera��o e outros
public class DAO {

	ConectaBanco conecta = new ConectaBanco();
	Produtos p = new Produtos();
	ResultSet rs;

	// Comando sql para inclus�o de produtos, deixando bem generico para incluir
	// qualquer tipo de dados
	public void insert(Produtos p) {
		try {
			conecta.conexao();
			PreparedStatement pst = conecta.conn
					.prepareStatement("insert into produtos (codigoBarras, descricao, aplicacao,"
							+ "medida, valorVenda, valorCusto, quantidade)values (?,?,?,?,?,?,?)");
			pst.setString(1, p.getCodigoBarras());
			pst.setString(2, p.getDescricao());
			pst.setString(3, p.getAplicacao());
			pst.setString(4, p.getMedida());
			pst.setDouble(5, p.getValorVenda());
			pst.setDouble(6, p.getValorCusto());
			pst.setDouble(7, p.getQuantidade());
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null,
					"Produto salvo com sucesso");
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null, " Erro na inser��o \n Erro "
					+ e1.getMessage());
		}
	}

	public void select(Produtos p) {
		try {

			conecta.conexao();
			PreparedStatement pst = conecta.conn
					.prepareStatement("select * from produtos where idProdutos = ? or codigoBarras = ? or descricao = ? or "
							+ "aplicacao = ? or medida = ? or valorVenda = ? or valorCusto = ? or quantidade = ?");
			pst.setInt(1, p.getIdProdutos());
			pst.setString(2, p.getCodigoBarras());
			pst.setString(3, p.getDescricao());
			pst.setString(4, p.getAplicacao());
			pst.setString(5, p.getMedida());
			pst.setDouble(6, p.getValorVenda());
			pst.setDouble(7, p.getValorCusto());
			pst.setDouble(8, p.getQuantidade());

			rs = pst.executeQuery();
			rs.first();
			p.setIdProdutos(Integer.valueOf(rs.getString("idProdutos")));
			p.setCodigoBarras(rs.getString("codigoBarras"));
			p.setDescricao(rs.getString("descricao"));
			p.setAplicacao(rs.getString("aplicacao"));
			p.setMedida(rs.getString("medida"));
			p.setValorVenda(rs.getDouble("valorVenda"));
			p.setValorCusto(rs.getDouble("valorCusto"));
			p.setQuantidade(rs.getDouble("quantidade"));

			// JOptionPane.showMessageDialog(null, "Salvo com sucesso");
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null,
					"Erro na pesquisa classe dao \n Erro " + e1.getMessage());
		}
	}

	public void alterarProdutos(Produtos p) {
		try {
			conecta.conexao();
			PreparedStatement pst = conecta.conn
					.prepareStatement("update produtos p set "
							+ "p.descricao = ?, p.aplicacao = ?, p.codigoBarras = ?, p.valorVenda = ?, "
							+ "p.valorCusto = ?, p.medida = ?, p.quantidade = ?"
							+ "  where p.idprodutos = ?");
			pst.setString(1, p.getDescricao());
			pst.setString(2, p.getAplicacao());
			pst.setString(3, p.getCodigoBarras());
			pst.setString(4, Double.toString(p.getValorVenda()));
			pst.setString(5, Double.toString(p.getValorCusto()));
			pst.setString(6, p.getMedida());
			pst.setString(7, String.valueOf(p.getQuantidade()));
			pst.setString(8, Double.toString(p.getIdProdutos()));

			pst.execute();
			JOptionPane.showMessageDialog(null, "Alterado com sucesso");
		
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Erro ao alterar " + e.getMessage());

		}

	}
/**
 * @author Ricardo Caldeira
 * 
 * Nessa parte eu come�o a implementar a DAO de vendas. Seguindo recomena��o do professor
 *  Roger irei implementar tudo em uma s� classe	
 */

	
}
