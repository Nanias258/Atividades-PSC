
package com.mycompany.diariodenotas2;

import javax.swing.JOptionPane;

public class Professores extends Usuario {    
    private int a1;
    private int a2;
    private int a3;
    private int media;
    private String nomeAluno;
    
     
        
    
    public void escreverNotas(){
        Alunos aluno = new Alunos();
        aluno.setNome((JOptionPane.showInputDialog("Qual o nome do aluno?")));

                setA1(Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A1:")));
                setA2(Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A2:")));
                setA3(Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A3:")));
                setMedia((getA1() * 3 + getA2() * 3 + getA3() * 4) / 10);
                JOptionPane.showMessageDialog(null,"O aluno obteve uma média "+getMedia());
                if(getMedia()>=70){
                    JOptionPane.showMessageDialog(null, "O aluno " + aluno.getNome() + "está Aprovado.");                
                }else if(getMedia()<70 && getMedia()>=30){
                    JOptionPane.showMessageDialog(null, "O aluno " + aluno.getNome() + "está Pendente");
                }else{
                    JOptionPane.showMessageDialog(null,"O aluno "+ aluno.getNome()+ "está Reprovado");
                }
    }

   
    /**
     * @return the a1
     */
    public int getA1() {
        return a1;
    }

    /**
     * @param a1 the a1 to set
     */
    public void setA1(int a1) {
        this.a1 = a1;
    }

    /**
     * @return the a2
     */
    public int getA2() {
        return a2;
    }

    /**
     * @param a2 the a2 to set
     */
    public void setA2(int a2) {
        this.a2 = a2;
    }

    /**
     * @return the a3
     */
    public int getA3() {
        return a3;
    }

    /**
     * @param a3 the a3 to set
     */
    public void setA3(int a3) {
        this.a3 = a3;
    }

    /**
     * @return the media
     */
    public int getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(int media) {
        this.media = media;
    }

    /**
     * @return the nomealuno
     */

}
