package com.mycompany.estruturasdeselecao;

//

import javax.swing.JOptionPane;

public class diariodenotas {
    static String nome;
    static String nomealuno;
    public static void main(String[] args) {
                               
        String usuario = JOptionPane.showInputDialog("Você é o Professor ou o Aluno?");  
        int a1, a2, a3, media = 0;        
        if(usuario.equalsIgnoreCase("Professor")){  
            nome =JOptionPane.showInputDialog("Qual seu nome?");        
            JOptionPane.showMessageDialog(null, "Bem vindo Professor " + nome);
            String uc = JOptionPane.showInputDialog("Qual a sua UC? Digite 1 para Modelagem de Softwere e 2 para Programação de Soluções Computacionais.  ");            
            for(int qaluno=0;qaluno<=10; qaluno++){            
            if(uc.equalsIgnoreCase("1")){
                JOptionPane.showMessageDialog(null, "Bem vindo a Modelagem de Softwere "+nome);
                nomealuno=JOptionPane.showInputDialog("Qual o nome do aluno?");
                a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A1:"));
                a2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A2:"));
                a3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A3:"));
                media = (a1*3+a2*3+a3*4)/10;
                JOptionPane.showMessageDialog(null,"O aluno obteve uma média "+media);
                if(media>=70){
                    JOptionPane.showMessageDialog(null, "O aluno "+nomealuno+ "está Aprovado.");                
                }else if(media<70 && media>=30){
                    JOptionPane.showMessageDialog(null, "O aluno "+nomealuno+ "está Pendente");
                }else{
                    JOptionPane.showMessageDialog(null,"O aluno "+nomealuno+ "está Reprovado");
                }
                
            }else if(uc.equalsIgnoreCase("2")){
                JOptionPane.showMessageDialog(null, "Bem vindo a Programação de Soluções Computacionais "+nome);
                nomealuno=JOptionPane.showInputDialog("Qual o nome do aluno?");
                a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A1:"));
                a2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A2:"));
                a3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A3:"));  
                media = (a1*3+a2*3+a3*4)/10;
                JOptionPane.showMessageDialog(null,"O aluno obteve uma média "+media);
                if(media>=70){
                    JOptionPane.showMessageDialog(null, "O aluno "+nomealuno+ "está Aprovado");                
                }else if(media<70 && media>=30){
                    JOptionPane.showMessageDialog(null, "O aluno "+nomealuno+ "está Pendente");
                }else{
                    JOptionPane.showMessageDialog(null,"O aluno "+nomealuno+ "está Reprovado");
                }
            }}

        }else if(usuario.equalsIgnoreCase("Aluno")){
            JOptionPane.showMessageDialog(null, "Bem Vindo Aluno " + nome);
            String uc = JOptionPane.showInputDialog("Qual a sua UC? Digite 1 para Modelagem de Softwere e 2 para Programação de Soluções Computacionais.  ");
            
            if(uc.equalsIgnoreCase("1")){
                JOptionPane.showMessageDialog(null, "Bem vindo a Modelagem de Softwere "+nome);
                JOptionPane.showMessageDialog(null,"Você obteve uma média de "+media);                
            }else if(uc.equalsIgnoreCase("1")){
                JOptionPane.showMessageDialog(null, "Bem vindo a Programação de Soluções Computacionais "+nome);
                JOptionPane.showMessageDialog(null,"Você obteve uma média de "+media);
            }            
        }
    }       
}
