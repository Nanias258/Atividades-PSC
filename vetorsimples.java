package com.mycompany.diariodenotas2;

public class vetorsimples {
    public static void main(String[] args){
    //int [] vetorDeInteiros;
    String [] vetorDeStringS;
    Double [] vetorDeDoubles;
    boolean[] vetorDeBooleanos;
    int [] vetorDeInteiros = new int[]{10,20,30,40,50};
    
    int tamanho = vetorDeInteiros.length;
    System.out.print(tamanho);
    
        System.out.println(vetorDeInteiros[0]);
        
        for(int i=0; i < vetorDeInteiros.length; i++){
            System.out.println("Elemento"+i+":"+vetorDeInteiros[i]);
        }
    
    }
}
