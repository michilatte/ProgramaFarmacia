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
        //mostrarLabel();
    }

    public void controleventos() {

        this.vista.getBtnEnviar().addActionListener(l -> mensaje());
        this.vista.getBtnCancelar().addActionListener(l -> back());
    }

    public void back() {
        this.vista.dispose();
    }

    public void mensaje() {
        JOptionPane.showMessageDialog(null, "Pedido Enviado");

    }

    /*public void mostrarLabel() {
        try {
                 int num = 0; num = Integer.parseInt(vistaregistro.getTxtCantidad().getText());
                 String tipo = ""; tipo = (String) vistaregistro.getCmbxTipoMed().getSelectedItem();
                 String nom = ""; nom = vistaregistro.getTxtNombreMed().getText();
                 frmResumenPedido.jLabelMedicamento.setText(num + " unidades del " + tipo + " " + nom);
                
        }catch(Exception ex){
            
        }
    }*/
}
