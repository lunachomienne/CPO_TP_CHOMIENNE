/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_chomienne_version_console;

import java.util.Random;

/**
 *
 * @author lunac
 */

public class GrilleDeJeu {
    
    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;
    
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes){
        nbLignes=p_nbLignes;
        nbColonnes=p_nbColonnes;
        matriceCellules=new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i=0; i<nbLignes; i++){
            for (int j=0; j<nbColonnes; j++){
                matriceCellules[i][j]=new CelluleLumineuse();
            }
        }
    }
    
    public void eteindreToutesLesCellules(){
        for (int i=0; i<nbLignes; i++){
            for (int j=0; j<nbColonnes; j++){
                ((CelluleLumineuse)matriceCellules[i][j]).eteindreCellule();
            }
    }
    }
    
    public void activerLigneColonneOuDiagonaleAleatoire(){
        Random generateurAleat = new Random();
        int nb = generateurAleat.nextInt(3);
        if (nb==1){
            int ligne = generateurAleat.nextInt(nbLignes); 
            for (int j=0; j<nbColonnes; j++){
               ((CelluleLumineuse)matriceCellules[ligne][j]).activerCellule();
            }
        }
        if (nb==2){
            int colonne=generateurAleat.nextInt(nbColonnes);
            for (int i=0; i<nbLignes; i++){
                ((CelluleLumineuse)matriceCellules[i][colonne]).activerCellule();
            }
        }
        else{
            if (nbLignes==nbColonnes){
               int diagonale=generateurAleat.nextInt(nbLignes);
               for (int i=0; i<nbLignes; i++){
                   for (int j=0; j<nbColonnes; j++){
                       if (i==j){
                           ((CelluleLumineuse)matriceCellules[i][j]).activerCellule();
                       }
                   }
               }
            }
            
        }
    }
    
}
