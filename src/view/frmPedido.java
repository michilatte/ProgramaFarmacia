/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import model.Pedido;

/**
 *
 * @author USUARIO
 */
public class frmPedido extends javax.swing.JFrame {

   
    public frmPedido() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    

    ArrayList<Pedido> pedido = new ArrayList<>();
    String nombre_med;
    String tipo_med;
    int cantidad;
    String distribuidor;
    String sucursal;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupDistribuidores = new javax.swing.ButtonGroup();
        panelPedidos = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        btnGUARDAR = new javax.swing.JButton();
        rbtn1 = new javax.swing.JRadioButton();
        rbtn3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        cmbxTipoMed = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNombreMed = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rbtn2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cbxSecundaria = new javax.swing.JCheckBox();
        cbxPrincipal = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPedidos.setBackground(new java.awt.Color(155, 167, 161));
        panelPedidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPedidos.setToolTipText("");
        panelPedidos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lbltitulo.setText("FARMACIA || PEDIDOS");
        panelPedidos.add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 220, -1));

        btnGUARDAR.setBackground(new java.awt.Color(171, 187, 176));
        btnGUARDAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGUARDAR.setText("OK");
        btnGUARDAR.setToolTipText("Presione para guardar");
        btnGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUARDARActionPerformed(evt);
            }
        });
        panelPedidos.add(btnGUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 70, 40));

        rbtn1.setBackground(new java.awt.Color(171, 187, 176));
        buttonGroupDistribuidores.add(rbtn1);
        rbtn1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbtn1.setText("COFARMA");
        rbtn1.setToolTipText("Seleccione");
        rbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn1ActionPerformed(evt);
            }
        });
        panelPedidos.add(rbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        rbtn3.setBackground(new java.awt.Color(171, 187, 176));
        buttonGroupDistribuidores.add(rbtn3);
        rbtn3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbtn3.setText("CEMEFAR");
        rbtn3.setToolTipText("Seleccione");
        panelPedidos.add(rbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, -1));

        jLabel1.setText("Sucursal:");
        panelPedidos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, 20));

        jLabel2.setText("Distribuidor Farmaceutico:");
        panelPedidos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, 30));

        txtCantidad.setBackground(new java.awt.Color(171, 187, 176));
        panelPedidos.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 160, -1));

        cmbxTipoMed.setBackground(new java.awt.Color(171, 187, 176));
        cmbxTipoMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Seleccione>>", "Analgésico", "Analéptico", "Anestésico", "Antiácido", "Antidepresivo ", "Antibióticos" }));
        panelPedidos.add(cmbxTipoMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 160, -1));

        jLabel3.setText("Tipo de Medicamento:");
        panelPedidos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 30));

        txtNombreMed.setBackground(new java.awt.Color(171, 187, 176));
        panelPedidos.add(txtNombreMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 160, -1));

        jLabel4.setText("Nombre del Medicamento:");
        panelPedidos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 96, -1, 30));

        rbtn2.setBackground(new java.awt.Color(171, 187, 176));
        buttonGroupDistribuidores.add(rbtn2);
        rbtn2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbtn2.setText("EMPSEPHAR ");
        rbtn2.setToolTipText("Seleccione");
        panelPedidos.add(rbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));

        jLabel5.setText("Cantidad:");
        panelPedidos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 20));

        cbxSecundaria.setBackground(new java.awt.Color(171, 187, 176));
        cbxSecundaria.setText("Secundaria");
        cbxSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSecundariaActionPerformed(evt);
            }
        });
        panelPedidos.add(cbxSecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        cbxPrincipal.setBackground(new java.awt.Color(171, 187, 176));
        cbxPrincipal.setText("Principal");
        panelPedidos.add(cbxPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPedidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUARDARActionPerformed

        nombre_med = this.txtNombreMed.getText();
        tipo_med = (String)this.cmbxTipoMed.getSelectedItem();
        cantidad = Integer.parseInt(this.txtCantidad.getText());

        distribuidor = "";
        if (this.rbtn1.isSelected()) {
            distribuidor = "COFARMA";
        } else if (this.rbtn2.isSelected()) {
            distribuidor = "EMPSEPHAR ";
        }else if (this.rbtn3.isSelected()) {
            distribuidor = "CEMEFAR ";
        }
        Pedido p = new Pedido(nombre_med, tipo_med, cantidad, distribuidor, sucursal);
        pedido.add(p);
        Limpiar();
    }//GEN-LAST:event_btnGUARDARActionPerformed

    public void Limpiar() {
        txtNombreMed.setText("");
        txtCantidad.setText("");
        cmbxTipoMed.setSelectedIndex(0);
        buttonGroupDistribuidores.clearSelection();
        cbxPrincipal.setSelected(false);
        cbxSecundaria.setSelected(false);
    }
    
    private void rbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn1ActionPerformed

    private void cbxSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSecundariaActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(frmPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGUARDAR;
    private javax.swing.ButtonGroup buttonGroupDistribuidores;
    private javax.swing.JCheckBox cbxPrincipal;
    private javax.swing.JCheckBox cbxSecundaria;
    private javax.swing.JComboBox<String> cmbxTipoMed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JPanel panelPedidos;
    private javax.swing.JRadioButton rbtn1;
    private javax.swing.JRadioButton rbtn2;
    private javax.swing.JRadioButton rbtn3;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombreMed;
    // End of variables declaration//GEN-END:variables
}
