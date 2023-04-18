/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Scanner;



public class Funciones {

    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     System.out.println("ingrese una frase");
     String frase = leer.nextLine();
     Cambio(frase);
     
    }
    public static void Cambio(String frase){
        int c = frase.length();
        String l;
        String fn="";
        for (int i=0;i < c;i++){
            l=frase.substring(i,i+1);
            //System.out.println(i);  
         switch (l){
             case "a":
                 fn+="@";
                 
                 //System.out.println("caso");
                 break;
             case "e": 
                 fn+="#";
                 
                 break;
             case "i":
                 fn+="$";
                 
                 break;
             case "o":
                 fn+="%";
                
                 break;
             case "u":
                 fn+="*";
                
                 break;
             default:
                 fn+=l;
                 
                       
         }
            
            
        }
        System.out.println(fn);
    }
}
/*public class CambiarLetraPorSimbolo {
    public static void main(String[] args) {
        String texto = "Hola mundo";
        char letra = 'o';
        String simbolo = "*";
        
        // Reemplazar todas las apariciones de la letra con el símbolo
        String resultado = texto.replace(letra, simbolo.charAt(0));
        
        // Imprimir el resultado
        System.out.println("Texto original: " + texto);
        System.out.println("Texto modificado: " + resultado);
    }
}*/