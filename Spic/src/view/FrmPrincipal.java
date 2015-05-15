
package view;

import java.awt.Color;

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

/**
 *
 * @author Ricardo Caldeira
 */
public class FrmPrincipal extends javax.swing.JFrame {

	ConectaBanco conecta = new ConectaBanco(); // variavel global de conexão com o banco de dados
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form FrmPrincipal
	 */
	public FrmPrincipal() {
		setTitle("SPIC- Menu Principal");
		setResizable(false);
		setType(Type.UTILITY);
		setBackground(Color.WHITE);
		getContentPane().setBackground(Color.WHITE);
		initComponents();
		
		setLocation(500, 5);
		setSize(200, 100);
		setAlwaysOnTop(true);
		conecta.conexao();

	}

	
	private void initComponents() {

		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		jButton1.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/images/Windows_Tools_Icon_48.png"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				//Pergunta para o usuário se tem mesmo certeza se deseja sair ou nao
				if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Confirmar",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					
					conecta.desconecta();
					System.exit(0);
					
				} else {
				    
				}
			
			}
		});
		button.setIcon(new ImageIcon(FrmPrincipal.class
				.getResource("/images/domesticos_2141_porta.gif")));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jButton1,
										GroupLayout.PREFERRED_SIZE, 61,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(button,
										GroupLayout.PREFERRED_SIZE, 69,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(608, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												Alignment.LEADING)
												.addComponent(
														button,
														Alignment.TRAILING,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(jButton1))
								.addContainerGap(37, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>

	private void jButton1ActionPerformed(ActionEvent evt) {
		FrmCadastroProdutos cadastroProdutos = new FrmCadastroProdutos();
		cadastroProdutos.setVisible(true);
	
		

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
				new FrmPrincipal().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
}
