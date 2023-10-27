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
    
    /**
     *cette fonction initialise une grille de jeu (qui à le même format qu'une matrice), elle met une cellule lumineuse dans chacune des cases de la grille. 
     * @param p_nbLignes indique le nombre de lignes de la matrice
     * @param p_nbColonnes indique le nombre de colonnes de la matrice
     */
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
    
    /**
     *cette fonction éteint toutes les cellules de la grille, leur état sera donc "éteint".
     */
    public void eteindreToutesLesCellules(){
        for (int i=0; i<nbLignes; i++){
            for (int j=0; j<nbColonnes; j++){
                matriceCellules[i][j].eteindreCellule();
            }
    }
    }
    
    /**
     *cette fonction va mélanger la grille de jeu de manière aléatoire sur un certain nb de tours (à l'aide la fonction activerLigneColonneOuDiagonaleAleatoire de la même classe).
     * @param nbTours correspond au nombre de fois que la fonction activerLigneColonneOuDiagonaleAleatoire() va être appelée.
     * @return renvoie une grille de jeu mélangée de manière aléatoire.
     */
    public GrilleDeJeu melangerMatriceAleatoirement(int nbTours){
        this.eteindreToutesLesCellules();
        for (int i=0; i<nbTours; i++){
            this.activerLigneColonneOuDiagonaleAleatoire();
        }
        return this;
    }
    
    /**
     *active une Ligne choisit par le paramètre idLigne. Les cellules lumineuses de la ligne passe dans l'état opposé à celui qu'elles étaient.
     * @param idLigne numero de la ligne à activer.
     */
    public void activerLigneDeCellules(int idLigne){
        for (int j=0; j<nbColonnes; j++){
               matriceCellules[idLigne][j].activerCellule();
    }
    
    }
    
    /**
     *active une colonne choisit par le paramètre idColonne. Les cellules lumineuses de la colonne passe dans l'état opposé à celui qu'elles étaient.
     * @param idColonne numero de la colonne à activer.
     */
    public void activerColonneDeCellules(int idColonne){
        for (int i=0; i<nbLignes; i++){
               matriceCellules[i][idColonne].activerCellule();
    }
    }
    
    /**
     *active la diagonale descendante; les cellules lumineuses de la diagonale passe dans l'état opposé à celui qu'elles étaient.
     */
    public void activerDiagonaleDescendante(){
        for (int i=0; i<nbLignes; i++){
            matriceCellules[i][i].activerCellule();
          }
    }
    
    /**
     *active la diagonale montante; les cellules lumineuses de la diagonale passe dans l'état opposé à celui qu'elles étaient. 
     */
    public void activerDiagonaleMontante(){
        for (int i=0; i<nbLignes; i++){
            matriceCellules[i][nbColonnes-1-i].activerCellule();
    
        }
    }
    
    /**
     *active une ligne, une colonne ou une diagonale au hasard; les cellules lumineuses de celle-ci passe dans l'état opposé à celui qu'elles étaient.
     */
    public void activerLigneColonneOuDiagonaleAleatoire(){
        Random generateurAleat = new Random();
        int nb = generateurAleat.nextInt(nbLignes);
        if (nb==0){
            int ligne = generateurAleat.nextInt(nbLignes-1); 
            activerLigneDeCellules(ligne);   
        }
        if (nb==1){
            int colonne=generateurAleat.nextInt(nbColonnes-1);
            activerColonneDeCellules(colonne);
        }
        if (nb==2){
            activerDiagonaleDescendante();
        }
        if (nb==3){
            activerDiagonaleMontante();
        }
            
        
    }

    /**
     *cette fonction vérifie que toutes les cellules lumineuses de la grille de jeu soient éteintes.
     * @return Elle renvoie false si au moins une cellule est encore allumée, et true si elles sont toutes éteintes.
     */
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
    
    /**
     *cette fonction s'occupe de formater la matrice de jeu de base en grille, avec des lignes de délimitations et les numeros de lignes et colonnes correspondants.
     * @return elle renvoie la grille de jeu, et s'actualisera après chaque coup.
     */
    @Override
    public String toString () {
        String chaine="   |";
        for (int i=0; i<nbLignes; i++){
            chaine+=" "+(i+1)+" |";
            
        }
        chaine+="\n";
        
        for (int i=0; i<nbLignes+1; i++){
            chaine+="----";
            
        }
        chaine+="\n";
        
        for (int i=0; i<nbLignes; i++){
            chaine+=" "+(i+1)+" |";
            for (int j=0; j<nbColonnes; j++){
                chaine+=" "+matriceCellules[i][j].toString()+" |";
            }
            chaine+="\n";
            for (int k=0; k<nbLignes; k++){
                chaine+="-----"; 
            }
            chaine+="\n";
        }
        return chaine;            

        }
}
