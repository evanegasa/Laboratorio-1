/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asterizco;


import java.util.Scanner;

/**
 * <h1>Cuenta</1>
 * Clase que imprime una pirámide de asterizcos de 5 lineas de altura con loops.
 * 
 * @author Emmanuel Vanegas
 * @version 1.0
 * @since 24/02/16
 */
public class Asterizco {

    /**
     * @param args Función principal, Main.
     */
    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);
        
        int cuenta_as = 1, contador = 1, blan = 1, num =5;
        String ast = "*";
        String esp = " ";
        
        System.out.println("");
        
        while(contador <= num){
        
            blan = num - contador;
            
            while(blan > 0){
                System.out.print(esp);
                blan--;
            }
            
            cuenta_as = 1;
            
            while(cuenta_as < 2*contador){
                System.out.print(ast);
                cuenta_as++;
            }
            
            contador++;
            System.out.println("");
        }
    }
}
    

