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
    
    //GrilleDeJeu grille;
    int nbCoups;
    long temps;
    
    
    public Partie(){
        //grille=grille_initiale;
        nbCoups=0; 
        temps=0;
    }
    
    /**
     *cette fonction demande au joueur de choisir le niveau avec lequel il veut jouer
     * @return un numero (1,2 ou 3) qui correspond au niveau choisit
     */
    public int niveauPartie(){
        int dif;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisir le niveau de difficulte: saisir 1 pour Facile, 2 pour Intermediaire, et 3 pour Difficile");
        dif = sc.nextInt();
        return dif;
        
    }
    
    /**
     * initialise la partie avec une grille mélangée aléatoirement 10 fois.(possibilité d'augmenter le mélange)
     * @return 
     */
    public GrilleDeJeu initialiserPartie(int niveau){
        
        if (niveau==1){
           GrilleDeJeu grille=new GrilleDeJeu(4,4);
           grille.melangerMatriceAleatoirement(15);
           return grille;
        }
        if (niveau==2){
           GrilleDeJeu grille=new GrilleDeJeu(6,6);
           grille.melangerMatriceAleatoirement(30);
           return grille;
        }else{
           GrilleDeJeu grille=new GrilleDeJeu(9,9);
           grille.melangerMatriceAleatoirement(50);
           return grille;
        }
                    
    }
    /**
     * lance la Partie, avec un nb de coups initial a 0. Elle affiche a chaque tour la grille avec les modifications apportées, demande au joueur ce qu'il veut faire. Lorsque la partie est gagnée, le nb de coups utilisé est affiché.
     */
    public void lancerPartie(){
        int dif;
        dif=niveauPartie();
        GrilleDeJeu grille;
        grille=initialiserPartie(dif);
        nbCoups=0;
        String coup;
        int coupsAutorises=0;
        if (dif==1){
           coupsAutorises=5 ;
        }
        if (dif==2){
            coupsAutorises=10;
        }
        if (dif==3){
            coupsAutorises=15;
        }
        
        Chrono chrono = new Chrono();
        chrono.start(); // démarrage du chrono
        do{
        int coupsRestants; 
        coupsRestants=coupsAutorises-nbCoups+1;
        if (nbCoups>coupsAutorises){
            System.out.println("Vous avez effectue trop de coups, c'est rate. Retentez votre chance!");
            System.exit(nbCoups);
        }
        
        System.out.println("Il vous reste "+ coupsRestants+ " coups.");
        System.out.println(grille);    
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\n Saisissez un coup: (L+num de Ligne, ou C+num de Colonne, ou D1 pour diag montante, D2 pour la descendante)  :");
        coup=sc1.nextLine();
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
        chrono.stop(); // arrêt
        temps=chrono.getDureeSec();
        
        
        if (chrono.getDureeSec()>60){
            System.out.println("Vous avez ete un peu long... temps mis: "+chrono.getDureeTxt());
        }
        if (chrono.getDureeSec()>15 && chrono.getDureeSec()<60){
            System.out.println("Bien joue! temps mis: "+chrono.getDureeTxt());
        }
        if (chrono.getDureeSec()<15){
            System.out.println("Le boss, en moins de 15 secondes !  temps mis: "+chrono.getDureeTxt());
        }
        System.out.println("Vous avez realise cette partie en "+nbCoups+ " coups. Rejouez pour ameliorer votre score!");
        
        
    }
 
    
}


