/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author lunac
 */
public abstract class Arme {
    
    String nom;
    int nivAttaque;
    
    public Arme(String pseudo, int niv){
        nom=pseudo;
        nivAttaque=niv;
    }
    
    @Override
    public String toString () {
        return "L'arme "+nom+ " a une puissance de "+nivAttaque;
    }
}
