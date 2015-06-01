
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import model.ModeloTabela;
import persistencia.ConectaBanco;
import persistencia.DaoLote;
import controle.ConLote;
import model.Lotes;
/**
 *
 * @author Fiuza
 */

public class PnlLotesPesquisa extends JPanel {
	
    // Variables declaration - do not modify                     
    private javax.swing.JTable JTableLote;
    private JButton btnDeletar;
    private JButton btnNovo;
    private JButton btnPesquisarLotes;
    private JButton btnSalvar;
    private JButton btnEditar;
    private JButton jButton2;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JTextField txtId;
    private JLabel lblFabricacao;
    private JLabel lblId;
    private JLabel lblLote;
    private JLabel lblPesquisaLotes;
    private JLabel lblValidade;
    private JTextField txtFabricacao;
    private JTextField txtLote;
    private JTextField txtPesquisarLotes;
    private JTextField txtValidade;
    // End of variables declaration       
    
    
    
	Lotes lote = new Lotes();
	ConLote conlot = new ConLote();
    ConectaBanco conecta = new ConectaBanco();
    DaoLote dao = new DaoLote();
    public PnlLotesPesquisa() {
        
        
        initComponents();
        conecta.conexao();
        preencherTabelaLote("select * from lotes order by idlotes");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel6 = new JLabel();
        jButton2 = new JButton();
        lblPesquisaLotes = new JLabel();
        txtPesquisarLotes = new JTextField();
        jScrollPane1 = new JScrollPane();
        JTableLote = new JTable();
        btnPesquisarLotes = new JButton();
        lblFabricacao = new JLabel();
        txtId = new JTextField();
        txtValidade = new JTextField();
        txtLote = new JTextField();
        txtFabricacao = new JTextField();
        lblLote = new JLabel();
        lblId = new JLabel();
        lblValidade = new JLabel();
        jSeparator1 = new JSeparator();
        jLabel7 = new JLabel();
        btnDeletar = new JButton();
        btnSalvar = new JButton();
        btnNovo = new JButton();
        btnEditar = new JButton();
        
        
        
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

        lblFabricacao.setText("Fabricação:");

        txtId.setEditable(false);

        txtValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValidadeActionPerformed(evt);
            }
        });

        txtLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoteActionPerformed(evt);
            }
        });

        lblLote.setText("Lote:");

        lblId.setText("id:");

        lblValidade.setText("Validade:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("Cadastro de Lotes");

        btnDeletar.setText("Deletar");
        btnDeletar.setEnabled(false);
        btnDeletar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				btnDeletarActionPerformed(evt);
				
			}
		});
        

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnSalvarActionPerformed(evt);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erro ao inserir registro!!");
					e.printStackTrace();
				}
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				btnNovoActionPerformed(evt);
				
			}
		});
        
        btnEditar.setText("Alterar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                	btnEditarActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFabricacao)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblLote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblValidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFabricacao)
                                    .addComponent(txtValidade)
                                    .addComponent(txtLote)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalvar)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeletar)))        
                        .addGap(164, 164, 164))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFabricacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo))
                    .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
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
    	
    	txtId.setEnabled(true);
    	txtId.setText("");
        txtValidade.setEnabled(true);
        txtValidade.setText("");
        txtLote.setEnabled(true);
        txtLote.setText("");
        txtFabricacao.setEnabled(true);
        txtFabricacao.setText("");
    
    }
            
    private void btnPesquisarLotesActionPerformed(java.awt.event.ActionEvent evt) throws Exception {                                                  
        
		
		 lote.setLote(txtPesquisarLotes.getText()); 
		preencherTabelaLote("select * from lotes where lote like '%" + lote.getLote() + "%' " );
   } 

   public void preencherTabelaLote(String sql) {
        
        ArrayList dados =  new ArrayList();
    
        String [] colunas = new String[]{"idlotes","lote","dataValidade","dataFabricacao"};

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

