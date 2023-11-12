
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JLabel;
import lightoff_chomienne_version_console.Chrono;
import lightoff_chomienne_version_console.GrilleDeJeu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author lunac
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form FenetrePrincipale
     */
    GrilleDeJeu grille;
    int nbCoups;
    int rest_coups;
    Chrono chrono = new Chrono();;

    public void initialiserPartie(int niv, int coups) {
        
        if (niv==1){
            grille.melangerMatriceAleatoirement(15);
            rest_coups=coups;
            coupsRestants.setText("Il vous reste "+ rest_coups+" coups.");
        }
        if (niv==2){
            grille.melangerMatriceAleatoirement(40);
            rest_coups=coups;
            coupsRestants.setText("Il vous reste "+ rest_coups+" coups.");
        }
        if (niv==3){
            grille.melangerMatriceAleatoirement(70);
            rest_coups=coups;
            coupsRestants.setText("Il vous reste "+ rest_coups+" coups.");
        }
        if (niv==4){
            grille.melangerMatriceAleatoirement(50);
            rest_coups=coups;
            coupsRestants.setText("Il vous reste "+ rest_coups+" coups.");
        }
    }

    public FenetrePrincipale(int lignes, int colonnes, int niv, int coups) {

        initComponents();

        int nbLignes = lignes;
        int nbColonnes = colonnes;
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, nbColonnes * 40, nbLignes * 40));
        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes+2, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1 * 40, (nbLignes+2) * 40));
        this.pack();
        this.revalidate();
        
        chrono.start(); // démarrage du chrono
        
        
        JButton boutonDD = new JButton();

        ActionListener ecouteurClickDD = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerDiagonaleDescendante();
                repaint();
                boolean verif;
                verif=EtatGrille();
                if (verif==true){
                    chrono.stop(); // arrêt
                    long temps;
                    temps=chrono.getDureeSec();

                }
            }
        };
        boutonDD.addActionListener(ecouteurClickDD);

        PanneauBoutonsVerticaux.add(boutonDD);

        for (int i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            bouton_ligne.setText(""+(i+1));
            int j = i;
            ActionListener ecouteurClick1 = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    repaint();
                    boolean verif;
                    verif=EtatGrille();
                    if (verif==true){
                        chrono.stop(); // arrêt
                        long temps;
                        temps=chrono.getDureeSec();

                    }
                }
            };
            bouton_ligne.addActionListener(ecouteurClick1);
            PanneauBoutonsVerticaux.add(bouton_ligne);

        }
        JButton boutonDM = new JButton();

        ActionListener ecouteurClickDM = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerDiagonaleMontante();
                repaint();
                boolean verif;
                verif=EtatGrille();
                if (verif==true){
                    chrono.stop(); // arrêt
                    long temps;
                    temps=chrono.getDureeSec();
              
                }else{
                    if (chrono.getDureeSec()>20){
                        
                    }
                }
               
            }
        };
        boutonDM.addActionListener(ecouteurClickDM);
        PanneauBoutonsVerticaux.add(boutonDM);

        
        PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, nbColonnes * 40, 40));
        this.pack();
        this.revalidate();
        for (int i = 0; i < nbColonnes; i++) {
            JButton bouton_colonne = new JButton();
            bouton_colonne.setText(""+(i+1));
            int j = i;
            ActionListener ecouteurClick2 = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    repaint();
                    boolean verif;
                    verif=EtatGrille();
                    if (verif==true){
                        chrono.stop(); // arrêt
                        long temps;
                        temps=chrono.getDureeSec();

                        chrono.getDureeSec();
                    }
                }
            };
            bouton_colonne.addActionListener(ecouteurClick2);
            PanneauBoutonsHorizontaux.add(bouton_colonne);

        }

        this.pack();
        this.revalidate();
        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
        initialiserPartie(niv,coups);
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 36, 36); // création d'un bouton
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        coupsRestants = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(255, 204, 204));
        PanneauGrille.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 360, 360));
        PanneauGrille.getAccessibleContext().setAccessibleName("");

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, 360));

        PanneauBoutonsHorizontaux.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 360, 30));

        coupsRestants.setBackground(new java.awt.Color(255, 255, 51));
        coupsRestants.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        coupsRestants.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        coupsRestants.setFocusTraversalPolicyProvider(true);
        getContentPane().add(coupsRestants, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 360, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean EtatGrille() {

        nbCoups += 1;
        rest_coups-=1;
        coupsRestants.setText("Il vous reste "+ rest_coups+" coups.");

        if (grille.cellulesToutesEteintes() == true) {
            this.dispose();
            chrono.stop();
            String temp;
            temp=chrono.getDureeTxt();
            fenetreVictoire f = new fenetreVictoire(nbCoups, temp, chrono);
            
            f.setVisible(true);
            return true;
        }
        
        if (rest_coups==0 || chrono.getDureeSec()>5){
            chrono.stop();
            FenetreDefaite f=new FenetreDefaite();
            f.setVisible(true);
            this.dispose();
        }

        return false;
}
    
    

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JLabel coupsRestants;
    // End of variables declaration//GEN-END:variables
}
