package com.mycompany.verificapositivo;

import java.util.Scanner;
import javax.swing.*;


//
public class VerificaPositivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(JOptionPane.showInputDialog("digite um numero: "));
        if(num>0){
            JOptionPane.showMessageDialog(null, "o numero "+num+" é positivo");
        }
        if(num < 0){
            JOptionPane.showMessageDialog(null, "o numero "+num+" é negativo.");
        }
        if(num == 0){
            JOptionPane.showMessageDialog(null, "o numero "+num+" é neutro.");
        }
        // Double.parseDouble(....), se fizer com double
        
    
    }
}
