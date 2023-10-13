/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_chomienne;

/**
 *
 * @author lunac
 */
public class Personne {
    
    String nom;
    String prenom;
    int nbVoitures=0 ;
    Voiture [] liste_voitures ;
    
    
    public Personne(String n, String pn){
        
        nom=n;
        prenom=pn;
        liste_voitures = new Voiture [3] ;
        
    }
    
    @Override
    public String toString () {
        return "nom: "+ nom+"\nprenom: "+ prenom;
}
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter){
        if (voiture_a_ajouter.Proprietaire!=null){
            System.out.println("Tentative de vol de voiture par "+nom+ " "+prenom+ " !!");  //si la voiture a deja un proprietaire, on affiche ce message
            return false;
        }
        if (nbVoitures>2){
            System.out.println("Le garage de "+nom+ " est plein!"); //si le garage a deja trois voiture, celui-ci est plein
            return false;
        }
        else{
            liste_voitures[nbVoitures]=voiture_a_ajouter;  //on ajoute la nouvelle voiture au tableau de la liste des voitures du proprietaire
            nbVoitures+=1;
            voiture_a_ajouter.Proprietaire = this ;
            String combien=null;
            if (nbVoitures==1){
                combien="premiere";
            }
            if(nbVoitures==2){
                combien="deuxieme";
            }
            if (nbVoitures==3){
                combien="troisieme";
            }
            
            System.out.println("La "+combien+" voiture de "+ nom+ " est "+voiture_a_ajouter);
            return true;
        }
    }

}
