/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Miri
 */
public class Validaciones {


    public boolean validarCadena(String text) {

        if (text.isEmpty()) {
            return false;
        } else {
            text = text.trim();
            if (text.matches("^[a-zA-Z\\s]*")) {
                return true;
            }
        }
        return false;
    }

    public boolean validarCadenaSinCaracteres(String text) {

        if (text.isEmpty()) {
            return false;
        } else {
            text = text.trim();
            if (text.matches("^[a-zA-Z\\s]*")) {
                return true;
            }
        }
        return false;
    }

    public boolean validarNumeros(String x) {
        try {
            int n = Integer.parseInt(x);
            if (n < 1) {
                return false;
            } else {
                if (n >= 1) {
                    return true;
                }
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }
}
