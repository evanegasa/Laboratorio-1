package ej3;
/**
 * <h1> Ejemplo general de uso de funciones </h1>
 * Esta clase muestra la forma en que se llaman dos funciones desde el main.
 * Imprime "Primera Función", luego llama a las funciones 1 y 2 e imprimen
 * respectivamente "Segunda Funcion" y "Tercer Funcion".
 * 
 * @author Emmanuel Vanegas
 * @version 1.0
 * @since 24/02/2016
 */
public class ej3 {

    /**
     * Funcion 1.
     * @return void
     */
    static void func1(){
        System.out.println("Segunda Funcion");
    }
    
    /**
     * Funcion 2.
     * @return void
     */
    static void func2(){
        System.out.println("Tercera Funcion");
    }
    
    /**
     * 
     * @param args Funcion principal, Main.
     */
    public static void main(String[] args){
        System.out.println("Primera Funcion en Main");
        func1();
        func2();
        System.out.println("Se termina Main");
    }
    
}
