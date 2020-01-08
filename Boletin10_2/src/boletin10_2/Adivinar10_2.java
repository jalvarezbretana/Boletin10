/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_2;

import javax.swing.*;

/**
 *
 * @author jalvarezbretana
 */
public class Adivinar10_2 {

    private int numero;
    private int numero2;
    private int contador;
    private int intento;

    public void jugador1() {
        do {
            numero = (int) (Math.random() * (51 - 0));
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
            if (Math.abs(numero - numero2) > 20 && (numero - numero2 != 0)) {
                JOptionPane.showMessageDialog(null, "Muy lejos");
            } else if (Math.abs(numero - numero2) >= 10 && (numero - numero2 != 0)) {
                JOptionPane.showMessageDialog(null, "Lejos");
            } else if (Math.abs(numero - numero2) >= 5 && (numero - numero2 != 0)) {
                JOptionPane.showMessageDialog(null, "Cerca");
            } else if (Math.abs(numero - numero2) < 5 && (numero - numero2 != 0)) {
                JOptionPane.showMessageDialog(null, "Muy cerca");
            }
        }
        if (numero2 == numero) {
            JOptionPane.showMessageDialog(null, "Has acertado");
        } else {
            JOptionPane.showMessageDialog(null, "Has fallado");
        }
    }
}
