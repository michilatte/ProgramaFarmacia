/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Pedido;
import view.frmPedido;
import view.frmResumenPedido;

/**
 *
 * @author jonny
 */
public class ControllerResumenPedido {
    
    ControllerRegistro registro = new ControllerRegistro();
    frmResumenPedido vista = new frmResumenPedido();
    frmPedido vistaregistro = new frmPedido();

    public ControllerResumenPedido(frmResumenPedido vista) {
        this.vista = vista;
        controleventos();
    }

    public void controleventos() {

        this.vista.getBtnEnviar().addActionListener(l -> mensaje());
        this.vista.getBtnCancelar().addActionListener(l -> back());
    }
    
    public void back(){
        vistaregistro.setVisible(true);
        new ControllerRegistro(vistaregistro);
        vistaregistro.setLocationRelativeTo(null);
    }
    public void mensaje(){
        JOptionPane.showMessageDialog(null, "Pedido Enviado");
    }
    
}
