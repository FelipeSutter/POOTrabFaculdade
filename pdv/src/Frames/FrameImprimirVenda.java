package Frames;

import Arquivo.PDF;
import Classes.Venda;
import bd.ClientesBD;
import bd.VendaBD;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class FrameImprimirVenda extends javax.swing.JFrame {
    private ArrayList<Venda> Lista = new ArrayList<Venda>();
    private VendaBD bd = new VendaBD();
    private ClientesBD bdc = new ClientesBD();
    private PDF pdf = new PDF();
    
    public FrameImprimirVenda() {
        initComponents();
        Lista = bd.lerBancoVendaDistintos();
        updateRow();
    }
    
    private void updateRow(){
        DefaultTableModel model = (DefaultTableModel) TableVenda.getModel();
        ((DefaultTableModel)TableVenda.getModel()).setNumRows(0);
        Object rowData[] = new Object[3];
        for(int i = 0; i < Lista.size();i++){
            rowData[0] = Lista.get(i).getCodigo();
            if(Lista.get(i).getCliente().equals("-1"))
                rowData[1] = "Cliente não registrado";
            else
                rowData[1] = bdc.buscaNome(Lista.get(i).getCliente());
            rowData[2] = Lista.get(i).getTotal();
            model.addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableVenda = new javax.swing.JTable();
        BuscarField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ImprimirButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cliente", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableVenda);

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

        ImprimirButton.setText("Imprimir");
        ImprimirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirButtonActionPerformed(evt);
            }
        });

        CancelarButton.setText("Voltar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ImprimirButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CancelarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addGap(9, 9, 9)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(427, Short.MAX_VALUE)
                .addComponent(ImprimirButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarButton)
                    .addComponent(BuscarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(94, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarFieldActionPerformed
    }//GEN-LAST:event_BuscarFieldActionPerformed

    private void BuscarFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarFieldKeyPressed
        DefaultTableModel model = (DefaultTableModel) TableVenda.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        TableVenda.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(BuscarField.getText().trim()));
    }//GEN-LAST:event_BuscarFieldKeyPressed

    private void ImprimirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirButtonActionPerformed
        int linha = TableVenda.getSelectedRow();
        String codigo = String.valueOf(TableVenda.getValueAt(linha, 0));
        pdf.gerarPdf(codigo);
    }//GEN-LAST:event_ImprimirButtonActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        dispose();
        FramePrincipal fp = new FramePrincipal();
        fp.setLocationRelativeTo(fp);
        fp.setVisible(true);
    }//GEN-LAST:event_CancelarButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameImprimirVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameImprimirVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameImprimirVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameImprimirVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameImprimirVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarField;
    private javax.swing.JButton CancelarButton;
    private javax.swing.JButton ImprimirButton;
    private javax.swing.JTable TableVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
