/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_chomienne_version_console;

import java.util.ArrayList;
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
                matriceCellules[i][j].eteindreCellule();
            }
    }
    }
    
    public void activerLigneColonneOuDiagonaleAleatoire(){
        Random generateurAleat = new Random();
        int nb = generateurAleat.nextInt(3);
        if (nb==1){
            int ligne = generateurAleat.nextInt(nbLignes); 
            for (int j=0; j<nbColonnes; j++){
               matriceCellules[ligne][j].activerCellule();
            }
        }
        if (nb==2){
            int colonne=generateurAleat.nextInt(nbColonnes);
            for (int i=0; i<nbLignes; i++){
                matriceCellules[i][colonne].activerCellule();
            }
        }
        else{
            if (nbLignes==nbColonnes){
               int diagonale=generateurAleat.nextInt(nbLignes);
               for (int i=0; i<nbLignes; i++){
                   for (int j=0; j<nbColonnes; j++){
                       if (i==j){
                           matriceCellules[i][j].activerCellule();
                       }
                   }
               }
            }
            
        }
    }
    
    public GrilleDeJeu melangerMatriceAleatoirement(int nbTours){
        this.eteindreToutesLesCellules();
        for (int i=0; i<nbTours; i++){
            this.activerLigneColonneOuDiagonaleAleatoire();
        }
        return this;
    }
    
    public void activerLigneDeCellules(int idLigne){
        for (int j=0; j<nbColonnes; j++){
               matriceCellules[idLigne][j].activerCellule();
    }
    
    }
    
    public void activerColonneDeCellules(int idColonne){
        for (int i=0; i<nbLignes; i++){
               matriceCellules[i][idColonne].activerCellule();
    }
    }
    
    public void activerDiagonaleDescendante(){
        for (int i=0; i<nbLignes; i++){
            matriceCellules[i][i].activerCellule();
          }
    }
    
    public void activerDiagonaleMontante(){
        for (int i=0; i<nbLignes; i++){
            matriceCellules[i][nbColonnes-1-i].activerCellule();
    
        }
    }
    public boolean cellulesToutesEteintes(){
        boolean tot=true;
        boolean etat;
        for (int i=0; i<nbLignes; i++){
            for (int j=0; j<nbColonnes; j++){
                etat=matriceCellules[i][j].getEtat();
                if (etat==true){
                    tot=false;
                }
            }
        }
        return tot;
    }
    
     @Override
    public String toString () {
        ArrayList<Integer> numlignes=new ArrayList<Integer>();
        ArrayList<Integer> numColonnes=new ArrayList<Integer>();
        for (int i=0; i
        return 
    }
        
              

}
