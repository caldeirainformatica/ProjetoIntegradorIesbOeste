/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.FlowLayout;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

import model.ConnectionFactory;
import model.Produtos;

/**
 *
 * @author Ricardo Caldeira
 */
public class PnlCadastroProdutos extends javax.swing.JPanel {
	
	

	/**
	 * Creates new form PnlCadastroProdutos
	 * @throws ParseException 
	 */
	public PnlCadastroProdutos() throws ParseException {
		initComponents();
		
		/**
		 * Cria��o dos campos formatados.
		 */
		ftxtValorVenda = new JFormattedTextField("R$ ###.###.###,##0,00");
		ftxtValorCusto = new JFormattedTextField("R$ ###.###.###,##0,00");
		JFormattedTextField valorVenda = new JFormattedTextField(ftxtValorVenda);
		JFormattedTextField valorCusto = new JFormattedTextField(ftxtValorCusto);
		valorVenda.setColumns(14);
		valorCusto.setColumns(14);
		add(valorVenda);
		add(valorCusto);
	}
	

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jPanel1 = new javax.swing.JPanel();
		lbtDescricao = new javax.swing.JLabel();
		lbtCodigoBarras = new javax.swing.JLabel();
		lbtMedida = new javax.swing.JLabel();
		lbtValidade = new javax.swing.JLabel();
		lbtFabricacao = new javax.swing.JLabel();
		lbtLote = new javax.swing.JLabel();
		lbtAplicacao = new javax.swing.JLabel();
		txtCodigoBarras = new javax.swing.JTextField();
		txtValidade = new javax.swing.JTextField();
		txtFabricacao = new javax.swing.JTextField();
		txtLote = new javax.swing.JTextField();
		txtDescricao = new javax.swing.JTextField();
		txtAplicacao = new javax.swing.JTextField();
		txtMedida = new javax.swing.JTextField();
		btnIncluir = new javax.swing.JButton();
		btnSalvar = new javax.swing.JButton();
		btnExcluir = new javax.swing.JButton();
		btnPesquisar = new javax.swing.JButton();
		btnAlterar = new javax.swing.JButton();
		btnSair = new javax.swing.JButton();
		ftxtValorVenda = new javax.swing.JFormattedTextField();
		lbtValorVenda = new javax.swing.JLabel();
		lbtValorCusto = new javax.swing.JLabel();
		ftxtValorCusto = new javax.swing.JFormattedTextField();
		lbtCabecalho = new javax.swing.JLabel();

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		lbtDescricao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		lbtDescricao.setText("Descri��o");

		lbtCodigoBarras.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbtCodigoBarras.setText("C�digo de Barras");

		lbtMedida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbtMedida.setText("Medida");

		lbtValidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbtValidade.setText("Validade");

		lbtFabricacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbtFabricacao.setText("Fabrica��o");

		lbtLote.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lbtLote.setText("Lote");

		lbtAplicacao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		lbtAplicacao.setText("Aplica��o");

