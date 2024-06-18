package com.mycompany.diariodenotas2;


import javax.swing.JOptionPane;


public class Uc {
    private String ucu;
    
    public void identificarUc(){
        ucu=JOptionPane.showInputDialog("Digite sua UC: ");
        if(ucu.equalsIgnoreCase("1")){
            JOptionPane.showMessageDialog(null, "Bem vindo a Modelagem de Softwere "+getNome());
        }else if(ucu.equalsIgnoreCase("2")){
            JOptionPane.showMessageDialog(null, "Bem vindo a Programação de Soluções Computacionais "+getNome());
        }
    }
    
    
}
