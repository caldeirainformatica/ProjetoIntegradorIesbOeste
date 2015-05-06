
package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import persistencia.ConectaBanco;
import persistencia.DAO;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.ConnectionFactory;
import model.Produtos;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Dimension;

/**
 *
 * @author RicardoNote
 */
public class FrmCadastroProdutos extends JFrame {
	ConectaBanco conecta = new ConectaBanco();
	Produtos p = new Produtos();
	private ResultSet rs;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form FrmCadastroProdutos
	 */
	public FrmCadastroProdutos() {
		setResizable(false);
		setPreferredSize(new Dimension(650, 430));

		initComponents();
		conecta.conexao();
		setLocation(370, 200);
		txtDataCadastro.setVisible(false);
		lbtDataCadastro.setVisible(false);
		txtQuantidade.setVisible(false);
		lbtQuantidade.setVisible(false);
		PreparedStatement pst;
		try {
			pst = conecta.conn.prepareStatement("select * from produtos");
			rs = pst.executeQuery();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();
		pnlCadastroProduto = new javax.swing.JPanel();
		btnAlterar = new javax.swing.JButton();
		btnAlterar.setEnabled(false);
		btnAlterar.setToolTipText("Alterar");
		btnExcluir = new javax.swing.JButton();
		btnExcluir.setToolTipText("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					PreparedStatement pst = conecta.conn.prepareStatement("delete from produtos where "
							+ "produtos.idprodutos = ?");
					pst.setString(1, txtCodigoProduto.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null, "Deletado com sucesso!!!");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Erro ao deletar produto");
				}
				
				txtCodigoProduto.setText("");
				txtCodigoBarras.setText("");
				txtAplicacao.setText("");
				txtDataCadastro.setText("");
				txtDescricao.setText("");
				txtFabricacao.setText("");
				txtLote.setText("");
				txtMedida.setText("");
				txtQuantidade.setText("");
				txtValidade.setText("");
				fmtValorCusto.setText("");
				fmtValorVenda.setText("");
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnSalvar.setEnabled(false);
				btnNovo.setEnabled(true);
								
			}
		});
		jButton3 = new javax.swing.JButton();
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalvar = new javax.swing.JButton();
		btnSalvar.setEnabled(false);
		btnSalvar.setToolTipText("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDescricao.setText(txtDescricao.getText().toUpperCase());
				txtAplicacao.setText(txtAplicacao.getText().toUpperCase());
				txtMedida.setText(txtMedida.getText().toUpperCase());
				try {
					
					DAO dao = new DAO();
					p.setCodigoBarras(Integer.parseInt(txtCodigoBarras
							.getText()));
					p.setDescricao(txtDescricao.getText());
					p.setAplicacao(txtAplicacao.getText());
					p.setMedida(txtMedida.getText());
					p.setDataValidade(txtValidade.getText());
					p.setDataFabricacao(txtValidade.getText());
					p.setLote(txtLote.getText());
					dao.insert(p);
					JOptionPane.showMessageDialog(null,
							"Produto salvo com sucesso");

					txtCodigoProduto.setText("");
					txtCodigoBarras.setText("");
					txtAplicacao.setText("");
					txtDataCadastro.setText("");
					txtDescricao.setText("");
					txtFabricacao.setText("");
					txtLote.setText("");
					txtMedida.setText("");
					txtQuantidade.setText("");
					txtValidade.setText("");
					fmtValorCusto.setText("");
					fmtValorVenda.setText("");
					
					txtCodigoProduto.setEnabled(false);
					txtCodigoBarras.setEnabled(false);
					txtAplicacao.setEnabled(false);
					txtDataCadastro.setEnabled(false);
					txtDescricao.setEnabled(false);
					txtFabricacao.setEnabled(false);
					txtLote.setEnabled(false);
					txtMedida.setEnabled(false);
					txtQuantidade.setEnabled(false);
					txtValidade.setEnabled(false);
					fmtValorCusto.setEnabled(false);
					fmtValorVenda.setEnabled(false);
					btnAlterar.setEnabled(false);
					btnExcluir.setEnabled(false);
					btnSalvar.setEnabled(false);
					btnNovo.setEnabled(true);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,
							"Erro ao cadastrar \n Erro " + e1.getMessage());

				}

			}
		});
		btnNovo = new javax.swing.JButton();
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtCodigoProduto.setText("");
				txtCodigoBarras.setText("");
				txtAplicacao.setText("");
				txtDataCadastro.setText("");
				txtDescricao.setText("");
				txtFabricacao.setText("");
				txtLote.setText("");
				txtMedida.setText("");
				txtQuantidade.setText("");
				txtValidade.setText("");
				fmtValorCusto.setText("");
				fmtValorVenda.setText("");
				
				//txtCodigoProduto.setEnabled(true);
				txtCodigoBarras.setEnabled(true);
				txtAplicacao.setEnabled(true);
				txtDataCadastro.setEnabled(true);
				txtDescricao.setEnabled(true);
				txtFabricacao.setEnabled(true);
				txtLote.setEnabled(true);
				txtMedida.setEnabled(true);
				txtQuantidade.setEnabled(true);
				txtValidade.setEnabled(true);
				fmtValorCusto.setEnabled(true);
				fmtValorVenda.setEnabled(true);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(false);
				btnSalvar.setEnabled(true);
				btnNovo.setEnabled(false);
			}
		});
		btnNovo.setToolTipText("Novo");
		lbtCodigoBarras = new javax.swing.JLabel();
		lbtDescricao = new javax.swing.JLabel();
		lbtAplicação = new javax.swing.JLabel();
		lbtValidade = new javax.swing.JLabel();
		lbtFabricacao = new javax.swing.JLabel();
		lbtLote = new javax.swing.JLabel();
		lbtValorVenda = new javax.swing.JLabel();
		lbtQuantidade = new javax.swing.JLabel();
		lbtValorCusto = new javax.swing.JLabel();
		LbtMedida = new javax.swing.JLabel();
		txtCodigoBarras = new javax.swing.JTextField();
		txtCodigoBarras.setEnabled(false);
		txtCodigoBarras.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321"; // ESTE EVENTO VAI RESTRIGIR A
													// ENTRADA DE CARACTERES

				if (!caracteres.contains(ev.getKeyChar() + "")) {

					ev.consume();

				}

			}
		});
		txtCodigoBarras.setDisabledTextColor(Color.BLACK);
		txtMedida = new javax.swing.JTextField();
		txtMedida.setEnabled(false);
		txtMedida.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321"; // ESSE EVENTO VAI RESTRIGIR A
													// ENTRADA DE NUMEROS

				if (caracteres.contains(ev.getKeyChar() + "")) {

					ev.consume();

				}
			}
		});
		txtMedida.setDisabledTextColor(Color.BLACK);
		txtDescricao = new javax.swing.JTextField();
		txtDescricao.setEnabled(false);
		txtDescricao.setDisabledTextColor(Color.BLACK);
		txtAplicacao = new javax.swing.JTextField();
		txtAplicacao.setEnabled(false);
		txtAplicacao.setDisabledTextColor(Color.BLACK);
		txtValidade = new javax.swing.JTextField();
		txtValidade.setEnabled(false);
		txtValidade.setDisabledTextColor(Color.BLACK);
		txtFabricacao = new javax.swing.JTextField();
		txtFabricacao.setEnabled(false);
		txtFabricacao.setDisabledTextColor(Color.BLACK);
		txtLote = new javax.swing.JTextField();
		txtLote.setEnabled(false);
		txtLote.setDisabledTextColor(Color.BLACK);
		fmtValorVenda = new javax.swing.JFormattedTextField();
		fmtValorVenda.setEnabled(false);
		fmtValorVenda.setDisabledTextColor(Color.BLACK);
		fmtValorCusto = new javax.swing.JFormattedTextField();
		fmtValorCusto.setEnabled(false);
		fmtValorCusto.setDisabledTextColor(Color.BLACK);
		txtQuantidade = new javax.swing.JTextField();
		txtQuantidade.setEnabled(false);
		txtQuantidade.setDisabledTextColor(Color.BLACK);
		btnPrimeiro = new javax.swing.JButton();
		btnPrimeiro.setToolTipText("Primeiro");
		btnPrimeiro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				try {
					PreparedStatement pst = conecta.conn.prepareStatement("select * from produtos");
					rs = pst.executeQuery();
					rs.first();
					txtCodigoProduto.setText(String.valueOf(rs.getInt("idProdutos")));
					txtCodigoBarras.setText(String.valueOf(rs.getInt("codigoBarras")));
					txtDescricao.setText(rs.getString("descricao"));
					txtAplicacao.setText(rs.getString("aplicacao"));
					txtDataCadastro.setText(rs.getString("dataCadastro"));
					txtFabricacao.setText(rs.getString("dataFabricacao"));
					txtValidade.setText(rs.getString("dataValidade"));
					txtLote.setText(rs.getString("lote"));
					txtMedida.setText(rs.getString("medida"));
					txtQuantidade.setText(String.valueOf(rs.getInt("quantidade")));
					
					btnExcluir.setEnabled(true);
					btnAlterar.setEnabled(true);
					btnNovo.setEnabled(false);
					btnSalvar.setEnabled(false);
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Erro ao mostrar dados \n Contacte ao suporte SPIC"
							+ " e informe o codigo codigo 687"+e1.getMessage());
				}
			}
		});
		
		btnAnterior = new javax.swing.JButton();
		btnAnterior.setToolTipText("Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					rs.previous();
					txtCodigoProduto.setText(String.valueOf(rs.getInt("idProdutos")));
					txtCodigoBarras.setText(String.valueOf(rs.getInt("codigoBarras")));
					txtDescricao.setText(rs.getString("descricao"));
					txtAplicacao.setText(rs.getString("aplicacao"));
					txtDataCadastro.setText(rs.getString("dataCadastro"));
					txtFabricacao.setText(rs.getString("dataFabricacao"));
					txtValidade.setText(rs.getString("dataValidade"));
					txtLote.setText(rs.getString("lote"));
					txtMedida.setText(rs.getString("medida"));
					txtQuantidade.setText(String.valueOf(rs.getInt("quantidade")));
					
					btnExcluir.setEnabled(true);
					btnAlterar.setEnabled(true);
					btnNovo.setEnabled(false);
					btnSalvar.setEnabled(false);
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Erro ao mostrar dados \n Contacte ao suporte SPIC"
							+ " e informe o codigo codigo 687"+e1.getMessage());
				}
			}
		});
		btnProximo = new javax.swing.JButton();
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					rs.next();
					txtCodigoProduto.setText(String.valueOf(rs.getInt("idProdutos")));
					txtCodigoBarras.setText(String.valueOf(rs.getInt("codigoBarras")));
					txtDescricao.setText(rs.getString("descricao"));
					txtAplicacao.setText(rs.getString("aplicacao"));
					txtDataCadastro.setText(rs.getString("dataCadastro"));
					txtFabricacao.setText(rs.getString("dataFabricacao"));
					txtValidade.setText(rs.getString("dataValidade"));
					txtLote.setText(rs.getString("lote"));
					txtMedida.setText(rs.getString("medida"));
					txtQuantidade.setText(String.valueOf(rs.getInt("quantidade")));
					
					btnExcluir.setEnabled(true);
					btnAlterar.setEnabled(true);
					btnNovo.setEnabled(false);
					btnSalvar.setEnabled(false);
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Erro ao mostrar dados \n Contacte ao suporte SPIC"
							+ " e informe o codigo codigo 687"+e1.getMessage());
				}
			}
		});
		btnProximo.setToolTipText("Pr\u00F3ximo");
		btnUltimo = new javax.swing.JButton();
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
//					PreparedStatement pst = conecta.conn.prepareStatement("select * from produtos");
//					rs = pst.executeQuery();
					rs.last();
					txtCodigoProduto.setText(String.valueOf(rs.getInt("idProdutos")));
					txtCodigoBarras.setText(String.valueOf(rs.getInt("codigoBarras")));
					txtDescricao.setText(rs.getString("descricao"));
					txtAplicacao.setText(rs.getString("aplicacao"));
					txtDataCadastro.setText(rs.getString("dataCadastro"));
					txtFabricacao.setText(rs.getString("dataFabricacao"));
					txtValidade.setText(rs.getString("dataValidade"));
					txtLote.setText(rs.getString("lote"));
					txtMedida.setText(rs.getString("medida"));
					txtQuantidade.setText(String.valueOf(rs.getInt("quantidade")));
					
					btnExcluir.setEnabled(true);
					btnAlterar.setEnabled(true);
					btnNovo.setEnabled(false);
					btnSalvar.setEnabled(false);
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Erro ao mostrar dados \n Contacte ao suporte SPIC"
							+ " e informe o codigo codigo 687"+e1.getMessage());
				}
			}
		});
		btnUltimo.setToolTipText("\u00DAltimo");
		lbtDataCadastro = new javax.swing.JLabel();
		txtDataCadastro = new javax.swing.JTextField();
		txtDataCadastro.setEnabled(false);
		txtDataCadastro.setDisabledTextColor(Color.BLACK);
		pnlPesquisaProduto = new javax.swing.JPanel();
		lbtCodigoBarrasPesquisa = new javax.swing.JLabel();
		txtCodigoBarrasPesquisa = new javax.swing.JTextField();
		lbtMedidaPesquisa = new javax.swing.JLabel();
		txtMedidaPesquisa = new javax.swing.JTextField();
		lbtDescricaoPesquisa = new javax.swing.JLabel();
		txtDescricaoPesquisa = new javax.swing.JTextField();
		lbtAplicaçãoPesquisa = new javax.swing.JLabel();
		txtAplicacaoPesquisa = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		tabelaProdutos = new javax.swing.JTable();
		btnPesquisar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

		pnlCadastroProduto.setBackground(new java.awt.Color(255, 255, 255));

		btnAlterar.setBackground(new java.awt.Color(255, 255, 255));
		btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/alterar.png"))); // NOI18N

		btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/Botoes_5116_cross_48.png"))); // NOI18N

		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/domesticos_2141_porta.gif"))); // NOI18N

		btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/Botoes_5103_usb_48.png"))); // NOI18N

		btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/add.png"))); // NOI18N

		lbtCodigoBarras.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbtCodigoBarras.setText("Código de Barras");

		lbtDescricao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		lbtDescricao.setText("Descrição");

		lbtAplicação.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbtAplicação.setText("Aplicação");

		lbtValidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbtValidade.setText("Validade");

		lbtFabricacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbtFabricacao.setText("Fabricação");

		lbtLote.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbtLote.setText("Lote");

		lbtValorVenda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		lbtValorVenda.setText("Valor de Venda");

		lbtQuantidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbtQuantidade.setText("Quantidade");

		lbtValorCusto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		lbtValorCusto.setText("Valor de Custo");

		LbtMedida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		LbtMedida.setText("Medida");

		fmtValorVenda.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fmtValorVendaActionPerformed(evt);
			}
		});

		btnPrimeiro.setIcon(new ImageIcon(getClass().getResource(
				"/images/Undo_48x48.png"))); // NOI18N

		btnAnterior.setIcon(new ImageIcon(FrmCadastroProdutos.class.getResource("/images/Previous_48x48.png"))); // NOI18N

		btnProximo.setIcon(new ImageIcon(getClass().getResource(
				"/images/Next_48x48.png"))); // NOI18N

		btnUltimo.setIcon(new ImageIcon(FrmCadastroProdutos.class.getResource("/images/Redo_48x48.png"))); // NOI18N

		lbtDataCadastro.setFont(new Font("Arial", 0, 14)); // NOI18N
		lbtDataCadastro.setText("Data Cadastro");
		
		JLabel lbCodigoProduto = new JLabel();
		lbCodigoProduto.setText("C\u00F3digo do Produto");
		lbCodigoProduto.setFont(new Font("Arial", Font.PLAIN, 14));
		
		txtCodigoProduto = new JTextField();
		txtCodigoProduto.setEnabled(false);
		txtCodigoProduto.setDisabledTextColor(Color.BLACK);

		javax.swing.GroupLayout pnlCadastroProdutoLayout = new GroupLayout(
				pnlCadastroProduto);
		pnlCadastroProdutoLayout.setHorizontalGroup(
			pnlCadastroProdutoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(pnlCadastroProdutoLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
							.addGroup(pnlCadastroProdutoLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lbCodigoProduto)
								.addComponent(lbtDataCadastro)
								.addComponent(lbtDescricao)
								.addComponent(lbtAplicação)
								.addComponent(lbtValidade))
							.addGap(5)
							.addGroup(pnlCadastroProdutoLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
									.addGroup(pnlCadastroProdutoLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(txtAplicacao)
										.addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
											.addComponent(txtCodigoProduto, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lbtCodigoBarras)
											.addGap(18)
											.addComponent(txtCodigoBarras, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(LbtMedida)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(txtMedida, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
										.addComponent(txtDataCadastro, 103, 103, 103)
										.addComponent(txtDescricao)
										.addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
											.addComponent(txtValidade, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lbtFabricacao)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtFabricacao, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lbtLote)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtLote)))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
								.addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
									.addGap(106)
									.addComponent(lbtValorCusto)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(fmtValorCusto, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lbtQuantidade)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtQuantidade, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))))
						.addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
							.addComponent(lbtValorVenda)
							.addGap(18)
							.addComponent(fmtValorVenda, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
						.addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
							.addComponent(btnNovo, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnPrimeiro, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnAnterior, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnProximo, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnUltimo, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(10, Short.MAX_VALUE))
		);
		pnlCadastroProdutoLayout.setVerticalGroup(
			pnlCadastroProdutoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(pnlCadastroProdutoLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
							.addGroup(pnlCadastroProdutoLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtCodigoProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbtCodigoBarras)
								.addComponent(txtCodigoBarras, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(LbtMedida)
								.addComponent(txtMedida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbCodigoProduto, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(pnlCadastroProdutoLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtDataCadastro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbtDataCadastro))
							.addGap(18)
							.addGroup(pnlCadastroProdutoLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbtDescricao)))
						.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(pnlCadastroProdutoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtAplicacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbtAplicação))
					.addGap(18)
					.addGroup(pnlCadastroProdutoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtValidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbtValidade)
						.addComponent(lbtFabricacao)
						.addComponent(txtFabricacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbtLote)
						.addComponent(txtLote, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(pnlCadastroProdutoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbtValorVenda)
						.addComponent(fmtValorVenda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbtValorCusto)
						.addComponent(fmtValorCusto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbtQuantidade)
						.addComponent(txtQuantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
					.addGroup(pnlCadastroProdutoLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(pnlCadastroProdutoLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(pnlCadastroProdutoLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnExcluir, 0, 0, Short.MAX_VALUE)
								.addComponent(btnAlterar, 0, 0, Short.MAX_VALUE)
								.addComponent(btnNovo, GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE))
							.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnPrimeiro, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnAnterior, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnProximo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUltimo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(65))
		);
		pnlCadastroProduto.setLayout(pnlCadastroProdutoLayout);

		jTabbedPane1.addTab("Cadastro de Produtos", pnlCadastroProduto);

		pnlPesquisaProduto.setBackground(new java.awt.Color(255, 255, 255));

		lbtCodigoBarrasPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbtCodigoBarrasPesquisa.setText("Código de Barras");

		lbtMedidaPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbtMedidaPesquisa.setText("Medida");

		lbtDescricaoPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbtDescricaoPesquisa.setText("Descrição");

		lbtAplicaçãoPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbtAplicaçãoPesquisa.setText("Aplicação");

		tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] {

				}));
		jScrollPane1.setViewportView(tabelaProdutos);

		btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/Lupas_1330_21.jpg"))); // NOI18N

		javax.swing.GroupLayout pnlPesquisaProdutoLayout = new javax.swing.GroupLayout(
				pnlPesquisaProduto);
		pnlPesquisaProdutoLayout.setHorizontalGroup(
			pnlPesquisaProdutoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, pnlPesquisaProdutoLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(pnlPesquisaProdutoLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jScrollPane1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, pnlPesquisaProdutoLayout.createSequentialGroup()
							.addComponent(lbtCodigoBarrasPesquisa)
							.addGap(20)
							.addComponent(txtCodigoBarrasPesquisa, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addGap(17)
							.addComponent(lbtMedidaPesquisa)
							.addGap(18)
							.addComponent(txtMedidaPesquisa, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
							.addComponent(btnPesquisar, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, pnlPesquisaProdutoLayout.createSequentialGroup()
							.addComponent(lbtAplicaçãoPesquisa)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtAplicacaoPesquisa, 544, 544, 544))
						.addGroup(Alignment.LEADING, pnlPesquisaProdutoLayout.createSequentialGroup()
							.addComponent(lbtDescricaoPesquisa)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtDescricaoPesquisa, 542, 542, 542)))
					.addContainerGap())
		);
		pnlPesquisaProdutoLayout.setVerticalGroup(
			pnlPesquisaProdutoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pnlPesquisaProdutoLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(pnlPesquisaProdutoLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(pnlPesquisaProdutoLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lbtCodigoBarrasPesquisa)
							.addComponent(lbtMedidaPesquisa)
							.addComponent(txtCodigoBarrasPesquisa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtMedidaPesquisa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnPesquisar, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(pnlPesquisaProdutoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbtDescricaoPesquisa)
						.addComponent(txtDescricaoPesquisa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(pnlPesquisaProdutoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbtAplicaçãoPesquisa)
						.addComponent(txtAplicacaoPesquisa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(69, Short.MAX_VALUE))
		);
		pnlPesquisaProduto.setLayout(pnlPesquisaProdutoLayout);

		jTabbedPane1.addTab("Pesquisa de Produtos", pnlPesquisaProduto);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jTabbedPane1, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 448, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>

	private void fmtValorVendaActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(
					FrmCadastroProdutos.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(
					FrmCadastroProdutos.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(
					FrmCadastroProdutos.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(
					FrmCadastroProdutos.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FrmCadastroProdutos().setVisible(true);

			}

		});
	}

	// Variables declaration - do not modify
	private javax.swing.JLabel LbtMedida;
	private javax.swing.JButton btnAlterar;
	private javax.swing.JButton btnAnterior;
	private javax.swing.JButton btnExcluir;
	private javax.swing.JButton btnNovo;
	private javax.swing.JButton btnPesquisar;
	private javax.swing.JButton btnPrimeiro;
	private javax.swing.JButton btnProximo;
	private javax.swing.JButton btnSalvar;
	private javax.swing.JButton btnUltimo;
	private javax.swing.JFormattedTextField fmtValorCusto;
	private javax.swing.JFormattedTextField fmtValorVenda;
	private javax.swing.JButton jButton3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JLabel lbtAplicação;
	private javax.swing.JLabel lbtAplicaçãoPesquisa;
	private javax.swing.JLabel lbtCodigoBarras;
	private javax.swing.JLabel lbtCodigoBarrasPesquisa;
	private javax.swing.JLabel lbtDataCadastro;
	private javax.swing.JLabel lbtDescricao;
	private javax.swing.JLabel lbtDescricaoPesquisa;
	private javax.swing.JLabel lbtFabricacao;
	private javax.swing.JLabel lbtLote;
	private javax.swing.JLabel lbtMedidaPesquisa;
	private javax.swing.JLabel lbtQuantidade;
	private javax.swing.JLabel lbtValidade;
	private javax.swing.JLabel lbtValorCusto;
	private javax.swing.JLabel lbtValorVenda;
	private javax.swing.JPanel pnlCadastroProduto;
	private javax.swing.JPanel pnlPesquisaProduto;
	private javax.swing.JTable tabelaProdutos;
	private javax.swing.JTextField txtAplicacao;
	private javax.swing.JTextField txtAplicacaoPesquisa;
	private javax.swing.JTextField txtCodigoBarras;
	private javax.swing.JTextField txtCodigoBarrasPesquisa;
	private javax.swing.JTextField txtDataCadastro;
	private javax.swing.JTextField txtDescricao;
	private javax.swing.JTextField txtDescricaoPesquisa;
	private javax.swing.JTextField txtFabricacao;
	private javax.swing.JTextField txtLote;
	private javax.swing.JTextField txtMedida;
	private javax.swing.JTextField txtMedidaPesquisa;
	private javax.swing.JTextField txtQuantidade;
	private javax.swing.JTextField txtValidade;
	private JTextField txtCodigoProduto;
}
