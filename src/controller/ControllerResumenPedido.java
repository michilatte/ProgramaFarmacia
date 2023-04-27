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

    //para mostrar en label
    private String nombre;
    private int cantidad;
    private String tipo;

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

    public void back() {
        this.vista.dispose();
    }

    public void mensaje() {
        JOptionPane.showMessageDialog(null, "Pedido Enviado");
        this.vista.dispose();
    }

    public void ingresar(String nombre, int cantidad, String tipo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public void mostrarLabel() {

        //vista.getjLabelMedicamento().setText(cantidad+" unidades del "+tipo+" "+nombre);
        
        int num = 0;
        num = Integer.parseInt(vistaregistro.getTxtCantidad().getText());
        String tipo = "";
        tipo = (String) vistaregistro.getCmbxTipoMed().getSelectedItem();
        String nom = "";
        nom = vistaregistro.getTxtNombreMed().getText();
        
        //frmResumenPedido.jLabelMedicamento.setText(num + " unidades del " + tipo + " " + nom);
    }
}
