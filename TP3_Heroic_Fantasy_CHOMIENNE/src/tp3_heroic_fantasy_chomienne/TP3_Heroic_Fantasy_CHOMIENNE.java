/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_chomienne;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Baton;
import Armes.Arme;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * luna chomienne TDB le 18/10/2023
 */
public class TP3_Heroic_Fantasy_CHOMIENNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Epee e_Excalibur=new Epee("Excalibur", 7, 5);
    Epee e_Durandal=new Epee ("Durandal", 4,7);
    Epee e_Or=new Epee("Or", 6, 6);
    
    Baton b_Chene=new Baton("Chene",4,5);
    Baton b_Charme=new Baton ("Charme", 5,6);
    Baton b_Corne=new Baton ("Corne", 3, 5);
   
    
    Magicien m_Gandalf= new Magicien ("Gandalf",30,false);
    
   
    Guerrier g_Lannister= new Guerrier("Lannister",45, true);
    
    m_Gandalf.ajouter_arme(e_Or);
    m_Gandalf.ajouter_arme(b_Chene);
    m_Gandalf.equipeArme(b_Chene);
    
    g_Lannister.ajouter_arme(e_Excalibur);
    g_Lannister.ajouter_arme(b_Charme);
    g_Lannister.equipeArme(e_Excalibur);
    
    
    g_Lannister.attaquer(m_Gandalf);
    System.out.println(g_Lannister);
    System.out.println(m_Gandalf);
    
    
    
    m_Gandalf.attaquer(g_Lannister);
    System.out.println(g_Lannister);
    System.out.println(m_Gandalf);
    
    g_Lannister.estVivant();
    m_Gandalf.estVivant();
    
    }
}
