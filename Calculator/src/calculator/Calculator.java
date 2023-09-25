/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * lunachomienne TDB 25/09/2023
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter the operator:"+"\n1) add"+"\n2) substract"+"\n3) multiply"+"\n4) divide"+"\n5) modulo");
        
        int operateur ;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Saisissez un operateur par son numero :");
        operateur=sc.nextInt();
        if (operateur<1 || operateur>5){
            System.out.println("Erreur. Veillez saisir 1, 2, 3, 4 ou 5.");
            System.exit(0);
        }
            
            
        int operande1;
        Scanner mess1 = new Scanner(System.in);
        System.out.println("\n Saisissez une premiere valeur :");
        operande1=sc.nextInt();
        
        int operande2;
        Scanner mess2 = new Scanner(System.in);
        System.out.println("\n Saisissez une seconde valeur :");
        operande2=sc.nextInt();
        
        int result;
        if (operateur==1){
           result=operande1+operande2;
           System.out.println("The result is : "+result);
        }
        if (operateur==2){
           result=operande1-operande2;
           System.out.println("The result is : "+result);
        }
        if (operateur==3){
           result=operande1*operande2; 
           System.out.println("The result is : "+result);
        }
        if (operateur==4){
           result=operande1/operande2; 
           System.out.println("The result is : "+result);
        }
        if (operateur==5){
           result=operande1%operande2; 
           System.out.println("The result is : "+result);
        }
        
              
    }
    
}
