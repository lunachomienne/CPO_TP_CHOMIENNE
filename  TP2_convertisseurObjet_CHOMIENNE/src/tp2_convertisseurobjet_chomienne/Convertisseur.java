/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_chomienne;

import java.util.Scanner;

/**
 *
 * @author lunac
 */
public class Convertisseur {
    
    int nbConversions;
    
    void Convertisseur(){
        nbConversions = 0 ;    
    } 
    
    
    double CelciusVersKelvin(double tempC){
        double tempK;
        tempK=273.15+tempC ;
        nbConversions=nbConversions+1;
        return tempK;  
        
    }
    
    double KelvinVersCelcius(double tempK){
        double tempC;
        tempC=-273.15+tempK ;
        nbConversions=nbConversions+1;
        return tempC;
    }
    
    double CelciusVersFahrenheit(double tempC){
        double tempF;
        tempF=1.8*tempC+32 ;
        nbConversions=nbConversions+1;
        return tempF;
    }
    double FahrenheitVersCelcius(double tempF){
        double tempC;
        tempC=(tempF-32)/1.8 ;
        nbConversions=nbConversions+1;
        return tempC;
    }
    
    double KelvinVersFahrenheit(double tempK){
        double tempF;
        tempF=CelciusVersFahrenheit(KelvinVersCelcius(tempK));
       
        return tempF;
    }
    double FahrenheitVersKelvin(double tempF){
        double tempK;
        tempK=CelciusVersKelvin(FahrenheitVersCelcius(tempF)) ;
        
        return tempK;
    }
    
    @Override
    public String toString () {
        return "nombre de conversions: "+ nbConversions;
    }

    
    }
    
    
    