		btnIncluir.setIcon(new ImageIcon(PnlCadastroProdutos.class
				.getResource("/images/add.png"))); // NOI18N
		btnIncluir.setToolTipText("Incluir");
		btnIncluir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnIncluirActionPerformed(evt);
			}
		});

		btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/Botoes_5103_usb_48.png"))); // NOI18N
		btnSalvar.setToolTipText("Salvar");
		btnSalvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSalvarActionPerformed(evt);
			}
		});

		btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/Botoes_5116_cross_48.png"))); // NOI18N
		btnExcluir.setToolTipText("Excluir");
		btnExcluir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnExcluirActionPerformed(evt);
			}
		});

		btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/Lupas_1330_21.jpg"))); // NOI18N
		btnPesquisar.setToolTipText("Pesquisar");
		btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnPesquisarActionPerformed(evt);
			}
		});

		btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/alterar.png"))); // NOI18N
		btnAlterar.setToolTipText("Alterar");
		btnAlterar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAlterarActionPerformed(evt);
			}
		});

		btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/domesticos_2141_porta.gif"))); // NOI18N
		btnSair.setToolTipText("Sair");
		btnSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSairActionPerformed(evt);
			}
		});

		lbtValorVenda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		lbtValorVenda.setText("Valor Venda");

		lbtValorCusto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		lbtValorCusto.setText("Valor Custo");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(115,
																				115,
																				115)
																		.addGap(72,
																				72,
																				72)
																		.addComponent(
																				btnExcluir,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				72,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(26,
																				26,
																				26)
																		.addComponent(
																				btnPesquisar,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				70,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(26,
																				26,
																				26)
																		.addComponent(
																				btnSalvar,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				76,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGap(10,
																				10,
																				10)
																		.addComponent(
																				btnSair,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				71,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				btnIncluir,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				71,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				btnAlterar,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				71,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								lbtDescricao)
																						.addComponent(
																								lbtCodigoBarras)
																						.addComponent(
																								lbtAplicacao)
																						.addComponent(
																								lbtValidade)
																						.addComponent(
																								lbtValorVenda))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												txtCodigoBarras,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												91,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(47,
																												47,
																												47)
																										.addComponent(
																												lbtMedida)
																										.addGap(18,
																												18,
																												18)
																										.addComponent(
																												txtMedida,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												44,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addComponent(
																								txtDescricao,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								457,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								txtAplicacao,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								457,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																false)
																														.addComponent(
																																ftxtValorVenda,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																81,
																																Short.MAX_VALUE)
																														.addComponent(
																																txtValidade))
																										.addGap(45,
																												45,
																												45)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				lbtFabricacao)
																																		.addGap(18,
																																				18,
																																				18)
																																		.addComponent(
																																				txtFabricacao,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				86,
																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				lbtValorCusto)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																		.addComponent(
																																				ftxtValorCusto)))
																										.addGap(40,
																												40,
																												40)
																										.addComponent(
																												lbtLote)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												txtLote)))))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(14, 14, 14)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																lbtCodigoBarras)
														.addComponent(
																txtCodigoBarras,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(lbtMedida)
														.addComponent(
																txtMedida,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																txtDescricao,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lbtDescricao))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																lbtAplicacao)
														.addComponent(
																txtAplicacao,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																lbtValidade)
														.addComponent(
																txtValidade,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lbtFabricacao)
														.addComponent(
																txtFabricacao,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																txtLote,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(lbtLote))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																ftxtValorVenda,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lbtValorVenda)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				ftxtValorCusto,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				lbtValorCusto)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												35, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																btnExcluir)
														.addComponent(
																btnPesquisar)
														.addComponent(
																btnAlterar)
														.addComponent(
																btnIncluir,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																btnSalvar,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																btnSair,
																javax.swing.GroupLayout.Alignment.TRAILING))
										.addGap(22, 22, 22)));

		lbtCabecalho.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
		lbtCabecalho.setForeground(new java.awt.Color(102, 102, 255));
		lbtCabecalho.setText("Formulario de Cadastro de Produtos");
		lbtCabecalho.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jPanel1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(134,
																		134,
																		134)
																.addComponent(
																		lbtCabecalho,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		327,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(lbtCabecalho)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
	}// </editor-fold>

	private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		
	}

	private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {
		Produtos produtos = new Produtos();
		String descricao = txtDescricao.getText();
		txtDescricao.setText(txtDescricao.getText().toUpperCase());
		txtAplicacao.setText(txtAplicacao.getText().toUpperCase());
		txtMedida.setText(txtMedida.getText().toUpperCase());

		if (descricao != ("")) { // Valida��o da descri��o
			produtos.setDescricao(descricao);
		} else {
			JOptionPane.showMessageDialog(null,
					"O campo Descri��o e obrigat�rio");
		}

		 
	}

	private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	// Variables declaration - do not modify
	private javax.swing.JButton btnAlterar;
	private javax.swing.JButton btnExcluir;
	private javax.swing.JButton btnIncluir;
	private javax.swing.JButton btnPesquisar;
	private javax.swing.JButton btnSair;
	private javax.swing.JButton btnSalvar;
	private JFormattedTextField ftxtValorCusto;
	private JFormattedTextField ftxtValorVenda;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JLabel lbtAplicacao;
	private javax.swing.JLabel lbtCabecalho;
	private javax.swing.JLabel lbtCodigoBarras;
	private javax.swing.JLabel lbtDescricao;
	private javax.swing.JLabel lbtFabricacao;
	private javax.swing.JLabel lbtLote;
	private javax.swing.JLabel lbtMedida;
	private javax.swing.JLabel lbtValidade;
	private javax.swing.JLabel lbtValorCusto;
	private javax.swing.JLabel lbtValorVenda;
	private javax.swing.JTextField txtAplicacao;
	private javax.swing.JTextField txtCodigoBarras;
	private javax.swing.JTextField txtDescricao;
	private javax.swing.JTextField txtFabricacao;
	private javax.swing.JTextField txtLote;
	private javax.swing.JTextField txtMedida;
	private javax.swing.JTextField txtValidade;
	// End of variables declaration
}
