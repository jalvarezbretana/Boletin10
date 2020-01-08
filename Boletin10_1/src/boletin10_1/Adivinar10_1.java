/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import javax.swing.*;

/**
 *
 * @author jalvarezbretana
 */
public class Adivinar10_1 {

    private int numero;
    private int numero2;
    private int contador;
    private int intento;

    public void jugador1() {
        do {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Numero a adivinar"));
            this.numero = num;
            int inte = Integer.parseInt(JOptionPane.showInputDialog("Numero de intentos"));
            this.intento = inte;
        } while (numero >= 50 || numero <= 1);
    }

    public void datosJugador2() {
        do {
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Que numero crees que es?"));
            this.numero2 = num2;
        } while (numero2 > 50 || numero < 1);
    }

    public void jugador2() {
        for (contador = 0; numero2 != numero && contador < intento; contador++) {
            datosJugador2();
            if (numero2 > numero) {
                JOptionPane.showMessageDialog(null, "Te has pasado");
            } else if (numero2 < numero) {
                JOptionPane.showMessageDialog(null, "Te has quedado corto");
            }
        }
        if (numero2 == numero) {
            JOptionPane.showMessageDialog(null, "Has acertado");
        } else {
            JOptionPane.showMessageDialog(null, "Has fallado");
        }
    }
}
