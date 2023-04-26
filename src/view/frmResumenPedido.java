/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author USUARIO
 */
public class frmResumenPedido extends javax.swing.JFrame {

    
    public frmResumenPedido() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public static JLabel getjLabelDireccion() {
        return jLabelDireccion;
    }

    public static void setjLabelDireccion(JLabel jLabelDireccion) {
        frmResumenPedido.jLabelDireccion = jLabelDireccion;
    }

    public static JLabel getjLabelMedicamento() {
        return jLabelMedicamento;
    }

    public static void setjLabelMedicamento(JLabel jLabelMedicamento) {
        frmResumenPedido.jLabelMedicamento = jLabelMedicamento;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnEnviar() {
        return btnEnviar;
    }

    public void setBtnEnviar(JButton btnEnviar) {
        this.btnEnviar = btnEnviar;
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
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPedidos = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelMedicamento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPedidos.setBackground(new java.awt.Color(155, 167, 161));
        panelPedidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPedidos.setToolTipText("");
        panelPedidos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lbltitulo.setText("RESUMEN DEL PEDIDO");
        panelPedidos.add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 220, -1));

        btnEnviar.setBackground(new java.awt.Color(171, 187, 176));
        btnEnviar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.setToolTipText("");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        panelPedidos.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 70, 30));

        btnCancelar.setBackground(new java.awt.Color(171, 187, 176));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelPedidos.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 90, 30));

        jLabelDireccion.setText("b:");
        panelPedidos.add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 390, 30));

        jLabelMedicamento.setText("a:");
        panelPedidos.add(jLabelMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 390, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    public static javax.swing.JLabel jLabelDireccion;
    public static javax.swing.JLabel jLabelMedicamento;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JPanel panelPedidos;
    // End of variables declaration//GEN-END:variables
}
