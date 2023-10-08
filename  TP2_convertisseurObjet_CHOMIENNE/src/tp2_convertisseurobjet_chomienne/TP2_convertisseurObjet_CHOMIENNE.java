/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_chomienne;

import java.util.Scanner;

/**
 *
 * lunachomienne TDB 08/10/2023
 */
public class TP2_convertisseurObjet_CHOMIENNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int conv;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Bonjour! Selectionnez la conversion que vous souhaitez effectuer :"+"\n1) De Celcius vers Kelvin"+"\n2) De Kelvin vers Celcius"+"\n3) De Celcius vers Fahrenheit"+"\n4) De Fahrenheit vers Celcius"+"\n5) De Kelvin vers Fahrenheit"+"\n6) De Fahrenheit vers Kelvin");
        conv=sc1.nextInt();
        double tempD ; //initialisation variable temp en deg C
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Saisissez une temperature dans l'unite dans depart:");
        tempD=sc2.nextDouble();
        double tempF=0;
        String degD="";
        String degF="";
        
        if (conv<1 || conv>6){
            System.out.println("Erreur. Veillez saisir 1, 2, 3, 4, 5 ou 6.");
            System.exit(0);
        }
        Convertisseur Conv=new Convertisseur();
        
        if (conv==1){
           tempF=Conv.CelciusVersKelvin(tempD);
           degD="Celcius";
           degF="Kelvin";
            
        }
        if (conv==2){
           tempF=Conv.KelvinVersCelcius(tempD);
           degF="Celcius";
           degD="Kelvin";
            
        }
        if (conv==3){
           tempF=Conv.CelciusVersFahrenheit(tempD);
           degD="Celcius";
           degF="Fahrenheit"; 
        }
        if (conv==4){
           tempF=Conv.FahrenheitVersCelcius(tempD);
           degF="Celcius";
           degD="Fahrenheit"; 
        }
        if (conv==5){
           tempF=Conv.KelvinVersFahrenheit(tempD);
           degD="Kelvin";
           degF="Fahrenheit"; 
        }
        if (conv==6){
           tempF=Conv.FahrenheitVersKelvin(tempD);
           degF="Kelvin";
           degD="Fahrenheit";
        }
        System.out.println(tempD+" degres "+degD+" font "+tempF+" degres "+degF);
        System.out.println(Conv);
        
    } 
    
    
}
