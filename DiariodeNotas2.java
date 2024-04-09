package com.mycompany.diariodenotas2;

import javax.swing.JOptionPane;

public class DiariodeNotas2 {
    static String nomealuno;
    static String nomeProfessor;
    static String uc;
    static int a1;
    static int a2;
    static int a3;
    static int media;
    public static void main(String[] args) {
        String usuario = JOptionPane.showInputDialog("Você é o Professor ou o Aluno?");  
        if(usuario.equalsIgnoreCase("Aluno")){
            Alunos alunos = new Alunos();
            alunos.entradaAluno();
        }else if(usuario.equalsIgnoreCase("Professor")){
            Professores professores = new Professores();
            professores.entradaProfessor();
        }
        
        
        
    }
}
