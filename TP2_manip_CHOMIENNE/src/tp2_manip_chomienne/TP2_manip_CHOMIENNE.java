/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_chomienne;

/**
 *
 * @author lunac
 */
public class TP2_manip_CHOMIENNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        
        Tartiflette assiette3 = assiette2 ;
        
        Tartiflette assiette3+=300;
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        
        //Moussaka assiette666 = assiette1 ;  NE FONCTIONNE PAS
        //Moussaka assiette667 = new Tartiflette() ;  NE FONCTIONNE PAS
        
        Moussaka []Tab=new Moussaka [10];
        


    }
    
}
