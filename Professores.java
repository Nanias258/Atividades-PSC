
package com.mycompany.diariodenotas2;

import static com.mycompany.diariodenotas2.DiariodeNotas2.a1;
import static com.mycompany.diariodenotas2.DiariodeNotas2.a2;
import static com.mycompany.diariodenotas2.DiariodeNotas2.a3;
import static com.mycompany.diariodenotas2.DiariodeNotas2.media;
import static com.mycompany.diariodenotas2.DiariodeNotas2.nomealuno;
import static com.mycompany.diariodenotas2.DiariodeNotas2.uc;
import javax.swing.JOptionPane;

public class Professores {
    String senha;
    String email;
    private String nomeProfessor;
    public void entradaProfessor(){
        JOptionPane.showMessageDialog(null, "Bem vindo Professor");
        nomeProfessor=JOptionPane.showInputDialog("Digite seu nome: ");
        email=JOptionPane.showInputDialog("Digite seu email: ");
        senha=JOptionPane.showInputDialog("Digite sua senha: ");
        uc=JOptionPane.showInputDialog("Digite sua UC: ");
        if(uc.equalsIgnoreCase("1")){
            JOptionPane.showMessageDialog(null, "Bem vindo a Modelagem de Softwere "+nomeProfessor);
        }else if(uc.equalsIgnoreCase("2")){
            JOptionPane.showMessageDialog(null, "Bem vindo a Programação de Soluções Computacionais "+nomeProfessor);
        }
        
    }
    public void escreverNotas(){
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
    }
}
