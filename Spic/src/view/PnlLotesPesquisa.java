
package view;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import model.Lotes;
import model.ModeloTabela;
import persistencia.ConectaBanco;
import persistencia.DaoLote;
/**
 *
 * @author Fiuza
 */

public class PnlLotesPesquisa extends JPanel {
	Lotes lote = new Lotes();
	DaoLote dao = new DaoLote();
    ConectaBanco conecta = new ConectaBanco();
   
    public PnlLotesPesquisa() {
        
        
        initComponents();
        conecta.conexao();
        preencherTabelaLote("select * from lotes order by idlotes");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPesquisarLotes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableLote = new javax.swing.JTable();
        btnPesquisarLotes = new javax.swing.JButton();

        jLabel1.setText(" Lote:");

        txtPesquisarLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarLotesActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(JTableLote);

        btnPesquisarLotes.setText("Pesquisar");
        btnPesquisarLotes.setToolTipText("Clique para pesquisar lotes");
        btnPesquisarLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnPesquisarLotesActionPerformed(evt);
				} catch (Exception e) {
				
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarLotes)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisarLotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarLotes))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void txtPesquisarLotesActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void btnPesquisarLotesActionPerformed(java.awt.event.ActionEvent evt) throws Exception {                                                  
    
		
		 lote.setLote(txtPesquisarLotes.getText()); 
		preencherTabelaLote("select * from lotes where lote like '%" + lote.getLote() + "%' " );
    }                                                 
    
    // Variables declaration - do not modify                     
    private javax.swing.JTable JTableLote;
    private javax.swing.JButton btnPesquisarLotes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPesquisarLotes;
    // End of variables declaration                   


    public void preencherTabelaLote(String sql) {
        
        ArrayList dados =  new ArrayList();
    
        String [] colunas = new String[]{"id","Lote","Validade","Fabricacao"};

       conecta.executaSQL(sql);
        try {
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("idlotes"),conecta.rs.getString("lote"),conecta.rs.getDate("dataValidade"),conecta.rs.getDate("dataFabricacao")});
                
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Erro ao preencher o ArrayList");
        }
       ModeloTabela modelo = new ModeloTabela(dados, colunas);
       JTableLote.setModel(modelo);
       JTableLote.getColumnModel().getColumn(0).setPreferredWidth(80);
       JTableLote.getColumnModel().getColumn(0).setResizable(false);
       JTableLote.getColumnModel().getColumn(1).setPreferredWidth(180);
       JTableLote.getColumnModel().getColumn(1).setResizable(false);
       JTableLote.getColumnModel().getColumn(2).setPreferredWidth(80);
       JTableLote.getColumnModel().getColumn(2).setResizable(false);
       JTableLote.getColumnModel().getColumn(3).setPreferredWidth(80);
       JTableLote.getColumnModel().getColumn(3).setResizable(false);
       JTableLote.getTableHeader().setReorderingAllowed(false);
       JTableLote.setAutoResizeMode(JTableLote.AUTO_RESIZE_ALL_COLUMNS);
       JTableLote.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
    }




}

