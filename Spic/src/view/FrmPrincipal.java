package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import persistencia.ConectaBanco;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Component;

/**
 *
 * @author Ricardo Caldeira
 */
public class FrmPrincipal extends javax.swing.JFrame {

	ConectaBanco conecta = new ConectaBanco(); // variavel global de conexão com
												// o banco de dados
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form FrmPrincipal
	 */
	public FrmPrincipal() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel pnlBotoes = new JPanel();
		pnlBotoes.setBackground(SystemColor.inactiveCaption);
		pnlBotoes.setBounds(0, 0, 1350, 75);
		getContentPane().add(pnlBotoes);
		pnlBotoes.setLayout(null);

		JButton btnProdutos = new JButton("");
		btnProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmCadastroProdutos cadastroProdutos = new FrmCadastroProdutos();
				cadastroProdutos.setResizable(false);
				cadastroProdutos.setVisible(true);
			}
		});
		btnProdutos.setIcon(new ImageIcon(FrmPrincipal.class
				.getResource("/images/Windows_Tools_Icon_48.png")));
		btnProdutos.setBounds(10, 11, 62, 53);
		pnlBotoes.add(btnProdutos);

		JButton btnVendas = new JButton("");
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmVendas vendas = new FrmVendas();
				vendas.setVisible(true);
				vendas.setResizable(false);
				vendas.setExtendedState(MAXIMIZED_BOTH);
			}
		});
		btnVendas.setIcon(new ImageIcon(FrmPrincipal.class
				.getResource("/images/Dollar.png")));
		btnVendas.setBounds(85, 11, 62, 53);
		pnlBotoes.add(btnVendas);

		JButton btnSair = new JButton("");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Pergunta para o usuário se tem mesmo certeza se deseja sair
				// ou nao
				if (JOptionPane.showConfirmDialog(null,
						"Tem certeza que deseja sair?", "Confirmar",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

					conecta.desconecta();
					System.exit(0);

				} else {

				}
			}
		});
		btnSair.setIcon(new ImageIcon(FrmPrincipal.class
				.getResource("/images/domesticos_2141_porta.gif")));
		btnSair.setBounds(157, 11, 62, 53);
		pnlBotoes.add(btnSair);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);

		JMenuItem mntmProdutos = new JMenuItem("Produtos");
		mnCadastro.add(mntmProdutos);

		JMenu mnMovimentos = new JMenu("Movimentos");
		menuBar.add(mnMovimentos);

		JMenuItem mntmVendas = new JMenuItem("Vendas");
		mnMovimentos.add(mntmVendas);
		initComponents();

		Container container = getContentPane();

		JPanel panel = new JPanel();
		panel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 73, 1350, 636);
		getContentPane().add(panel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/images/Logo Spic.jpg")));
		panel.add(label);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(tela.width, tela.height);  

		conecta.conexao();

	}

	private void initComponents() {
	}// </editor-fold>

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
			java.util.logging.Logger.getLogger(FrmPrincipal.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrmPrincipal.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrmPrincipal.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrmPrincipal.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				FrmPrincipal principal = new FrmPrincipal();

				principal.setVisible(true);
			}
		});
	}
}
