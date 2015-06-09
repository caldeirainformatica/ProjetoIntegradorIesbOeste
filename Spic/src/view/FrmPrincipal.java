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

import model.Lotes;

import java.awt.SystemColor;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				fechaTela();
			}
		});
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
				chamaCadastroProdutos();
			}

		});
		btnProdutos.setIcon(new ImageIcon(FrmPrincipal.class
				.getResource("/images/Windows_Tools_Icon_48.png")));
		btnProdutos.setBounds(10, 11, 62, 53);
		pnlBotoes.add(btnProdutos);

		JButton btnVendas = new JButton("");
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					chamaVendas();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		btnVendas.setIcon(new ImageIcon(FrmPrincipal.class
				.getResource("/images/Dollar.png")));
		btnVendas.setBounds(85, 11, 62, 53);
		pnlBotoes.add(btnVendas);

		JButton btnSair = new JButton("");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				fechaTela();
			}

		});
		btnSair.setIcon(new ImageIcon(FrmPrincipal.class
				.getResource("/images/domesticos_2141_porta.gif")));
		btnSair.setBounds(157, 11, 62, 53);
		pnlBotoes.add(btnSair);

		JButton btnLotes = new JButton("New button");
		btnLotes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				FrmLoteComMenu l = new FrmLoteComMenu();
				l.setVisible(true);
				l.setResizable(false);

			}
		});
		btnLotes.setIcon(new ImageIcon(FrmPrincipal.class
				.getResource("/images/th.jpg")));
		btnLotes.setBounds(229, 11, 89, 53);
		pnlBotoes.add(btnLotes);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);

		JMenuItem mnProdutos = new JMenuItem("Produtos");
		mnProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chamaCadastroProdutos();
			}
		});
		mnCadastro.add(mnProdutos);

		JMenu mnMovimentos = new JMenu("Movimentos");
		menuBar.add(mnMovimentos);

		JMenuItem mnVendas = new JMenuItem("Vendas");
		mnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					chamaVendas();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mnMovimentos.add(mnVendas);

		JMenu mnMenu = new JMenu("Menu");
		mnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		menuBar.add(mnMenu);

		JMenuItem mnSair = new JMenuItem("Sair");
		mnMenu.add(mnSair);
		initComponents();

		Container container = getContentPane();

		JPanel panel = new JPanel();
		panel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 73, 1350, 636);
		getContentPane().add(panel);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FrmPrincipal.class
				.getResource("/images/Logo Spic.jpg")));
		panel.add(label);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(tela.width, tela.height);

		conecta.conexao();

	}

	private void chamaCadastroProdutos() {
		FrmCadastroProdutos cadastroProdutos = new FrmCadastroProdutos();
		cadastroProdutos.setResizable(false);
		cadastroProdutos.setVisible(true);
	}

	private void chamaVendas() throws Exception {
		try {
			FrmVendas vendas = new FrmVendas();
			vendas.setVisible(true);
			vendas.setResizable(false);
			vendas.setExtendedState(MAXIMIZED_BOTH);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void fechaTela() {
		// Pergunta para o usuário se tem mesmo certeza se deseja sair
		// ou nao
		if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?",
				"Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

			conecta.desconecta();
			System.exit(0);

		} else {

		}
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
