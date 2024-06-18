package com.mycompany.gui;
import javax.swing.*;


public class executar {
    public static void main (String[] args){
        Conversor conversor = new Conversor();
        SwingUtilities.invokeLater(() ->{
            Conversor.criarTela();
        }
        );
    }
}
