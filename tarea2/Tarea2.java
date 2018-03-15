/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import javax.swing.JOptionPane;

/**
 *
 * @author germa
 */
public class Tarea2 {

    public static void main(String[] args) {
        double num;
        num = Double.parseDouble(JOptionPane.showInputDialog("Digita un numero: "));
        JOptionPane.showMessageDialog(null, "El numero es Real y racional");
        Par (num);
        Primo (num);
    }
    
    public static void Par (double n){
        if (n%2 == 0) JOptionPane.showMessageDialog(null, "Es par");
        else JOptionPane.showMessageDialog(null, "No es par");
    }
    
    public static void Primo (double n) {
        int x = 1, cont = 0;
        while (x <= n) {
            if (n%x == 0) cont++;
            x++;
        }
        if (cont == 2) JOptionPane.showMessageDialog(null, "Es primo");
        else JOptionPane.showMessageDialog(null, "No es primo");
    }
    
}
