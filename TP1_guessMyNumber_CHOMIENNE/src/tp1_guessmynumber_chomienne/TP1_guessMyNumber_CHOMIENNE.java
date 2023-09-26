/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_chomienne;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * lunachomienne TDB 26/09/2023
 */
public class TP1_guessMyNumber_CHOMIENNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int nb = generateurAleat.nextInt(100);
        
        int guess;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un nombre entre 0 et 100");
        guess=sc.nextInt();

        while (guess!=nb){
            if (guess>nb){
                System.out.println("Trop grand!");
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Saisissez un nouveau nombre entre 0 et 100.");
                guess=sc1.nextInt();
            }
            if (guess<nb){
                System.out.println("Trop petit!");
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Saisissez un nouveau nombre entre 0 et 100.");
                guess=sc1.nextInt();
            }
        }
        System.out.println("C'est le bon nombre, bravo!");
        

    }
    
}
