/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_chomienne_version_console;

/**
 *
 * lunachomienne TDB le 25/10/2023
 */
public class LightOff_CHOMIENNE_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GrilleDeJeu grille1=new GrilleDeJeu(9,9);
        Partie partie1=new Partie(grille1);
        partie1.lancerPartie();
        
        
        
    }
    
}
