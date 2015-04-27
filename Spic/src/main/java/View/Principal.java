package View;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Principal extends javax.swing.JFrame {
	public Principal() {
		getContentPane().setLayout(null);
		
		JMenu mnNewMenu = new JMenu("New menu");
		mnNewMenu.setBounds(10, 11, 107, 22);
		getContentPane().add(mnNewMenu);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(mnNewMenu, popupMenu);
		
		JMenuItem mntmCadastro = new JMenuItem("Cadastro");
		popupMenu.add(mntmCadastro);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
		popupMenu.add(mntmProduto);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal principal = new Principal();
		principal.setVisible(true);
		principal.setExtendedState(MAXIMIZED_BOTH);

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
