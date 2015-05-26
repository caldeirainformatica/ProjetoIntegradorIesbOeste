package view;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import model.ModeloTabela;
import model.Produtos;
import persistencia.ConectaBanco;
import persistencia.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.JScrollPane;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JFormattedTextField;

import java.awt.Dimension;

import javax.swing.JButton;

/**
 * @author Ricardo Caldeira
 */

public class FrmVendas extends javax.swing.JFrame {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ConectaBanco conecta = new ConectaBanco();
	DAO dao = new DAO();
	Produtos p = new Produtos();
	private ResultSet rs;
	String codigo;

	public FrmVendas() throws ParseException {
		setLocation(new Point(0, 200));

		setIconImage(Toolkit.getDefaultToolkit().getImage(
				FrmVendas.class.getResource("/images/th.jpg")));
		setResizable(false);
		setTitle("VENDAS");
		setType(Type.UTILITY);
		initComponents();
		
	
		conecta.conexao();
		selectProdutos();
		
		try {
			preencherTabela("select *from produtos order by idProdutos");
			
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			

	}

	private void selectProdutos() {
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

		jPanel1 = new javax.swing.JPanel();
		lbCodigoBarras = new javax.swing.JLabel();
		lbDescricao = new javax.swing.JLabel();
		lbAplicacao = new javax.swing.JLabel();
		txtCodigoBarras = new javax.swing.JTextField();
		txtDescricao = new javax.swing.JTextField();
		txtAplicacao = new javax.swing.JTextField();
		btnPesquisar = new javax.swing.JButton();
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (!txtCodigoBarras.getText().equals("")) {
					p.setCodigoBarras(txtCodigoBarras.getText());
				}
				if (!txtDescricao.getText().equals("")) {
					p.setDescricao(txtDescricao.getText());
				}
				if (!txtAplicacao.getText().equals("")) {
					p.setAplicacao(txtAplicacao.getText());
				}
				if ((txtCodigoBarras.getText().equals(""))
						&& (txtDescricao.getText().equals(""))
						&& (txtAplicacao.getText().equals(""))) {
					JOptionPane
							.showMessageDialog(null,
									"E necessário digitar alguma coisa para a pesquisa");
				} else {
					try {
						preencherTabela("select * from produtos where codigoBarras like '%"
								+ p.getCodigoBarras()
								+ "%'"
								+ " or descricao like '%"
								+ p.getDescricao()
								+ "%' or aplicacao like '%"
								+ p.getAplicacao()
								+ "%'");

					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});
		btnPesquisar.setIcon(new ImageIcon(FrmVendas.class
				.getResource("/images/zoom.png")));
		jPanel2 = new javax.swing.JPanel();
		lbItens = new javax.swing.JLabel();
		btnLimpa = new javax.swing.JButton();
		btnLimpa.setIcon(new ImageIcon(FrmVendas.class
				.getResource("/images/cancel.png")));
		btnFinaliza = new javax.swing.JButton();
		btnFinaliza.setIcon(new ImageIcon(FrmVendas.class
				.getResource("/images/money_dollar.png")));
		btnFechar = new javax.swing.JButton();
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();

			}
		});
		btnFechar.setIcon(new ImageIcon(FrmVendas.class
				.getResource("/images/door_out.png")));
		lbSubTotal = new javax.swing.JLabel();
		scrProdutoVenda = new javax.swing.JScrollPane();
		tabelaVendaProduto = new javax.swing.JTable();
		tabelaVendaProduto.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
		//		tabelaVendaProduto.set
			}
		});
		tabelaVendaProduto.setGridColor(Color.WHITE);
		tabelaVendaProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tabelaVendaProduto.setSurrendersFocusOnKeystroke(true);

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		lbCodigoBarras.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbCodigoBarras.setText("Código Barras");

		lbDescricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbDescricao.setText("Descrição");

		lbAplicacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbAplicacao.setText("Aplicação");

		btnPesquisar.setText("Pesquisar");
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(FrmVendas.class.getResource("/images/th.jpg")));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addComponent(lbCodigoBarras)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtCodigoBarras, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lbDescricao)
							.addGap(28)
							.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lbAplicacao)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtAplicacao, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnPesquisar))
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbCodigoBarras)
						.addComponent(txtCodigoBarras, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbDescricao)
						.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbAplicacao)
						.addComponent(txtAplicacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnPesquisar)
					.addGap(55))
				.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
					.addComponent(label)
					.addContainerGap(46, Short.MAX_VALUE))
		);
		jPanel1.setLayout(jPanel1Layout);

		lbItens.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
		lbItens.setForeground(new java.awt.Color(51, 51, 255));
		lbItens.setText("Itens");

		btnLimpa.setText("Limpa F6");

		btnFinaliza.setText("Finaliza F5");

		btnFechar.setText("Fechar F4");

		lbSubTotal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
		lbSubTotal.setForeground(new java.awt.Color(51, 51, 255));
		lbSubTotal.setText("SubTotal");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		lblCliente_1 = new JLabel();
		lblCliente_1.setText("Cliente");
		lblCliente_1.setForeground(new Color(51, 51, 255));
		lblCliente_1.setFont(new Font("Arial", Font.BOLD, 24));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(107)
							.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lbItens))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lbSubTotal))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCliente_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addComponent(btnLimpa)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnFinaliza)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnFechar)))))
					.addContainerGap())
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCliente_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lbItens)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbSubTotal)
					.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnFechar)
						.addComponent(btnFinaliza)
						.addComponent(btnLimpa))
					.addContainerGap())
		);
		jPanel2.setLayout(jPanel2Layout);

		tabelaVendaProduto.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Descri\u00E7\u00E3o", "Quantidade", "Valor Unit\u00E1rio", "Valor Total"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabelaVendaProduto.getColumnModel().getColumn(0).setResizable(false);
		tabelaVendaProduto.getColumnModel().getColumn(0).setPreferredWidth(101);
		tabelaVendaProduto.getColumnModel().getColumn(1).setResizable(false);
		tabelaVendaProduto.getColumnModel().getColumn(1).setPreferredWidth(253);
		tabelaVendaProduto.getColumnModel().getColumn(2).setResizable(false);
		tabelaVendaProduto.getColumnModel().getColumn(2).setPreferredWidth(88);
		tabelaVendaProduto.getColumnModel().getColumn(3).setResizable(false);
		tabelaVendaProduto.getColumnModel().getColumn(3).setPreferredWidth(93);
		tabelaVendaProduto.getColumnModel().getColumn(4).setResizable(false);
		tabelaVendaProduto.getColumnModel().getColumn(4).setPreferredWidth(105);
		scrProdutoVenda.setViewportView(tabelaVendaProduto);

		JScrollPane scrPesquisaProduto = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addComponent(scrProdutoVenda, GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
				.addComponent(scrPesquisaProduto, GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrPesquisaProduto, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(scrProdutoVenda, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
						.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(3))
		);
		panel.setLayout(null);
		
		txtDescricaoFim = new JTextField();
		txtDescricaoFim.setBounds(87, 9, 223, 32);
		panel.add(txtDescricaoFim);
		txtDescricaoFim.setColumns(10);
		
		JLabel lbDescricaoFim = new JLabel("Descri\u00E7\u00E3o");
		lbDescricaoFim.setFont(new Font("Arial", Font.PLAIN, 14));
		lbDescricaoFim.setBounds(10, 11, 80, 14);
		panel.add(lbDescricaoFim);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setFont(new Font("Arial", Font.PLAIN, 14));
		lblQuantidade.setBounds(321, 12, 80, 14);
		panel.add(lblQuantidade);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(414, 9, 86, 32);
		panel.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		JLabel lblValorUnitrio = new JLabel("Valor Unit\u00E1rio");
		lblValorUnitrio.setFont(new Font("Arial", Font.PLAIN, 14));
		lblValorUnitrio.setBounds(510, 12, 86, 14);
		panel.add(lblValorUnitrio);
		
		JFormattedTextField fmtValorUnitario = new JFormattedTextField();
		fmtValorUnitario.setBounds(606, 9, 95, 32);
		panel.add(fmtValorUnitario);
		
		JLabel lblData = new JLabel("Data");
		lblData.setFont(new Font("Arial", Font.PLAIN, 14));
		lblData.setBounds(10, 52, 46, 14);
		panel.add(lblData);
		
		JButton btnCarrinho = new JButton("Adiciona Item ao Carrinho");
		btnCarrinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel dtm = (DefaultTableModel) tabelaVendaProduto.getModel();
				
				String valorUnitario = fmtValorUnitario.getText().trim();
				String quantidade = txtQuantidade.getText().trim();
				String descricaoFim = txtDescricaoFim.getText().trim();
				String valorTotal = String.valueOf((Double.parseDouble(txtQuantidade.getText())*Double.parseDouble(fmtValorUnitario.getText())));
				
				
				dtm.addRow(new String[]{codigo, descricaoFim, quantidade, valorUnitario, valorTotal});
				
				
				txtDescricaoFim.setText("");
				txtQuantidade.setText("");
				fmtValorUnitario.setText("");
				
			}
		});
		btnCarrinho.setIcon(new ImageIcon(FrmVendas.class.getResource("/images/cart_add.png")));
		btnCarrinho.setBounds(715, 8, 194, 33);
		panel.add(btnCarrinho);
		
		JFormattedTextField fmtData = new JFormattedTextField();
		fmtData.setBounds(66, 52, 80, 36);
		panel.add(fmtData);
		
		try {
			MaskFormatter form = new MaskFormatter("##/##/####");
			fmtData.setFormatterFactory(new DefaultFormatterFactory(form));
			fmtData.setText("27052015");
			fmtData.setEnabled(false);
		} catch (Exception e) {
			// TODO: handle exception
		}

		tabelaPesquisaProdutos = new JTable();
		tabelaPesquisaProdutos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (e.getButton() == MouseEvent.BUTTON1
						&& e.getClickCount() == 2) {
					if (tabelaPesquisaProdutos.getSelectedRow() > -1) {

						int linhaSelecionada = tabelaPesquisaProdutos
								.getSelectedRow();
						if (linhaSelecionada == -1) {
							JOptionPane.showMessageDialog(null,
									"Não tem nada selecionado");
						} else {
							txtDescricaoFim.setText(String.valueOf(tabelaPesquisaProdutos.getValueAt(linhaSelecionada, 2)));
							txtQuantidade.setText("1");
							fmtValorUnitario.setText(String.valueOf(tabelaPesquisaProdutos.getValueAt(linhaSelecionada, 4)));
							codigo = String.valueOf(tabelaPesquisaProdutos.getValueAt(linhaSelecionada, 0));
							
							
						}
							

					}

				

				}
			}
		});
		tabelaPesquisaProdutos.setModel(new DefaultTableModel(
				new Object[][] {}, new String[] {}));
		scrPesquisaProduto.setViewportView(tabelaPesquisaProdutos);
		getContentPane().setLayout(layout);

		pack();
	}

	public void preencherTabela(String sql) throws SQLException {
		ArrayList dados = new ArrayList();
		String[] colunas = new String[] { "Codigo", "Codigo Barras",
				"Descricao", "Aplicacao", "Preco", "Estoque Atual" };

		rs = conecta.executaSQL(sql);

		try {
			rs.first();
			do {
				dados.add(new Object[] { rs.getInt("idProdutos"),
						rs.getString("codigoBarras"),
						rs.getString("descricao"), rs.getString("aplicacao"),
						rs.getDouble("valorVenda"), rs.getDouble("quantidade") });

			} while (rs.next());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane
					.showMessageDialog(
							null,
							"Erro ao preencher a Tabela (ArrayList)\n"
									+ e.getMessage());
		}
		ModeloTabela modelo = new ModeloTabela(dados, colunas);
		tabelaPesquisaProdutos.setModel(modelo);
		tabelaPesquisaProdutos.getColumnModel().getColumn(0)
				.setPreferredWidth(95);
		tabelaPesquisaProdutos.getColumnModel().getColumn(0)
				.setResizable(false);
		tabelaPesquisaProdutos.getColumnModel().getColumn(1)
				.setPreferredWidth(190);
		tabelaPesquisaProdutos.getColumnModel().getColumn(1)
				.setResizable(false);
		tabelaPesquisaProdutos.getColumnModel().getColumn(2)
				.setPreferredWidth(355);
		tabelaPesquisaProdutos.getColumnModel().getColumn(2)
				.setResizable(false);
		tabelaPesquisaProdutos.getColumnModel().getColumn(3)
				.setPreferredWidth(355);
		tabelaPesquisaProdutos.getColumnModel().getColumn(3)
				.setResizable(false);
		tabelaPesquisaProdutos.getColumnModel().getColumn(4)
				.setPreferredWidth(180);
		tabelaPesquisaProdutos.getColumnModel().getColumn(4)
				.setResizable(false);
		tabelaPesquisaProdutos.getColumnModel().getColumn(5)
				.setPreferredWidth(180);
		tabelaPesquisaProdutos.getColumnModel().getColumn(5)
				.setResizable(false);
		tabelaPesquisaProdutos.getTableHeader().setReorderingAllowed(false);
		tabelaPesquisaProdutos
				.setAutoResizeMode(tabelaPesquisaProdutos.AUTO_RESIZE_OFF);
		tabelaPesquisaProdutos
				.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	}

	public static void main(String args[]) {

		/*
		 * Inicio do programa
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
			java.util.logging.Logger.getLogger(FrmVendas.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrmVendas.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrmVendas.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrmVendas.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmVendas vendas = new FrmVendas();
					vendas.setVisible(true);
					vendas.setExtendedState(MAXIMIZED_BOTH);
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton btnLimpa;
	private javax.swing.JButton btnFinaliza;
	private javax.swing.JButton btnFechar;
	private javax.swing.JButton btnPesquisar;
	private javax.swing.JLabel lbCodigoBarras;
	private javax.swing.JLabel lbDescricao;
	private javax.swing.JLabel lbAplicacao;
	private javax.swing.JLabel lbItens;
	private javax.swing.JLabel lbSubTotal;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane scrProdutoVenda;
	private javax.swing.JTable tabelaVendaProduto;
	private javax.swing.JTextField txtCodigoBarras;
	private javax.swing.JTextField txtDescricao;
	private javax.swing.JTextField txtAplicacao;
	private JTable tabelaPesquisaProdutos;
	private JTextField txtDescricaoFim;
	private JTextField txtQuantidade;
	private JLabel label;
	private JTextField textField_2;
	private JLabel lblCliente_1;
}
