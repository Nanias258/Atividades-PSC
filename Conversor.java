package com.mycompany.gui;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.*;

public class Conversor {
    
    public static void criarTela(){
        JFrame tela = new JFrame("Conversor");
        JTextField celsiusTxt = new JTextField();
        JLabel celsiusLabel = new JLabel("\u00B0C");
        JButton conversor = new JButton("Converter");
        JLabel valorConvertido = new JLabel();
        Container painelDeControle = tela.getContentPane();
        painelDeControle.setLayout(new GridLayout(2,2,4,4));
        painelDeControle.add(celsiusTxt);
        painelDeControle.add(celsiusLabel);
        painelDeControle.add(conversor);
        painelDeControle.add(valorConvertido);
        
        conversor.addActionListener((e) ->{
        double celsius = Double.parseDouble(
                celsiusTxt.getText());
        double fahrenheit = celsius / 5 * 9 + 32;
        valorConvertido.setText(String.format("%.2f\u00B0F",fahrenheit));
        });
        
        
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
    
}
