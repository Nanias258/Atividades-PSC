package com.mycompany.gui;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


 public class Tela {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            criarTela();
            
        });
    }
    
    
    
    public static void criarTela(){
    JFrame tela = new JFrame("Primeira tela");
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel("Olá");
    Container painelDeConteudo = tela.getContentPane();
    painelDeConteudo.add(label);
    tela.pack();
    tela.setVisible(true);
    
    }
}
