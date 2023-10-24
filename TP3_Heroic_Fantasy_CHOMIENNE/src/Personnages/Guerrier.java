/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author lunac
 */
public class Guerrier extends Personnage{
    
    boolean cheval;
    String verif;
    ArrayList <Arme> liste_Armes=new ArrayList <Arme>();    
    Arme armeEnMain;
    int nbguerrier;
    
    public Guerrier(String pseudo, int niv, boolean chev) {
        super(pseudo, niv);
        cheval=chev;
        armeEnMain=null;
        nbguerrier+=1;
        if (cheval==true){
            verif=" et est a cheval";
            
        }else{
            verif=" et est a pied";
            
        }
    }
    
    public boolean ajouter_arme (Arme arme_a_ajouter){
      if (liste_Armes.size()==5){
          System.out.println("Le guerrier a trop d'armes.");
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
    
    public void finalize(){
        nbguerrier=nbguerrier-1;
    
    }
    
    public void attaquer(Personnage victime){
        int pv=20;
        if (armeEnMain instanceof Epee){
            pv=20*((Epee)armeEnMain).finesse;     
            seFatiguer();
        }
        if (cheval==true){
            pv=pv/2;
        }
        victime.estAttaque(pv);
        System.out.println(victime.nom+ " a ete attaque par "+nom);
        
    }
    
    
    @Override
    public String toString () {
        return "Le guerrier "+nom+ " a un niveau de vie de "+nivVie+ verif+". Il a l'arme "+armeEnMain;
    }
    
}
