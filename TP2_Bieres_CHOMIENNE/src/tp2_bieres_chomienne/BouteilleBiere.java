/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_chomienne;

/**
 *
 * @author lunac
 */
public class BouteilleBiere {

    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres) \nBrasserie : " + brasserie);
    }

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    boolean Décapsuler() {
        if (ouverte == true) {
            System.out.println("La biere "+nom+" est deja ouverte!");
            return false;
        } else {
            ouverte=true;
            System.out.println("Biere "+nom+" decapsulee ! Cheers!");
            return true;
        }
    }

    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degres) \nOuverte ? "; 
        if (ouverte == true ){
            chaine_a_retourner += "oui" ;
        } else{
            chaine_a_retourner += "non" ;
        }
        return chaine_a_retourner ;
        }

}

