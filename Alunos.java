package com.mycompany.diariodenotas2;

import static com.mycompany.diariodenotas2.DiariodeNotas2.nomealuno;
import static com.mycompany.diariodenotas2.DiariodeNotas2.uc;
import javax.swing.JOptionPane;

public class Alunos {
    int ra;
    String senha;
    String email;
    int idade;
    String telefone;
    
    public void entradaAluno(){
        JOptionPane.showMessageDialog(null, "Bem vindo Aluno");
        nomealuno=JOptionPane.showInputDialog("Digite seu nome: ");
        ra=Integer.parseInt(JOptionPane.showInputDialog("Digite seu RA: "));
        senha=JOptionPane.showInputDialog("Digite sua senha: ");
        email=JOptionPane.showInputDialog("Digite seu email: ");
        idade=Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        telefone=JOptionPane.showInputDialog("Digite seu telefone");
        uc=JOptionPane.showInputDialog("Digite sua UC: ");
        if(uc.equalsIgnoreCase("1")){
            JOptionPane.showMessageDialog(null, "Bem vindo a Modelagem de Softwere "+nomealuno);
        }else if(uc.equalsIgnoreCase("2")){
            JOptionPane.showMessageDialog(null, "Bem vindo a Programação de Soluções Computacionais "+nomealuno);
        }
        
    }        
    public void visualizarNota(){
        
    }
    public void visualizarAtividade(){
        
    }
    
}
