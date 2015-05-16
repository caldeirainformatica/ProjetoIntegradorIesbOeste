package view;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import persistencia.ConectaBanco;
import persistencia.DAO;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.ModeloTabela;
import model.Produtos;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;

import java.awt.Font;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author RicardoNote
 */
public class FrmCadastroProdutos extends JFrame {
	ConectaBanco conecta = new ConectaBanco();
	Produtos p = new Produtos();
	DAO dao = new DAO();
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
		setPreferredSize(new Dimension(720, 500));

		initComponents();
		
		btnOk.setVisible(false);
		conecta.conexao();
		setLocation(370, 200);
		btnConfirmar.setVisible(false);
		btnOk.setVisible(false);
		if (!txtCodigoProduto.getText().equals("")) {
			btnExcluir.setEnabled(true);
		} else {
			btnExcluir.setEnabled(false);

		}
		selectProduos();

		if (txtCodigoProduto.getText().equals("")) {
			btnExcluir.setEnabled(false);
		} else {
			btnExcluir.setEnabled(true);
		}

	}

	private void selectProduos() {
		PreparedStatement pst;
		try {
			pst = conecta.conn.prepareStatement("select * from produtos");
			rs = pst.executeQuery();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}

	private void initComponents() {

		TablePanel1 = new javax.swing.JTabbedPane();
		pnlCadastroProduto = new javax.swing.JPanel();
		btnAlterar = new javax.swing.JButton();
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtCodigoProduto.setEnabled(true);
				txtCodigoBarras.setEnabled(true);
				txtMedida.setEnabled(true);
				txtDescricao.setEnabled(true);
				txtAplicacao.setEnabled(true);
				fmtValorCusto.setEnabled(true);
				fmtValorVenda.setEnabled(true);
				txtQuantidade.setEnabled(true);
				btnConfirmar.setVisible(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				
			}
		});
		btnAlterar.setEnabled(false);
		btnAlterar.setToolTipText("Alterar");
		btnExcluir = new javax.swing.JButton();
		btnExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 btnConfirmar.setVisible(true);
			}
		});
		btnExcluir.setToolTipText("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					PreparedStatement pst = conecta.conn
							.prepareStatement("delete from produtos where "
									+ "produtos.idprodutos = ?");
					pst.setString(1, txtCodigoProduto.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null,
							"Deletado com sucesso!!!");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null,
							"Erro ao deletar produto");
				}

				txtCodigoProduto.setText("");
				txtCodigoBarras.setText("");
				txtAplicacao.setText("");
				txtDescricao.setText("");
				txtMedida.setText("");
				txtQuantidade.setText("");
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
					p.setCodigoBarras(txtCodigoBarras.getText());
					p.setDescricao(txtDescricao.getText());
					p.setAplicacao(txtAplicacao.getText());
					p.setMedida(txtMedida.getText());
					p.setValorVenda(Double.valueOf(fmtValorVenda.getText()));
					p.setValorCusto(Double.valueOf(fmtValorCusto.getText()));
					p.setQuantidade(Double.valueOf(txtQuantidade.getText()));
					dao.insert(p);
					JOptionPane.showMessageDialog(null,
							"Produto salvo com sucesso");

					txtCodigoProduto.setText("");
					txtCodigoBarras.setText("");
					txtAplicacao.setText("");
					txtDescricao.setText("");
					txtMedida.setText("");
					txtQuantidade.setText("");
					fmtValorCusto.setText("");
					fmtValorVenda.setText("");
					txtCodigoProduto.setEnabled(false);
					txtCodigoBarras.setEnabled(false);
					txtAplicacao.setEnabled(false);
					txtDescricao.setEnabled(false);
					txtMedida.setEnabled(false);
					txtQuantidade.setEnabled(false);
					fmtValorCusto.setEnabled(false);
					fmtValorVenda.setEnabled(false);
					btnAlterar.setEnabled(false);
					btnExcluir.setEnabled(false);
					btnSalvar.setEnabled(false);
					btnNovo.setEnabled(true);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(
							null,
							"PRODUTOS Erro ao cadastrar \n Erro "
									+ e1.getMessage());

				}
				// } else {
				// implementar aqui o update da alteração
				// }

			}
		});
		btnNovo = new javax.swing.JButton();
		btnNovo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnOk.setVisible(false);
				btnConfirmar.setVisible(false);
				
			}
		});
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				txtCodigoProduto.setText("");
				txtCodigoBarras.setText("");
				txtAplicacao.setText("");
				txtDescricao.setText("");
				txtMedida.setText("");
				txtQuantidade.setText("");
				fmtValorCusto.setText("");
				fmtValorVenda.setText("");

				// txtCodigoProduto.setEnabled(true);
				txtCodigoBarras.setEnabled(true);
				txtAplicacao.setEnabled(true);
				txtDescricao.setEnabled(true);
				txtMedida.setEnabled(true);
				txtQuantidade.setEnabled(true);
				fmtValorCusto.setEnabled(true);
				fmtValorVenda.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnSalvar.setEnabled(true);
				btnNovo.setEnabled(false);
			}
		});
		btnNovo.setToolTipText("Novo");
		lbtCodigoBarras = new javax.swing.JLabel();
		lbtDescricao = new javax.swing.JLabel();
		lbtAplicação = new javax.swing.JLabel();
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
					// PreparedStatement pst =
					// conecta.conn.prepareStatement("select * from produtos");
					// rs = pst.executeQuery();
					rs.first();
					txtCodigoProduto.setText(String.valueOf(rs
							.getInt("idProdutos")));
					txtCodigoBarras.setText(rs.getString("codigoBarras"));
					txtDescricao.setText(rs.getString("descricao"));
					txtAplicacao.setText(rs.getString("aplicacao"));
					txtMedida.setText(rs.getString("medida"));
					txtQuantidade.setText(String.valueOf(rs
							.getInt("quantidade")));
					fmtValorCusto.setText(String.valueOf(rs.getDouble("valorCusto")));
					fmtValorVenda.setText(String.valueOf(rs.getDouble("valorVenda")));

					btnExcluir.setEnabled(true);
					btnAlterar.setEnabled(true);
					btnNovo.setEnabled(false);
					btnSalvar.setEnabled(false);

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(
							null,
							"Erro ao mostrar dados \n Contacte ao suporte SPIC"
									+ " e informe o codigo codigo 687"
									+ e1.getMessage());
				}
			}
		});

		btnAnterior = new javax.swing.JButton();
		btnAnterior.setToolTipText("Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					rs.previous();
					txtCodigoProduto.setText(String.valueOf(rs
							.getInt("idProdutos")));
					txtCodigoBarras.setText(rs.getString("codigoBarras"));
					txtDescricao.setText(rs.getString("descricao"));
					txtAplicacao.setText(rs.getString("aplicacao"));
					txtMedida.setText(rs.getString("medida"));
					txtQuantidade.setText(String.valueOf(rs
							.getInt("quantidade")));

					btnExcluir.setEnabled(true);
					btnAlterar.setEnabled(true);
					btnNovo.setEnabled(false);
					btnSalvar.setEnabled(false);

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(
							null,
							"Erro ao mostrar dados \n Contacte ao suporte SPIC"
									+ " e informe o codigo codigo 687"
									+ e1.getMessage());
				}
			}
		});
		btnProximo = new javax.swing.JButton();
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					rs.next();
					txtCodigoProduto.setText(String.valueOf(rs
							.getInt("idProdutos")));
					txtCodigoBarras.setText(rs.getString("codigoBarras"));
					txtDescricao.setText(rs.getString("descricao"));
					txtAplicacao.setText(rs.getString("aplicacao"));
					txtMedida.setText(rs.getString("medida"));
					txtQuantidade.setText(String.valueOf(rs
							.getInt("quantidade")));

					btnExcluir.setEnabled(true);
					btnAlterar.setEnabled(true);
					btnNovo.setEnabled(false);
					btnSalvar.setEnabled(false);

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(
							null,
							"Erro ao mostrar dados \n Contacte ao suporte SPIC"
									+ " e informe o codigo codigo 687"
									+ e1.getMessage());
				}
			}
		});
		btnProximo.setToolTipText("Pr\u00F3ximo");
		btnUltimo = new javax.swing.JButton();
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// PreparedStatement pst =
					// conecta.conn.prepareStatement("select * from produtos");
					// rs = pst.executeQuery();
					rs.last();
					txtCodigoProduto.setText(String.valueOf(rs
							.getInt("idProdutos")));
					txtCodigoBarras.setText(rs.getString("codigoBarras"));
					txtDescricao.setText(rs.getString("descricao"));
					txtAplicacao.setText(rs.getString("aplicacao"));
					txtMedida.setText(rs.getString("medida"));
					txtQuantidade.setText(String.valueOf(rs
							.getInt("quantidade")));

					btnExcluir.setEnabled(true);
					btnAlterar.setEnabled(true);
					btnNovo.setEnabled(false);
					btnSalvar.setEnabled(false);

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(
							null,
							"Erro ao mostrar dados \n Contacte ao suporte SPIC"
									+ " e informe o codigo codigo 687"
									+ e1.getMessage());
				}
			}
		});
		btnUltimo.setToolTipText("\u00DAltimo");

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		TablePanel1.setBackground(new java.awt.Color(255, 255, 255));

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

		btnAnterior.setIcon(new ImageIcon(FrmCadastroProdutos.class
				.getResource("/images/Previous_48x48.png"))); // NOI18N

		btnProximo.setIcon(new ImageIcon(getClass().getResource(
				"/images/Next_48x48.png"))); // NOI18N

		btnUltimo.setIcon(new ImageIcon(FrmCadastroProdutos.class
				.getResource("/images/Redo_48x48.png")));

		JLabel lbCodigoProduto = new JLabel();
		lbCodigoProduto.setText("C\u00F3digo do Produto");
		lbCodigoProduto.setFont(new Font("Arial", Font.PLAIN, 14));

		txtCodigoProduto = new JTextField();
		txtCodigoProduto.setEnabled(false);
		txtCodigoProduto.setDisabledTextColor(Color.BLACK);

		JButton btnPesquisa = new JButton("");
		btnPesquisa.setToolTipText("Pesquisar");
		btnPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				txtCodigoProduto.setText("");
				txtCodigoBarras.setText("");
				txtAplicacao.setText("");
				txtDescricao.setText("");
				txtMedida.setText("");
				txtQuantidade.setText("");
				fmtValorCusto.setText("");
				fmtValorVenda.setText("");

				txtCodigoProduto.setEnabled(true);
				txtCodigoBarras.setEnabled(true);
				txtAplicacao.setEnabled(true);
				txtDescricao.setEnabled(true);
				txtMedida.setEnabled(true);
				txtQuantidade.setEnabled(true);
				fmtValorCusto.setEnabled(true);
				fmtValorVenda.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnSalvar.setEnabled(false);
				btnNovo.setEnabled(false);

				btnOk.setVisible(true);

			}
		});
		btnPesquisa.setIcon(new ImageIcon(FrmCadastroProdutos.class
				.getResource("/images/Lupas_1330_21.jpg")));

		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ResultSet rs;
					conecta.conexao();
					PreparedStatement pst = conecta.conn
							.prepareStatement("select * from produtos where produtos.descricao like ?");
					pst.setInt(1, Integer.valueOf(txtCodigoProduto.getText()));
					pst.setString(2, txtDescricao.getText());
					pst.setString(3, txtAplicacao.getText());
					rs = pst.executeQuery();
					txtCodigoProduto.setText(String.valueOf(rs
							.getInt("idProdutos")));
					txtCodigoBarras.setText(rs.getString("codigoBarras"));
					txtMedida.setText(rs.getString("medida"));
					txtDescricao.setText(rs.getString("descricao"));
					txtAplicacao.setText(rs.getString("aplicacao"));
					fmtValorVenda.setText(String.valueOf(rs
							.getDouble("valorVenda")));
					fmtValorCusto.setText(String.valueOf(rs
							.getDouble("valorCusto")));
					txtQuantidade.setText(String.valueOf(rs
							.getDouble("quantidade")));

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(
							null,
							"Deu erro aqui. linha 660 aproximado \n erro "
									+ e1.getMessage());
				}

			}
		});

		JButton btnCancelar = new JButton("");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtCodigoProduto.setText("");
				txtCodigoBarras.setText("");
				txtAplicacao.setText("");
				txtDescricao.setText("");
				txtMedida.setText("");
				txtQuantidade.setText("");
				fmtValorCusto.setText("");
				fmtValorVenda.setText("");

				txtCodigoProduto.setEnabled(false);
				txtCodigoBarras.setEnabled(false);
				txtAplicacao.setEnabled(false);
				txtDescricao.setEnabled(false);
				txtMedida.setEnabled(false);
				txtQuantidade.setEnabled(false);
				fmtValorCusto.setEnabled(false);
				fmtValorVenda.setEnabled(false);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnSalvar.setEnabled(false);
				btnNovo.setEnabled(true);
			}
		});
		btnCancelar.setToolTipText("Cancelar");
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setIcon(new ImageIcon(FrmCadastroProdutos.class
				.getResource("/images/cancel.png")));

		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.setIdProdutos(Integer.parseInt(txtCodigoProduto.getText()));
				p.setCodigoBarras(txtCodigoBarras.getText());
				p.setAplicacao(txtAplicacao.getText());
				p.setMedida(txtMedida.getText());
				p.setDescricao(txtDescricao.getText());
				p.setValorVenda(Double.parseDouble(fmtValorVenda.getText()));
				p.setValorCusto(Double.parseDouble(fmtValorCusto.getText()));
				p.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
				dao.excluirProdutos(p);
				selectProduos();
				
				
			}
		});

		javax.swing.GroupLayout pnlCadastroProdutoLayout = new GroupLayout(
				pnlCadastroProduto);
		pnlCadastroProdutoLayout
				.setHorizontalGroup(pnlCadastroProdutoLayout
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								pnlCadastroProdutoLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(lbtCodigoBarras)
										.addGap(18)
										.addComponent(txtCodigoBarras,
												GroupLayout.PREFERRED_SIZE, 96,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(LbtMedida)
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addComponent(txtMedida,
												GroupLayout.PREFERRED_SIZE, 35,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(365, Short.MAX_VALUE))
						.addGroup(
								pnlCadastroProdutoLayout
										.createSequentialGroup().addGap(267)
										.addComponent(lbtAplicação)
										.addContainerGap(381, Short.MAX_VALUE))
						.addGroup(
								pnlCadastroProdutoLayout
										.createSequentialGroup()
										.addGroup(
												pnlCadastroProdutoLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																pnlCadastroProdutoLayout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				txtAplicacao,
																				GroupLayout.DEFAULT_SIZE,
																				679,
																				Short.MAX_VALUE))
														.addGroup(
																pnlCadastroProdutoLayout
																		.createSequentialGroup()
																		.addGap(0,
																				11,
																				Short.MAX_VALUE)
																		.addGroup(
																				pnlCadastroProdutoLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								pnlCadastroProdutoLayout
																										.createSequentialGroup()
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addGroup(
																												pnlCadastroProdutoLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addGroup(
																																pnlCadastroProdutoLayout
																																		.createSequentialGroup()
																																		.addGroup(
																																				pnlCadastroProdutoLayout
																																						.createParallelGroup(
																																								Alignment.TRAILING)
																																						.addGroup(
																																								pnlCadastroProdutoLayout
																																										.createSequentialGroup()
																																										.addComponent(
																																												btnConfirmar)
																																										.addGap(18)
																																										.addComponent(
																																												btnOk))
																																						.addGroup(
																																								pnlCadastroProdutoLayout
																																										.createSequentialGroup()
																																										.addComponent(
																																												btnNovo,
																																												GroupLayout.PREFERRED_SIZE,
																																												48,
																																												GroupLayout.PREFERRED_SIZE)
																																										.addGap(18)
																																										.addComponent(
																																												btnAlterar,
																																												GroupLayout.PREFERRED_SIZE,
																																												48,
																																												GroupLayout.PREFERRED_SIZE)
																																										.addGap(18)
																																										.addComponent(
																																												btnExcluir,
																																												GroupLayout.PREFERRED_SIZE,
																																												50,
																																												GroupLayout.PREFERRED_SIZE)
																																										.addGap(18)
																																										.addComponent(
																																												btnSalvar,
																																												GroupLayout.PREFERRED_SIZE,
																																												48,
																																												GroupLayout.PREFERRED_SIZE)
																																										.addGap(18)
																																										.addComponent(
																																												btnPrimeiro,
																																												GroupLayout.PREFERRED_SIZE,
																																												48,
																																												GroupLayout.PREFERRED_SIZE)
																																										.addGap(18)
																																										.addComponent(
																																												btnAnterior,
																																												GroupLayout.PREFERRED_SIZE,
																																												48,
																																												GroupLayout.PREFERRED_SIZE)
																																										.addGap(18)
																																										.addComponent(
																																												btnProximo,
																																												GroupLayout.PREFERRED_SIZE,
																																												48,
																																												GroupLayout.PREFERRED_SIZE)
																																										.addGap(18)
																																										.addComponent(
																																												btnUltimo,
																																												GroupLayout.PREFERRED_SIZE,
																																												48,
																																												GroupLayout.PREFERRED_SIZE)
																																										.addGap(18)
																																										.addComponent(
																																												btnPesquisa,
																																												GroupLayout.PREFERRED_SIZE,
																																												55,
																																												GroupLayout.PREFERRED_SIZE)))
																																		.addPreferredGap(
																																				ComponentPlacement.UNRELATED)
																																		.addComponent(
																																				btnCancelar))
																														.addComponent(
																																txtDescricao,
																																673,
																																673,
																																673)
																														.addGroup(
																																pnlCadastroProdutoLayout
																																		.createSequentialGroup()
																																		.addComponent(
																																				lbtValorVenda)
																																		.addGap(18)
																																		.addComponent(
																																				fmtValorVenda,
																																				GroupLayout.PREFERRED_SIZE,
																																				96,
																																				GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				ComponentPlacement.UNRELATED)
																																		.addComponent(
																																				lbtValorCusto)
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED)
																																		.addComponent(
																																				fmtValorCusto,
																																				GroupLayout.PREFERRED_SIZE,
																																				108,
																																				GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED)
																																		.addComponent(
																																				lbtQuantidade)
																																		.addPreferredGap(
																																				ComponentPlacement.UNRELATED)
																																		.addComponent(
																																				txtQuantidade,
																																				GroupLayout.PREFERRED_SIZE,
																																				64,
																																				GroupLayout.PREFERRED_SIZE))
																														.addGroup(
																																pnlCadastroProdutoLayout
																																		.createSequentialGroup()
																																		.addComponent(
																																				lbCodigoProduto)
																																		.addGap(10)
																																		.addComponent(
																																				txtCodigoProduto,
																																				GroupLayout.PREFERRED_SIZE,
																																				81,
																																				GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED,
																																				420,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				jButton3,
																																				GroupLayout.PREFERRED_SIZE,
																																				48,
																																				GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED))))
																						.addGroup(
																								pnlCadastroProdutoLayout
																										.createSequentialGroup()
																										.addGap(249)
																										.addComponent(
																												lbtDescricao)))))
										.addGap(20)));
		pnlCadastroProdutoLayout
				.setVerticalGroup(pnlCadastroProdutoLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								pnlCadastroProdutoLayout
										.createSequentialGroup()
										.addContainerGap(
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												pnlCadastroProdutoLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																pnlCadastroProdutoLayout
																		.createSequentialGroup()
																		.addComponent(
																				jButton3,
																				GroupLayout.PREFERRED_SIZE,
																				43,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(27)
																		.addComponent(
																				lbtDescricao))
														.addGroup(
																pnlCadastroProdutoLayout
																		.createSequentialGroup()
																		.addGroup(
																				pnlCadastroProdutoLayout
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								lbCodigoProduto,
																								GroupLayout.PREFERRED_SIZE,
																								17,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								txtCodigoProduto,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE))
																		.addGap(20)
																		.addGroup(
																				pnlCadastroProdutoLayout
																						.createParallelGroup(
																								Alignment.TRAILING,
																								false)
																						.addGroup(
																								pnlCadastroProdutoLayout
																										.createSequentialGroup()
																										.addComponent(
																												lbtCodigoBarras)
																										.addGap(6))
																						.addGroup(
																								pnlCadastroProdutoLayout
																										.createParallelGroup(
																												Alignment.BASELINE)
																										.addComponent(
																												txtCodigoBarras,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.DEFAULT_SIZE,
																												GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												LbtMedida)
																										.addComponent(
																												txtMedida,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.DEFAULT_SIZE,
																												GroupLayout.PREFERRED_SIZE)))))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addComponent(txtDescricao,
												GroupLayout.PREFERRED_SIZE, 40,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(lbtAplicação)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(txtAplicacao,
												GroupLayout.PREFERRED_SIZE, 33,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addGroup(
												pnlCadastroProdutoLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lbtValorVenda)
														.addComponent(
																fmtValorVenda,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lbtValorCusto)
														.addComponent(
																fmtValorCusto,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lbtQuantidade)
														.addComponent(
																txtQuantidade,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED, 33,
												Short.MAX_VALUE)
										.addGroup(
												pnlCadastroProdutoLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(btnOk)
														.addComponent(
																btnConfirmar))
										.addGap(34)
										.addGroup(
												pnlCadastroProdutoLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																pnlCadastroProdutoLayout
																		.createParallelGroup(
																				Alignment.LEADING)
																		.addGroup(
																				pnlCadastroProdutoLayout
																						.createParallelGroup(
																								Alignment.TRAILING,
																								false)
																						.addComponent(
																								btnExcluir,
																								0,
																								0,
																								Short.MAX_VALUE)
																						.addComponent(
																								btnAlterar,
																								0,
																								0,
																								Short.MAX_VALUE)
																						.addComponent(
																								btnNovo,
																								GroupLayout.PREFERRED_SIZE,
																								43,
																								Short.MAX_VALUE))
																		.addComponent(
																				btnSalvar,
																				GroupLayout.PREFERRED_SIZE,
																				43,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				btnPrimeiro,
																				GroupLayout.PREFERRED_SIZE,
																				42,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(
																btnAnterior,
																GroupLayout.PREFERRED_SIZE,
																42,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btnProximo,
																GroupLayout.PREFERRED_SIZE,
																42,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																pnlCadastroProdutoLayout
																		.createParallelGroup(
																				Alignment.LEADING)
																		.addComponent(
																				btnUltimo,
																				Alignment.TRAILING,
																				GroupLayout.PREFERRED_SIZE,
																				42,
																				GroupLayout.PREFERRED_SIZE)
																		.addGroup(
																				pnlCadastroProdutoLayout
																						.createSequentialGroup()
																						.addGap(1)
																						.addGroup(
																								pnlCadastroProdutoLayout
																										.createParallelGroup(
																												Alignment.LEADING,
																												false)
																										.addComponent(
																												btnCancelar,
																												Alignment.TRAILING,
																												GroupLayout.DEFAULT_SIZE,
																												GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												btnPesquisa,
																												Alignment.TRAILING,
																												GroupLayout.PREFERRED_SIZE,
																												42,
																												Short.MAX_VALUE))
																						.addPreferredGap(
																								ComponentPlacement.RELATED))))
										.addGap(65)));
		pnlCadastroProduto.setLayout(pnlCadastroProdutoLayout);

		TablePanel1.addTab("Cadastro de Produtos", pnlCadastroProduto);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addComponent(TablePanel1));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(TablePanel1,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>

	private void fmtValorVendaActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	public static void main(String args[]) {

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
				FrmCadastroProdutos cadProd = new FrmCadastroProdutos();
				cadProd.setVisible(true);

			}

		});
	}

	// Variables declaration - do not modify
	private javax.swing.JLabel LbtMedida;
	private javax.swing.JButton btnAlterar;
	private javax.swing.JButton btnAnterior;
	private javax.swing.JButton btnExcluir;
	private javax.swing.JButton btnNovo;
	private javax.swing.JButton btnPrimeiro;
	private javax.swing.JButton btnProximo;
	private javax.swing.JButton btnSalvar;
	private javax.swing.JButton btnUltimo;
	private javax.swing.JFormattedTextField fmtValorCusto;
	private javax.swing.JFormattedTextField fmtValorVenda;
	private javax.swing.JButton jButton3;
	private javax.swing.JTabbedPane TablePanel1;
	private javax.swing.JLabel lbtAplicação;
	private javax.swing.JLabel lbtCodigoBarras;
	private javax.swing.JLabel lbtDescricao;
	private javax.swing.JLabel lbtQuantidade;
	private javax.swing.JLabel lbtValorCusto;
	private javax.swing.JLabel lbtValorVenda;
	private javax.swing.JPanel pnlCadastroProduto;
	private javax.swing.JTextField txtAplicacao;
	private javax.swing.JTextField txtCodigoBarras;
	private javax.swing.JTextField txtDescricao;
	private javax.swing.JTextField txtMedida;
	private javax.swing.JTextField txtQuantidade;
	private JTextField txtCodigoProduto;
	private JButton btnOk;
	private JButton btnConfirmar;
}
