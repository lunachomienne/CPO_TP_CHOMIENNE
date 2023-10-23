/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author lunac
 */
public abstract class Personnage {
    
    String nom;
    int nivVie;
    Arme arme_en_main;
            
     public Personnage(String pseudo, int niv){
        nom=pseudo;
        nivVie=niv;
        
    }
     
    
     
    @Override
    public String toString () {
        return "Le personnage "+nom+ " a un niveau de vie de "+nivVie;
    }
    
}
