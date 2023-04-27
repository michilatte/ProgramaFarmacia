/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Pedido;

/**
 *
 * @author USUARIO
 */
public class frmPedido extends javax.swing.JFrame {

   
    public frmPedido() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("FARMACIA");
    }

    public JButton getjButtonLimpiar() {
        return jButtonLimpiar;
    }

    public void setjButtonLimpiar(JButton jButtonLimpiar) {
        this.jButtonLimpiar = jButtonLimpiar;
    }

    public JButton getBtnGUARDAR() {
        return btnGUARDAR;
    }

    public void setBtnGUARDAR(JButton btnGUARDAR) {
        this.btnGUARDAR = btnGUARDAR;
    }

    public ButtonGroup getButtonGroupDistribuidores() {
        return buttonGroupDistribuidores;
    }

    public void setButtonGroupDistribuidores(ButtonGroup buttonGroupDistribuidores) {
        this.buttonGroupDistribuidores = buttonGroupDistribuidores;
    }

    public JCheckBox getCheckPrincipal() {
        return checkPrincipal;
    }

    public void setCheckPrincipal(JCheckBox checkPrincipal) {
        this.checkPrincipal = checkPrincipal;
    }

    public JCheckBox getCheckSecundaria() {
        return checkSecundaria;
    }

    public void setCheckSecundaria(JCheckBox checkSecundaria) {
        this.checkSecundaria = checkSecundaria;
    }

    public JComboBox<String> getCmbxTipoMed() {
        return cmbxTipoMed;
    }

    public void setCmbxTipoMed(JComboBox<String> cmbxTipoMed) {
        this.cmbxTipoMed = cmbxTipoMed;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getLbltitulo() {
        return lbltitulo;
    }

    public void setLbltitulo(JLabel lbltitulo) {
        this.lbltitulo = lbltitulo;
    }

    public JPanel getPanelPedidos() {
        return panelPedidos;
    }

    public void setPanelPedidos(JPanel panelPedidos) {
        this.panelPedidos = panelPedidos;
    }

    public JRadioButton getRbtn1() {
        return rbtn1;
    }

    public void setRbtn1(JRadioButton rbtn1) {
        this.rbtn1 = rbtn1;
    }

    public JRadioButton getRbtn2() {
        return rbtn2;
    }

    public void setRbtn2(JRadioButton rbtn2) {
        this.rbtn2 = rbtn2;
    }

    public JRadioButton getRbtn3() {
        return rbtn3;
    }

    public void setRbtn3(JRadioButton rbtn3) {
        this.rbtn3 = rbtn3;
    }

    public JTextField getTxtCantidad() {
        return txtCantidad;
    }

    public void setTxtCantidad(JTextField txtCantidad) {
        this.txtCantidad = txtCantidad;
    }

    public JTextField getTxtNombreMed() {
        return txtNombreMed;
    }

    public void setTxtNombreMed(JTextField txtNombreMed) {
        this.txtNombreMed = txtNombreMed;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getjTablePedidos() {
        return jTablePedidos;
    }

    public void setjTablePedidos(JTable jTablePedidos) {
        this.jTablePedidos = jTablePedidos;
    }

    public JLabel getjLabelSumaCantidad() {
        return jLabelSumaCantidad;
    }

    public void setjLabelSumaCantidad(JLabel jLabelSumaCantidad) {
        this.jLabelSumaCantidad = jLabelSumaCantidad;
    }
    
    
    
    
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
        checkSecundaria = new javax.swing.JCheckBox();
        checkPrincipal = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jButtonLimpiar = new javax.swing.JButton();
        lbltitulo1 = new javax.swing.JLabel();
        jLabelSumaCantidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPedidos.setBackground(new java.awt.Color(155, 167, 161));
        panelPedidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPedidos.setToolTipText("");
        panelPedidos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lbltitulo.setText("Lista de Pedidos");
        panelPedidos.add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 220, -1));

        btnGUARDAR.setBackground(new java.awt.Color(171, 187, 176));
        btnGUARDAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGUARDAR.setText("OK");
        btnGUARDAR.setToolTipText("Presione para guardar");
        btnGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUARDARActionPerformed(evt);
            }
        });
        panelPedidos.add(btnGUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 70, 30));

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
        cmbxTipoMed.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
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

        checkSecundaria.setBackground(new java.awt.Color(171, 187, 176));
        checkSecundaria.setText("Secundaria");
        checkSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSecundariaActionPerformed(evt);
            }
        });
        panelPedidos.add(checkSecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        checkPrincipal.setBackground(new java.awt.Color(171, 187, 176));
        checkPrincipal.setText("Principal");
        panelPedidos.add(checkPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        jTablePedidos.setBackground(new java.awt.Color(171, 187, 176));
        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del Medicamento", "Tipo de Medicamento", "Cantidad", "Distribuidor", "Sucursal"
            }
        ));
        jScrollPane1.setViewportView(jTablePedidos);

        panelPedidos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 770, 160));

        jButtonLimpiar.setBackground(new java.awt.Color(171, 187, 176));
        jButtonLimpiar.setText("Limpiar");
        panelPedidos.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, 30));

        lbltitulo1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lbltitulo1.setText("FARMACIA || PEDIDOS");
        panelPedidos.add(lbltitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 220, -1));
        panelPedidos.add(jLabelSumaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUARDARActionPerformed

        
    }//GEN-LAST:event_btnGUARDARActionPerformed

    
    private void rbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn1ActionPerformed

    private void checkSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSecundariaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGUARDAR;
    private javax.swing.ButtonGroup buttonGroupDistribuidores;
    private javax.swing.JCheckBox checkPrincipal;
    private javax.swing.JCheckBox checkSecundaria;
    private javax.swing.JComboBox<String> cmbxTipoMed;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelSumaCantidad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePedidos;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lbltitulo1;
    private javax.swing.JPanel panelPedidos;
    private javax.swing.JRadioButton rbtn1;
    private javax.swing.JRadioButton rbtn2;
    private javax.swing.JRadioButton rbtn3;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombreMed;
    // End of variables declaration//GEN-END:variables
}
