package com.mycompany.lados;

//

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
       int a = Integer.parseInt(JOptionPane.showInputDialog("digite o lado a:  "));
       int b = Integer.parseInt(JOptionPane.showInputDialog("digite o lado b:  "));
       int c = Integer.parseInt(JOptionPane.showInputDialog("digite o lado c:  "));
        if(a==b && a!=b){
            JOptionPane.showMessageDialog(null, "isóceles");
        }
        if(a==b && a==c){
            JOptionPane.showMessageDialog(null, "equilátero");
        }
        if(a!=b && a!=c){
            JOptionPane.showMessageDialog(null, "escaleno");
        }
    }
}
