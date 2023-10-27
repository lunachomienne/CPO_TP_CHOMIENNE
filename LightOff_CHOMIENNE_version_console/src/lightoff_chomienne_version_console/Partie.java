/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_chomienne_version_console;

import java.util.Scanner;

/**
 *
 * @author lunac
 */
public class Partie {
    
    GrilleDeJeu grille;
    int nbCoups;
    
    public Partie(GrilleDeJeu grille_initiale){
        grille=grille_initiale;
        nbCoups=0; 
    }
    
    /**
     * initialise la partie avec une grille mélangée aléatoirement 10 fois. (possibilité d'augmenter le mélange)
     */
    public void initialiserPartie(){
        grille.melangerMatriceAleatoirement(50);
        
    }
    
    /**
     * lance la Partie, avec un nb de coups initial a 0. Elle affiche a chaque tour la grille avec les modifications apportées, demande au joueur ce qu'il veut faire. Lorsque la partie est gagnée, le nb de coups utilisé est affiché.
     */
    public void lancerPartie(){
        initialiserPartie();
        nbCoups=0;
        String coup;
        do{
        System.out.println(grille);    
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Saisissez un coup: (L+num de Ligne, ou C+num de Colonne, ou D1 pour diag montante, D2 pour la descendante)  :");
        coup=sc.nextLine();
        char lettreChar= coup.charAt(0);
        char chiffreChar=coup.charAt(1);
        if (Character.isLetter(lettreChar) && Character.isDigit(chiffreChar)){
            int chiffre=Character.getNumericValue(chiffreChar);

            if (coup.contains("L")){ 
                grille.activerLigneDeCellules(chiffre-1);
            }
            if (coup.contains("C")){ 
                grille.activerColonneDeCellules(chiffre-1);
            }
            if (coup.contains("D") && chiffre==1){
                grille.activerDiagonaleMontante();
            }
            if (coup.contains("D") && chiffre==2){
                grille.activerDiagonaleDescendante();
            }
            nbCoups+=1;
        } else{
            System.out.println("Erreur, saisissez la bonne forme de coup.");
        }
        
        }while(grille.cellulesToutesEteintes()!=true);
        System.out.println(grille);
        System.out.println("Vous avez realise cette partie en "+nbCoups+ " tours. Rejouez pour ameliorer votre score!");
    }
    
}
