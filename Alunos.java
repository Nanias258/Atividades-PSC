package com.mycompany.diariodenotas2;


import javax.swing.JOptionPane;

public class Alunos extends Usuario {
    private int ra;
    private String telefone;
    private String senha;

    public void identificarAluno(){
      super.identificarUsuario();
        setRa(Integer.parseInt(JOptionPane.showInputDialog("Digite seu RA: ")));
        setTelefone(JOptionPane.showInputDialog("Digite seu telefone"));
        
        
    }        
    public void visualizarNota(){
        
    }
    public void visualizarAtividade(){
        
    }

 

    /**
     * @return the ra
     */
    public int getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(int ra) {
        this.ra = ra;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
