/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosanalisis;

import java.util.Scanner;

/**
 *
 * @author Santy
 */
public class EjerciciosAnalisis {
    static Scanner leer= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stefy();
        
    }
    
    public static void stefy(){
        System.out.println("Hola por favor ingresa dos numeros");
        int min;
        int acu=0;
        int max;
        System.out.println("Ingresa el minimo");
        min=leer.nextInt();
        System.out.println("Ingresa el maximo");
        max= leer.nextInt();
        for (int i = min; i <= max; i++) {
            if(i%2==0){
                System.out.println(i+" es par");
                acu=acu+i;
            }  
        }
        System.out.println("La suma es: "+acu);
    }
    
    public static void ruben(){
        
    }
    
    public static void alex(){
        
    }
    
    public static void adrian(){
        
    }
    
    public static void luis(){
        
    }
    
    public static void darwin(){
        
    }
    
}
