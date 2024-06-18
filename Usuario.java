package com.mycompany.diariodenotas2;

import javax.swing.JOptionPane;


public class Usuario {
    private String nome; 
    private String email;
    private int idade;

    /**
     * @return the nomealuno
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nomealuno to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void identificarUsuario(){
        setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        setEmail(JOptionPane.showInputDialog("Digite seu email: "));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
        JOptionPane.showMessageDialog(null, "Bem vindo Professor "+getNome());
        
    }
}
