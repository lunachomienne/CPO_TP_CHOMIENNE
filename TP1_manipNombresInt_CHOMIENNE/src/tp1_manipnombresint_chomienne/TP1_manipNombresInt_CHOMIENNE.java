/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_chomienne;

import java.util.Scanner;

/**
 *
 * lunachomienne TDB 26/09/2023
 */
public class TP1_manipNombresInt_CHOMIENNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nb1 ;
        int nb2 ;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\n Saisissez un premier entier  :");
        nb1=sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("\n Saisissez un deuxieme entier  :");
        nb2=sc2.nextInt();
        
        int somme;
        int dif;
        int prod;
        int quot;
        int reste;
        somme=nb1+nb2;
        dif=nb1-nb2;
        prod=nb1*nb2;
        quot=nb1/nb2;
        reste=nb1%nb2;
        
        System.out.println("Voici la somme de ces nombres: "+somme+"\nVoici la difference de ces nombres: "+dif+"\nVoici leur produit: "+prod);
        System.out.println("Voici le quotient de la division euclidienne de "+nb1+" par "+nb2+" : "+quot+" et le reste : "+reste);
    }
    
}
