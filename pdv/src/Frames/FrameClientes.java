package Frames;

import Adicionar.AdicionarCliente;
import Classes.Cliente;
import bd.ClientesBD;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class FrameClientes extends javax.swing.JFrame {
    private ArrayList<Cliente> Lista = new ArrayList<Cliente>();
    private ClientesBD bd = new ClientesBD();

    public FrameClientes() {
        initComponents();
        Lista = bd.lerBancoClientes();
        updateRow();
    }
    
    private void updateRow(){
        DefaultTableModel model = (DefaultTableModel) TableClientes.getModel();
        ((DefaultTableModel)TableClientes.getModel()).setNumRows(0);
        Object rowData[] = new Object[7];
        for(int i = 0; i < Lista.size();i++){
            rowData[0] = Lista.get(i).getCodigo();
            rowData[1] = Lista.get(i).getNome();
            rowData[2] = Lista.get(i).getTelefone();
            rowData[3] = Lista.get(i).getEmail();
            rowData[4] = Lista.get(i).getRua();
            rowData[5] = Lista.get(i).getCasa();
            rowData[6] = Lista.get(i).getComplemento();
            model.addRow(rowData);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableClientes = new javax.swing.JTable();
        AdicionaButton = new javax.swing.JButton();
        AlterarButton = new javax.swing.JButton();
        ExcluirButton = new javax.swing.JButton();
        BuscarField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Telefone", "Email", "Rua", "Casa", "Complemento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableClientes);
        if (TableClientes.getColumnModel().getColumnCount() > 0) {
            TableClientes.getColumnModel().getColumn(0).setResizable(false);
        }

        AdicionaButton.setText("Adicionar");
        AdicionaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionaButtonActionPerformed(evt);
            }
        });

        AlterarButton.setText("Alterar");
        AlterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarButtonActionPerformed(evt);
            }
        });

        ExcluirButton.setText("Excluir");
        ExcluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirButtonActionPerformed(evt);
            }
        });

        BuscarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarFieldActionPerformed(evt);
            }
        });
        BuscarField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BuscarFieldKeyPressed(evt);
            }
        });

        jLabel1.setText("Buscar:");

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AlterarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AdicionaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExcluirButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarField, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(AdicionaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AlterarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExcluirButton)
                            .addComponent(jLabel1)
                            .addComponent(BuscarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdicionaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionaButtonActionPerformed
        new AdicionarCliente(this,true).setVisible(true);
        Lista = bd.lerBancoClientes();
        updateRow();
    }//GEN-LAST:event_AdicionaButtonActionPerformed

    private void AlterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarButtonActionPerformed
        new AdicionarCliente(this,true,Lista.get(TableClientes.getSelectedRow())).setVisible(true);
        Lista = bd.lerBancoClientes();
        updateRow();
    }//GEN-LAST:event_AlterarButtonActionPerformed
    
    public static int FrameConfirmacao(String acao){
        return JOptionPane.showConfirmDialog(null,acao,"Confirmação",JOptionPane.YES_NO_OPTION);
    }
    
    private void ExcluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirButtonActionPerformed
        switch(FrameConfirmacao("Confirma a exclusão?")){
            case 0:
                int linha = TableClientes.getSelectedRow();
                String codigo = String.valueOf(TableClientes.getValueAt(linha, 0));
                DefaultTableModel model = (DefaultTableModel)TableClientes.getModel();

                bd.excluirCliente(codigo);
                Lista = bd.lerBancoClientes();
                break;
            case 1:
                break;
        }
        updateRow();
    }//GEN-LAST:event_ExcluirButtonActionPerformed

    private void BuscarFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarFieldActionPerformed

    private void BuscarFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarFieldKeyPressed
        DefaultTableModel model = (DefaultTableModel) TableClientes.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        TableClientes.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(BuscarField.getText().trim()));
    }//GEN-LAST:event_BuscarFieldKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        FramePrincipal fp = new FramePrincipal();
        fp.setLocationRelativeTo(fp);
        fp.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionaButton;
    private javax.swing.JButton AlterarButton;
    private javax.swing.JTextField BuscarField;
    private javax.swing.JButton ExcluirButton;
    private javax.swing.JTable TableClientes;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
