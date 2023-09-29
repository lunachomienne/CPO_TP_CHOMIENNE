/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_chomienne;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * lunachomienne TDB 29/09/2023
 */
public class TP1_stats_CHOMIENNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []de= new int[6];
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un nombre entier.");
        m = sc.nextInt();
        
        
        for (int i=0; i<m; i++){
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(6);
            if (n==0){
                de[0]=de[0]+1;
                
            }
            if (n==1){
                de[1]=de[1]+1;
                
            }
            if (n==2){
                de[2]=de[2]+1;
                
            }
            if (n==3){
                de[3]=de[3]+1;
                
            }
            if (n==4){
                de[4]=de[4]+1;
                
            }
            if (n==5){
                de[5]=de[5]+1;
                
            }
        }
        
        for (int i=0; i<de.length; i++){
            double dpourcentage;
            dpourcentage=de[i]/m*100;
            
            System.out.println(dpourcentage);
        }
    }
    
}
