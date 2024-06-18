package com.mycompany.diariodenotas2;

import javax.swing.JOptionPane;

public class DiariodeNotas2 {
    
    static String nomeProfessor;
    public static void main(String[] args) {
        String usuario = JOptionPane.showInputDialog("Você é o Professor ou o Aluno?");  
        if(usuario.equalsIgnoreCase("Aluno")){
            Alunos alunos = new Alunos();
            alunos.identificarAluno();
        }else if(usuario.equalsIgnoreCase("Professor")){
            Professores professores = new Professores();
            professores.identificarUsuario();
        }
        
        
        
    }
}
