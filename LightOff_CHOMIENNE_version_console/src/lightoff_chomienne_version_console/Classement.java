/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_chomienne_version_console;

import java.util.ArrayList;


/**
 *
 * @author lunac
 */
public class Classement extends Partie{
    
    ArrayList <Partie> liste_Partie=new ArrayList <Partie>();
    
    int coups;
    long chrono;
    
    
    
    public void Classer(Partie partie_en_cours){
        if (liste_Partie.size()<3){
            liste_Partie.add(partie_en_cours);
        }
        if (liste_Partie.size()>=3){
            chrono =temps.partie_en_cours();
            for (int i=0; i<4; i++){
                if (nbCoups.partie_en_cours() >temps.liste_Partie[i]()){
                
            }
            }
        }
    }
}


