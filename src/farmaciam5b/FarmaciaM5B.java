/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package farmaciam5b;

import java.util.ArrayList;
import model.Pedido;
import view.frmPedido;

/**
 *
 * @author USUARIO
 */
public class FarmaciaM5B {

     public static ArrayList<Pedido> pedido = new ArrayList<>();
     
    public static void main(String[] args) {
        frmPedido vist = new frmPedido();
        vist.setVisible(true);
        
        System.out.println("aaa");
    }
    
}
