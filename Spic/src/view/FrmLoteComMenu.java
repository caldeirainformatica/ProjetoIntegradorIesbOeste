
package view;

import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

/**
 *
 * @author Fiuza
 */
public class FrmLoteComMenu extends javax.swing.JFrame {

    private JTabbedPane jTabbedPane2;
    private view.PnlLotes pnlLotes2;
    private view.PnlLotesPesquisa pnlLotesPesquisa1;
                 
    public FrmLoteComMenu() {
        initComponents();
    }

    

                          
    private void initComponents() {

        jTabbedPane2 = new JTabbedPane();
        pnlLotes2 = new PnlLotes();
        pnlLotesPesquisa1 = new PnlLotesPesquisa();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new CardLayout());

        jTabbedPane2.addTab("tab1", pnlLotes2);
        jTabbedPane2.addTab("tab2", pnlLotesPesquisa1);

        getContentPane().add(jTabbedPane2, "card2");

        pack();
    }                       

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                	UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLoteComMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLoteComMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLoteComMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLoteComMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLoteComMenu().setVisible(true);
                
            }
        });
    }

                    

}
