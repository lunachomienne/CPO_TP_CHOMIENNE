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
    
    public CelluleLumineuse(){
        etat=false;
    }
    
    public void activerCellule(){
        if (etat==true){
            etat=false;
        }else{
            etat=true;
        }
    }
    
    public void eteindreCellule(){
        etat=false;
    }
    
    public boolean estEteint(){
        if (etat==true){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean getEtat(){
        return etat;
    }
    
     @Override
    public String toString () {
        if (getEtat()==true){
            return "X";
        }else{
            return "O";
        }
    }
}
