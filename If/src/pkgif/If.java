/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Pedir números
        System.out.println("Escriba un múmero");
        int n1 = leer.nextInt();
        System.out.println("Escriba un múmero");
        int n2 = leer.nextInt();
        
        if (n1>25){
            System.out.println("El primer numero es mayor a 25");
        }
        if (n2>25){
            System.out.println("El segndo numero es mayor a 25");
        }        
        if (n1<25){
            System.out.println("El primer numero es menor a 25");
        }
        if (n2<25){
            System.out.println("El segndo numero es menor a 25");
        }
                
    }
    
}
