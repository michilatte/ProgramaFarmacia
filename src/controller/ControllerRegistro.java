/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Pedido;
import view.*;

/**
 *
 * @author jonny
 */
public class ControllerRegistro {

    
    ArrayList<Pedido> listapedidos = new ArrayList<>();
    private frmPedido vista = new frmPedido();
    frmResumenPedido vistapedido = new frmResumenPedido();

    public ControllerRegistro(frmPedido vista) {
        this.vista = vista;
        vista.setVisible(true);
        controleventos();
    }

    public void controleventos() {

        this.vista.getBtnGUARDAR().addActionListener(l -> guardarPedido());

    }

    public void guardarPedido() {

        Pedido pedido = new Pedido();
        pedido.setNombre_med(this.vista.getTxtNombreMed().getText());
        pedido.setTipo_med((String) this.vista.getCmbxTipoMed().getSelectedItem());
        int cantidad = Integer.parseInt(this.vista.getTxtCantidad().getText());
        pedido.setCantidad(cantidad);

        String distribuidor = "";
        if (this.vista.getRbtn1().isSelected()) {
            distribuidor = "COFARMA";
        }
        if (this.vista.getRbtn2().isSelected()) {
            distribuidor = "EMPSEPHAR";
        }
        if (this.vista.getRbtn3().isSelected()) {
            distribuidor = "CEMEFAR";
        }
        pedido.setDistribuidor(distribuidor);
        pedido.setSucursal(Principal() + " " + Secundaria());

        listapedidos.add(pedido);
        vervista();

    }

    public void vervista() {

        vistapedido.setVisible(true);
        new ControllerResumenPedido(vistapedido);
        vistapedido.setLocationRelativeTo(null);

    }

    public void Limpiar() {
        vista.getTxtNombreMed().setText("");
        vista.getTxtCantidad().setText("");
        vista.getCmbxTipoMed().setSelectedIndex(0);
        vista.getButtonGroupDistribuidores().clearSelection();
        vista.getCheckPrincipal().setSelected(false);
        vista.getCheckSecundaria().setSelected(false);
    }

    public String Principal() {
        if (vista.getCheckPrincipal().isSelected()) {
            return "Principal";
        } else {
            return "";
        }

    }

    public String Secundaria() {
        if (vista.getCheckSecundaria().isSelected()) {
            return "Secundaria";
        } else {
            return "";
        }

    }

}
