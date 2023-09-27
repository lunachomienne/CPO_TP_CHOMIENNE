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
        int nb = generateurAleat.nextInt(500);

        int guess;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un nombre entre 0 et 500");
        guess = sc.nextInt();       // on demande a l'utilisateur de choisir une valeur et on la garde pour la comparer avec le nombre mystere

        int compteur = 0;  //initialisation du compteur

        while (guess != nb) {
            if (guess > 2 * nb) {
                System.out.println("Vraiment trop grand!");    // dans le cas ou le nombre rentré est 2 fois plus grand que celui qu'il faut trouvé, message adapté
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Saisissez un nouveau nombre entre 0 et 500.");
                guess = sc1.nextInt();
                compteur += 1;   //on ajoute +1 au compteur à chaque essai
            }
            if (guess > nb) {
                System.out.println("Trop grand!");
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Saisissez un nouveau nombre entre 0 et 500.");
                guess = sc1.nextInt();
                compteur += 1;
            }
            if (guess < nb / 2) {
                System.out.println("Vraiment trop petit!");
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Saisissez un nouveau nombre entre 0 et 500.");
                guess = sc1.nextInt();
                compteur += 1;

            }
            if (guess < nb) {
                System.out.println("Trop petit!");
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Saisissez un nouveau nombre entre 0 et 100.");
                guess = sc1.nextInt();
                compteur += 1;
            }

        }
        System.out.println("C'est le bon nombre, vous l'avez trouve au bout de " + compteur + " essais, bravo!");

    }

}
