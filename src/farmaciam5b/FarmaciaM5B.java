/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package farmaciam5b;

import controller.ControllerRegistro;
import controller.ControllerResumenPedido;
import java.util.ArrayList;
import model.Pedido;
import view.frmPedido;
import view.frmResumenPedido;

/**
 *
 * @author USUARIO
 */
public class FarmaciaM5B {
     
    public static void main(String[] args) {
        
        frmPedido vista = new frmPedido();
        ControllerRegistro controlador = new ControllerRegistro(vista);
        
    }
    
}
