package com.mycompany.estruturasdeselecao;

//
public class estruturasdeselecaostring {
    public static void main(String[] args) {
        String palavra = "Olá";
        if(palavra == "olá"){
            System.out.println("ok");
        }else{
            System.out.println("não ok");            
        }
        if(palavra.equalsIgnoreCase("ola")){
            System.out.println("ok");
        }else{
            System.out.println("não ok");
        }
    }
    
}
