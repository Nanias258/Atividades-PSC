package com.mycompany.opatribuicao;

import java.util.Scanner;
import javax.swing.JOptionPane;


//
public class Opatribuicao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);            
        int num1 = Integer.parseInt(JOptionPane.showInputDialog( "Digite o primeiro numero: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog( "Digite o segundo numero: "));        
        boolean igual = num1==num2;
        boolean digerente = num1!=num2;
        boolean maior = num1>num2;
        boolean menor = num1<num2;
        boolean maiorigual = num1>=num2;
        boolean menorigual = num1<=num2;        
        JOptionPane.showMessageDialog(null, igual);
        JOptionPane.showMessageDialog(null, digerente);
        JOptionPane.showMessageDialog(null, maior);
        JOptionPane.showMessageDialog(null, menor);
        JOptionPane.showMessageDialog(null, maiorigual);
        JOptionPane.showMessageDialog(null, menorigual);
        
        
        
        
        
        
        
        
        
    }
}
