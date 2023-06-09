/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Pedido;
import model.Validaciones;
import view.*;

/**
 *
 * @author jonny
 */
public class ControllerRegistro {

    Pedido pedido = new Pedido();
    ArrayList<Pedido> listapedidos = new ArrayList<>();
    frmPedido vista = new frmPedido();
    frmResumenPedido vistapedido = new frmResumenPedido();
    String distribuidor = "";

    public ControllerRegistro() {
    }

    public ControllerRegistro(frmPedido vista) {
        this.vista = vista;
        vista.setVisible(true);
        controleventos();
    }

    public void controleventos() {

        this.vista.getBtnGUARDAR().addActionListener(l -> guardarPedido());
        this.vista.getjButtonLimpiar().addActionListener(l -> Limpiar());
    }

    public void guardarPedido() {

        if (validaciones() == true) {
            pedido.setNombre_med(this.vista.getTxtNombreMed().getText());
            pedido.setTipo_med((String) this.vista.getCmbxTipoMed().getSelectedItem());
            int cantidad = Integer.parseInt(this.vista.getTxtCantidad().getText());
            pedido.setCantidad(cantidad);

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

            try {
                Pedido pedido = new Pedido(this.pedido.getNombre_med(), this.pedido.getTipo_med(), this.pedido.getCantidad(), this.pedido.getDistribuidor(), this.pedido.getSucursal());
                listapedidos.add(pedido);
                tablalistar();

                contar();
                //listar();
            } catch (Exception ex) {
                ex.getMessage();
            }
            vervista();
        }

    }

    public void tablalistar() {
        DefaultTableModel modeloDefault = new DefaultTableModel(new String[]{"Nombre del Medicamento", "Tipo de Medicamento", "Cantidad", "Distribuidor", "Sucursal"}, listapedidos.size());
        vista.getjTablePedidos().setModel(modeloDefault);

        TableModel modeloDatos = vista.getjTablePedidos().getModel();
        for (int i = 0; i < listapedidos.size(); i++) {
            Pedido pedido = listapedidos.get(i);
            modeloDatos.setValueAt(pedido.getNombre_med(), i, 0);
            modeloDatos.setValueAt(pedido.getTipo_med(), i, 1);
            modeloDatos.setValueAt(pedido.getCantidad(), i, 2);
            modeloDatos.setValueAt(pedido.getDistribuidor(), i, 3);
            modeloDatos.setValueAt(pedido.getSucursal(), i, 4);

        }
    }

    public void vervista() {

        vistapedido.setVisible(true);
        new ControllerResumenPedido(vistapedido);
        vistapedido.setLocationRelativeTo(null);
        vistapedido.setTitle("Pedido al Distribuidor " + distribuidor);
        mostrarLabel1();
    }

    public void listar() {

        System.out.println("LISTA PEDIDOS");
        System.out.printf("%-30S%-30S%-30S%-30S%-30S%n", "Nombre del Medicamento", "Tipo de Medicamento", "Cantidad", "Distribuidor", "Sucursal");
        for (int i = 0; i < listapedidos.size(); i++) {
            listapedidos.get(i).mostrarDatos();
        }
    }

    public void contar() {

        int suma;

        for (int i = 0; i < listapedidos.size(); i++) {
            suma = listapedidos.get(i).getCantidad();

            String numero = Integer.toString(suma);

        }

    }

    public void mostrarLabel1() {
        //10 unidades del antibiótico amoxicilina. 

        int num = 0;
        num = Integer.parseInt(vista.getTxtCantidad().getText());

        String tipo = "";
        tipo = (String) vista.getCmbxTipoMed().getSelectedItem();

        String nom = vista.getTxtNombreMed().getText();

        vistapedido.getjLabelMedicamento().setText(num + " unidades del " + tipo + " " + nom);

        if (vista.getCheckPrincipal().isSelected() && vista.getCheckSecundaria().isSelected()) {
            vistapedido.getjLabelDireccion().setText("Para la farmacia situada en Calle de la Rosa n. 28 \n"
                    + " y para la situada en Calle Alcazabilla n. 3");
        } else if (vista.getCheckPrincipal().isSelected()) {
            vistapedido.getjLabelDireccion().setText("Para la farmacia situada en Calle de la Rosa n. 28");
        } else if (vista.getCheckSecundaria().isSelected()) {
            vistapedido.getjLabelDireccion().setText("Para la farmacia situada en Calle Alcazabilla n. 3");
        }

        int precioTotal = 0;

        for (Pedido objeto : listapedidos) {
            precioTotal += objeto.getCantidad();
            String numero= Integer. toString(precioTotal);
            vista.getjLabelSumaCantidad().setText("Cantidad Total = "+numero);
        }

        

        //int tamanio =listapedidos.size();
        //String numero= Integer. toString(tamanio);
        //vistapedido.getjLabelNumero().setText(numero);
        //frmResumenPedido.jLabelMedicamento.setText(nom);
        //frmResumenPedido.jLabelMedicamento.setText(num + " unidades del " + tipo + " " + nom);
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

    public boolean validaciones() {
        Validaciones validar = new Validaciones();
        boolean validado = false;
        if (!this.vista.getTxtNombreMed().getText().isEmpty()) {
            if (validar.validarCadena(this.vista.getTxtNombreMed().getText())) {

                if (this.vista.getCmbxTipoMed().getSelectedIndex() != 0) {

                    if (!this.vista.getTxtCantidad().getText().isEmpty()) {
                        if (validar.validarNumeros(this.vista.getTxtCantidad().getText())) {

                            if (this.vista.getRbtn1().isSelected() || this.vista.getRbtn2().isSelected() || this.vista.getRbtn3().isSelected()) {

                                if ((this.vista.getCheckPrincipal().isSelected()) || (this.vista.getCheckSecundaria().isSelected())) {
                                    validado = true;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Es necesario seleccionar una sucursal");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Seleccione un distribuidor");
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Ingrese una cantidad en numeros");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese una cantidad de producto a comprar");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de medicamento");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Nombre de medicamento incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre de Medicamento");
        }

        return validado;
    }

    public void Limpiar() {
        vista.getTxtNombreMed().setText("");
        vista.getTxtCantidad().setText("");
        vista.getCmbxTipoMed().setSelectedIndex(0);
        vista.getButtonGroupDistribuidores().clearSelection();
        vista.getCheckPrincipal().setSelected(false);
        vista.getCheckSecundaria().setSelected(false);
    }

}
