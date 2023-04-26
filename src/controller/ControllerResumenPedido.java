/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
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
    
    ControllerRegistro registro;
    frmResumenPedido vista = new frmResumenPedido();
    frmPedido vistaregistro = new frmPedido();

    public ControllerResumenPedido(frmResumenPedido vista) {
        this.vista = vista;
        controleventos();
    }

    public void controleventos() {

        this.vista.getBtnEnviar().addActionListener(l -> tablalistar());
        this.vista.getBtnCancelar().addActionListener(l -> vistaregistro());
    }

    public void tablalistar() {
        DefaultTableModel modeloDefault = new DefaultTableModel(new String[]{"Nombre del Medicamento", "Tipo de Medicamento", "Cantidad", "Distribuidor", "Sucursal"}, registro.listapedidos.size());
        vista.getjTablePedidos().setModel(modeloDefault);

        TableModel modeloDatos = vista.getjTablePedidos().getModel();
        for (int i = 0; i < registro.listapedidos.size(); i++) {
            Pedido pedido = registro.listapedidos.get(i);
            modeloDatos.setValueAt(pedido.getNombre_med(), i, 0);
            modeloDatos.setValueAt(pedido.getTipo_med(), i, 1);
            modeloDatos.setValueAt(pedido.getCantidad(), i, 2);
            modeloDatos.setValueAt(pedido.getDistribuidor(), i, 3);
            modeloDatos.setValueAt(pedido.getSucursal(), i, 4);

        }
    }
     
    public void vistaregistro() {
        
        vista.setVisible(false);
        vistaregistro.setVisible(true);

    }

    
}
