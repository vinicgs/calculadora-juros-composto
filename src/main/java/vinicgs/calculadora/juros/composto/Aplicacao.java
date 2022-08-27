/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vinicgs.calculadora.juros.composto;

import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class Aplicacao {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculadora calc = new Calculadora();   
            calc.setVisible(true);
        });
    }

}