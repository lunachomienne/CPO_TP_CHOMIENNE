/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;



/**
 *
 * @author lunac
 */

public class Baton extends Arme {
    
    public int age; 
    
    public Baton(String pseudo, int niv, int nb) {
        super(pseudo, niv);
        age=nb;
       
        
    }

    @Override
    public String toString() {
        return "Baton{" + "age=" + age +", niveau d'attaque="+ nivAttaque+ ", nom="+nom+ '}';
    }
    
}
