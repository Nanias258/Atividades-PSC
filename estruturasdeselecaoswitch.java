package com.mycompany.estruturasdeselecao;

//
public class estruturasdeselecaoswitch {
    public static void main(String[] args) {
        int nota = 0;
        switch (nota){
            case 70:
                System.out.println("Aprovado com o conceito C");
                break;
            case 80:
                System.out.println("Aprovado com o conceito B");
                break;
            case 90:
                System.out.println("Aprovado com o conceito A");
                break;
            default:
                System.out.println("Reprovado");
        }
    }
    
    
}
