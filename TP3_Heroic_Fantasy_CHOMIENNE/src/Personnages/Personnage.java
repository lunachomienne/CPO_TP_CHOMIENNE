/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;
import tp3_heroic_fantasy_chomienne.etreVivant;

/**
 *
 * @author lunac
 */
public abstract class Personnage implements etreVivant {
    
    String nom;
    int nivVie;
    Arme arme_en_main;
    int nbperso;
            
     public Personnage(String pseudo, int niv){
        nom=pseudo;
        nivVie=niv;
        nbperso+=1;
    }
    
    public void finalize(){
        nbperso=nbperso-1;
    }
     
    @Override
    public String toString () {
        return "Le personnage "+nom+ " a un niveau de vie de "+nivVie;
    }

    @Override
    public void seFatiguer() {
        nivVie=nivVie-10;
    }

    @Override
    public boolean estVivant() {
        if (nivVie>0){
            System.out.println(nom+" est toujours vivant!");
          return true;  
        }else{
            System.out.println(nom +" a perdu le combat... Rejouez en changeant les armes et attributs des personnages !");
            return false;
        }
    }
    
    
    @Override
    public void estAttaque(int point) {
        nivVie=nivVie-point;
    }
    
    
}
