/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_chomienne_version_console;

/**
 *
 * @author lunac
 */
public class CelluleLumineuse {
    
    private boolean etat;
    
    /**
     *le constructeur de la classe, initialise l'état de la cellule à "éteint" (ou false).
     */
    public CelluleLumineuse(){
        etat=false;
    }
    
    /**
     *active une cellule, c'est à dire qu'elle va la passer dans l'état opposé à celui qu'elle était avant la fonction.
     */
    public void activerCellule(){
        if (etat==true){
            etat=false;
        }else{
            etat=true;
        }
    }
    
    /**
     *cette fonction passe la cellule dans l'état "éteint".
     */
    public void eteindreCellule(){
        etat=false;
    }
    
    /**
     *cette fonction verifie si la cellule est éteinte. 
     * @return Si elle n'est pas éteinte, elle renvoie false, et true dans le cas contraire(elle est bien éteinte).
     */
    public boolean estEteint(){
        if (etat==true){
            return false;
        }else{
            return true;
        }
    }
    
    /**
     *cette fonction permet de recupérer l'état de la cellule.
     * @return Elle renvoie false si la cellule est éteinte, et true si elle est allumée.
     */
    public boolean getEtat(){
        return etat;
    }
    
    /**
     *cette fonction formate l'état de la cellule. 
     * @return Si la cellule lumineuse est éteinte, elle renvoie 0, si elle est allumée, elle renvoie X.
     */
    @Override
    public String toString () {
        if (getEtat()==true){
            return "X";
        }else{
            return "O";
        }
    }
}
