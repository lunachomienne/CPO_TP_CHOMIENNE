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
        
        BouteilleBiere uneBiere=new BouteilleBiere("Cuvee des trolls", 7.0, "Duboisson");
        
        uneBiere.ouverte=false;
        uneBiere.lireEtiquette();

        BouteilleBiere secondeBiere= new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        
        secondeBiere.ouverte=false;
        secondeBiere.lireEtiquette();
        
        BouteilleBiere troisiemeBiere= new BouteilleBiere("Heineken", 6.0, "La Valentine");
        
        troisiemeBiere.ouverte=false;
        troisiemeBiere.lireEtiquette();
        
        BouteilleBiere quatriemeBiere= new BouteilleBiere("Desperados", 5.9, "Alken-Maes");
        
        quatriemeBiere.ouverte=false;
        quatriemeBiere.lireEtiquette();
        
        BouteilleBiere cinquiemeBiere= new BouteilleBiere("Kronenbourg", 4.8, "Brasserie Kronenbourg");
        
        cinquiemeBiere.ouverte=false;
        cinquiemeBiere.lireEtiquette();
        cinquiemeBiere.Décapsuler();
        
    }
    
}
