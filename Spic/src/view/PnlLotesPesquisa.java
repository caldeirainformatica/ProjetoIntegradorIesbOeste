
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import controle.ConLote;
import model.Lotes;
import model.ModeloTabela;
import persistencia.ConectaBanco;
import persistencia.DaoLote;
/**
 *
 * @author Fiuza
 */

public class PnlLotesPesquisa extends JPanel {
	   // Variables declaration - do not modify                     
    private javax.swing.JTable JTableLote;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisarLotes;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPesquisaLotes;
    private javax.swing.JFormattedTextField txtFabricacao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtPesquisarLotes;
    private javax.swing.JFormattedTextField txtValidade;
    // End of variables declaration                   

	
	ConLote conlot = new ConLote();
	DaoLote dao = new DaoLote();
	Lotes lote = new Lotes();
	
	
	

    ConectaBanco conecta = new ConectaBanco();
    public PnlLotesPesquisa() {
        
        
        initComponents();
        conecta.conexao();
        preencherTabelaLote("select * from lotes order by idlotes");
        
    }

                         
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblPesquisaLotes = new javax.swing.JLabel();
        txtPesquisarLotes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableLote = new javax.swing.JTable();
        btnPesquisarLotes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtLote = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtValidade = new javax.swing.JFormattedTextField();
        txtFabricacao = new javax.swing.JFormattedTextField();
        btnSalvar.setEnabled(false);
        btnEditar.setEnabled(false);
        
        
        txtId.setEnabled(false);
        txtValidade.setEnabled(false);
        txtLote.setEnabled(false);
        txtFabricacao.setEnabled(false);

        jLabel6.setText("jLabel6");

        jButton2.setText("jButton2");

        lblPesquisaLotes.setText(" Lote:");

        txtPesquisarLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarLotesActionPerformed(evt);
            }
        });

        JTableLote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableLoteMouseClicked(evt);
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel4.setText("Fabricação:");

        txtId.setEditable(false);

        txtLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoteActionPerformed(evt);
            }
        });

        jLabel2.setText("Lote:");

        lblId.setText("id:");

        jLabel5.setText("Validade:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("Cadastro de Lotes");

        btnDeletar.setText("Deletar");
        btnDeletar.setEnabled(false);
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnDeletarActionPerformed(evt);
            }

        });
        

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnSalvarActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Alterar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnEditarActionPerformed(evt);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        try {
            txtValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValidadeActionPerformed(evt);
            }
        });

        try {
            txtFabricacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFabricacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
             
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(331, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLote)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnNovo)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeletar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel7))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblPesquisaLotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisarLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisarLotes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblId)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarLotes)
                    .addComponent(txtPesquisarLotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesquisaLotes))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>                        

    private void txtPesquisarLotesActionPerformed(java.awt.event.ActionEvent evt) {                                                  
      	 lote.setLote(txtPesquisarLotes.getText()); 
      		preencherTabelaLote("select * from lotes where lote like '%" + lote.getLote() + "%' " );
       }                                                 

                                                      

       private void JTableLoteMouseClicked(java.awt.event.MouseEvent evt) {                                        
           int linhaSelecionada = JTableLote.getSelectedRow();
           if (evt.getButton() == MouseEvent.BUTTON1&& evt.getClickCount() == 2) {
   			if (JTableLote.getSelectedRow() > -1) {
   				if (linhaSelecionada == -1) {
   					JOptionPane.showMessageDialog(null,"Não tem nada selecionado");
   				} else {
   					txtId.setText(JTableLote.getValueAt(linhaSelecionada, 0).toString());
   					try{
   						txtLote.setText(JTableLote.getValueAt(linhaSelecionada, 1).toString());
   					}catch(Exception e){
   						txtLote.setText("");
   					}
   					try{
   						txtValidade.setText(JTableLote.getValueAt(linhaSelecionada, 2).toString());
   					}catch(Exception e){
   						txtValidade.setText("");
   						
   					}
   					try{
   						txtFabricacao.setText(JTableLote.getValueAt(linhaSelecionada, 3).toString());
   					}catch(Exception e){
   						txtFabricacao.setText("");	
   					}
   					
   					txtId.setEnabled(true);
   			        txtValidade.setEnabled(true);
   			        txtLote.setEnabled(true);
   			        txtFabricacao.setEnabled(true);
   			        btnDeletar.setEnabled(true);
   						
   				}
   			}
   		}
       }                                       

       private void txtLoteActionPerformed(java.awt.event.ActionEvent evt) {                                        
           // TODO add your handling code here:
       }                                       

       private void txtValidadeActionPerformed(java.awt.event.ActionEvent evt) {                                            
           // TODO add your handling code here:
       }                                           
       
       
       
       private void btnEditarActionPerformed(ActionEvent evt) throws ParseException{
       	btnSalvar.setEnabled(false);
       	conlot.validarIdLote(txtId.getText());
       	conlot.validarLote(txtLote.getText());
       	conlot.validarDataValidade(conlot.formataDataBr(txtValidade.getText()));
       	conlot.validarDataFabricacao(conlot.formataDataBr(txtFabricacao.getText()));
       	dao.alterarLotes(conlot.lot);
       	preencherTabelaLote("select * from lotes order by idlotes");
       
       	
       	
       }
       protected void btnDeletarActionPerformed(ActionEvent evt) {
   		lote.setIdlote(Integer.parseInt(txtId.getText()));
   		dao.deletarLote(lote);
   		preencherTabelaLote("select * from lotes order by idlotes");
   		
   		
   	}

       private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {                                          
          
       	conlot.validarIdLote(txtId.getText());
       	conlot.validarLote(txtLote.getText());
       	conlot.validarDataValidade(txtValidade.getText());
       	conlot.validarDataFabricacao(txtFabricacao.getText());
       	dao.inserirLote(conlot.lot);
       	preencherTabelaLote("select * from lotes order by idlotes");
       	
       
       	
       }                                         
       
       private void btnNovoActionPerformed(ActionEvent evt){
       	
    	
    	txtId.setText(dao.pegarProximoId());
       	txtId.setEnabled(true);
           txtValidade.setEnabled(true);
           txtValidade.setText("");
           txtLote.setEnabled(true);
           txtLote.setText("");
           txtFabricacao.setEnabled(true);
           txtFabricacao.setText("");
           btnEditar.setEnabled(false);
       
       }
               
       private void btnPesquisarLotesActionPerformed(java.awt.event.ActionEvent evt) throws Exception {                                                  
           
   		btnEditar.setEnabled(true);
   		 lote.setLote(txtPesquisarLotes.getText()); 
   		preencherTabelaLote("select * from lotes where lote like '%" + lote.getLote() + "%' " );
      } 

      public void preencherTabelaLote(String sql) {
           
           ArrayList dados =  new ArrayList();
       
           String [] colunas = new String[]{"  ID  ","lote","  Validade  ","  Fabricacao  "};

          conecta.executaSQL(sql);
           try {
               conecta.rs.first();
               do{
                   dados.add(new Object[]{conecta.rs.getInt("idlotes"),conecta.rs.getString("lote"),conecta.rs.getString("dataValidade"),conecta.rs.getString("dataFabricacao")});
                   
               }while(conecta.rs.next());
           } catch (SQLException ex) {
               JOptionPane.showConfirmDialog(null, "Erro ao preencher o ArrayList");
           }
          ModeloTabela modelo = new ModeloTabela(dados, colunas);
          JTableLote.setModel(modelo);
          JTableLote.getColumnModel().getColumn(0).setPreferredWidth(80);
          JTableLote.getColumnModel().getColumn(0).setResizable(false);
          JTableLote.getColumnModel().getColumn(1).setPreferredWidth(160);
          JTableLote.getColumnModel().getColumn(1).setResizable(false);
          JTableLote.getColumnModel().getColumn(2).setPreferredWidth(80);
          JTableLote.getColumnModel().getColumn(2).setResizable(false);
          JTableLote.getColumnModel().getColumn(3).setPreferredWidth(85);
          JTableLote.getColumnModel().getColumn(3).setResizable(false);
          JTableLote.getTableHeader().setReorderingAllowed(false);
          JTableLote.setAutoResizeMode(JTableLote.AUTO_RESIZE_OFF);
          JTableLote.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
          
       } 


}

