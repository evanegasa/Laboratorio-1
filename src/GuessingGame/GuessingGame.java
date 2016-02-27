package GuessingGame;

import java.util.Scanner;

/**
 * <h1> Guessing Game </h1>
 * Clase que con el método "Math.random()" de la clase Math, crea un número 
 * aleatorio entre 1 y 100. El usuario tiene 7 intentos para adivinar el número,
 * mientras la máquina le da pistas según el numero sea mayor o menor que la
 * respuesta. Si el usuario pierde, es insultado por la máquina.
 * 
 * La clase, mediante varios loops le pide al usuario intentar de adivinar el
 * numero, luego, el programa compara este valor con la respuesta generada
 * aleatoriamente. Dependiendo si es mayor o menor, imprime pistas al usuario
 * indicandole que la respuesta es mayor o menor a su intento de respuesta. Si
 * se acaban los 7 intentos o el usuario da con la respuesta, se interrumple
 * el loop y se imprime si el usuario ganó o perdió.
 * 
 * @author Emmanuel Vanegas
 * @version 1
 * @since 24/02/2016
**/

public class GuessingGame {
    /**
     * @param args Funcion main, llama al juego y pide al usuario si desea
     * volver a jugar. 
     **/
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        
        String playAgain =  "y";
                
        while("y".equals(playAgain)){
            GuessingGame();
            System.out.print("Would you like to play another game (y/n): ");
            playAgain = sc.next();
        }
    }
    /**
     * Función propia del juego.
     **/
    static void GuessingGame(){
        int answer = (int) Math.floor((Math.random()*100)+1);
        System.out.println(answer);
        int guess = 0;
        int numGuesses = 1;
        
        while(numGuesses <= 7 && guess != answer){
                
            System.out.print("Guess a number: ");
            guess = sc.nextInt();
            if(guess < answer)System.out.println("Higher...");
            else if(guess > answer)System.out.println("Lower...");
            else System.out.println("You Win");

            numGuesses ++;   
        }
            if(numGuesses > 7){
                System.out.println("You Loser");
                return;
            }
    }
}

