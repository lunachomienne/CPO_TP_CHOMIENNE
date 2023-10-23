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
public class Magicien extends Personnage{
    
    boolean confirme;
    String verif;
    ArrayList <Arme> liste_Armes=new ArrayList <Arme>();
    Arme armeEnMain;
    
    
    public Magicien(String pseudo, int niv, boolean conf) {
        super(pseudo, niv);
        confirme=conf;
        armeEnMain=null;
        
        if (confirme==true){
            verif=" et est a cheval.";
            
        }else{
            verif=" et est a pied.";
            
        }
    }
    
    public boolean ajouter_arme (Arme arme_a_ajouter){
      if (liste_Armes.size()==5){
          System.out.println("Le magicien a trop d'armes.");
          return false;
      }else{
        liste_Armes.add(arme_a_ajouter); 
        return true;
      }
    }
    
    public void choisirArmeEnMain(Arme arme) {
        if (liste_Armes.contains(arme)) {
            armeEnMain = arme;
        } else {
            System.out.println("Le personnage ne possède pas cette arme.");
        }
    }
    
     public Arme getArmeEnMain() {
        return armeEnMain;
    }
     
    public String equipeArme(Arme arme){
        if (liste_Armes.contains(arme)){
            armeEnMain=arme;
            return nom+"est equipe de l'arme "+armeEnMain;
        }else{
            return nom+ "n'a pas cette arme.";
        }
    }

    
    @Override
    public String toString () {
        return "Le magicien "+nom+ " a un niveau de vie de "+nivVie+ verif+". Il a l'arme "+armeEnMain;
    }
}
