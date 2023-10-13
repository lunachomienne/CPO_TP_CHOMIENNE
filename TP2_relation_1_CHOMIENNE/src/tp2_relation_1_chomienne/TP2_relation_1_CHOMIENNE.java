/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_chomienne;

/**
 *
 * luna chomienne TDB 13/10/2023
 */
public class TP2_relation_1_CHOMIENNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;   // on cree les nouveaux objets de la classe voiture
    Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
    Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
    Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
    Voiture unePorsche= new Voiture("911 Cayenne", "Porsche", 10);
    Personne bob = new Personne("Bobby", "Sixkiller");
    Personne reno = new Personne("Reno", "Raines");
    //System.out.println("liste des voitures disponibles: \n"+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;   
    
    //bob.liste_voitures[0] = uneClio ;
    //bob.nbVoitures = 1 ;
    //uneClio.Proprietaire = bob ;
    
    //System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] ) ;

    //bob.liste_voitures[1]=uneAutreClio;
    //bob.nbVoitures= 2;
    //uneAutreClio.Proprietaire= bob;
    //System.out.println("La deuxieme voiture de Bob est "+ bob.liste_voitures[1] );
    
    reno.ajouter_voiture(uneMicra);
    reno.ajouter_voiture(une2008);
    reno.ajouter_voiture(unePorsche);
    reno.ajouter_voiture(uneAutreClio); // le garage de reno est plein car on essaye d'ajouter une quatrieme voiture
    
    bob.ajouter_voiture(uneClio);
    bob.ajouter_voiture(uneAutreClio);    
    }
    
}
