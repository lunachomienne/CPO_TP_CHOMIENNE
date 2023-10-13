/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_chomienne;

/**
 *
 * @author lunac
 */
public class Voiture {
    
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire=null;
    
    
    public Voiture(String Mod, String Mar, int PCV){
        Modele=Mod;
        Marque=Mar;
        PuissanceCV=PCV;
    }
    
    @Override
    public String toString () {
        return "type de Voiture: "+Modele+", de chez "+Marque+". Puissance CV: "+PuissanceCV;
    }
}
