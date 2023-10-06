/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_chomienne;

/**
 *
 * @author lunac
 */
public class TP2_Bieres_CHOMIENNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BouteilleBiere uneBiere= new BouteilleBiere();
        uneBiere.nom = "Cuvee des trolls";
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie="Dubuisson";
        uneBiere.ouverte=false;
        
        uneBiere.lireEtiquette();

        BouteilleBiere secondeBiere= new BouteilleBiere();
        secondeBiere.nom="Leffe";
        secondeBiere.degreAlcool=6.6;
        secondeBiere.brasserie="Abbaye de Leffe";
        
        secondeBiere.lireEtiquette();
    }
    
}
