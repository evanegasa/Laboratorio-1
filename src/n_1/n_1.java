package n_1;

import java.util.Scanner;

/**
 * <h1>Buscador del mayor entre tres numeros</h1>
 * El programa le pide al usuario 3 números (A, B, C) y los compara con
 * condicionales hasta encontrar e imprimir el mayor de los 3.
 * 
 * @author Emmanuel Vanegas
 * @version 1.0
 * @since 24/02/2016
 */

public class n_1 {
    
    /**
     * @param args Funcion principal del programa.
     */
    public static void main(String[] args){
  
        Scanner sc = new Scanner(System.in);
        
        int mayor = 0;
        System.out.print("Ingrese A: ");
        int a = sc.nextInt();
        System.out.print("Ingrese B: ");
        int b = sc.nextInt();
        System.out.print("Ingrese C: ");
        int c = sc.nextInt();
        
        if(a>b)
            if(a>c)
                mayor = a;
            else mayor = c;
        else if(b>c)
                mayor = b;
              else mayor = c;
        
        System.out.println("El mayor numero es: " + mayor);
    }
}
