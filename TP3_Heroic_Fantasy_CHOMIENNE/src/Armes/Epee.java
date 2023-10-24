/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author lunac
 */
public class Epee extends Arme{
    
    public int finesse;
    
    public Epee(String pseudo, int niv, int fin) {
        super(pseudo, niv);
        finesse=fin;
    }
    
    @Override
    public String toString() {
        return "Epee{" + "finesse=" + finesse +", niveau d'attaque="+ nivAttaque+ ", nom="+nom+ '}';
}
    }
