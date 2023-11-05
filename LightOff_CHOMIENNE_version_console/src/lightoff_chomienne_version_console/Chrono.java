/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_chomienne_version_console;

/**
 *
 * @author lunac
 */
public class Chrono {
    
    private long tempsDepart=0;
    private long tempsFin=0;
    private long pauseDepart=0;
    private long pauseFin=0;
    private long duree=0;

    /**
     *cette fonction va déclencher le chrono en initialisant les temps à 0
     */
    public void start()
        {
        tempsDepart=System.currentTimeMillis();
        tempsFin=0;
        pauseDepart=0;
        pauseFin=0;
        duree=0;
        }

    /**
     *cette fonction créee le principe de la "pause" 
     */
    public void pause()
        {
        if(tempsDepart==0) {return;}
        pauseDepart=System.currentTimeMillis();
        }

    public void resume()
        {
        if(tempsDepart==0) {return;}
        if(pauseDepart==0) {return;}
        pauseFin=System.currentTimeMillis();
        tempsDepart=tempsDepart+pauseFin-pauseDepart;
        tempsFin=0;
        pauseDepart=0;
        pauseFin=0;
        duree=0;
        }
        
    /**
     *cette fonction va fixer le temps entre le début et la fin (quand cette fonction est appelée) appelée la durée et va réinitialer tous les attributs de la classe à 0
     */
    public void stop()
        {
        if(tempsDepart==0) {return;}
        tempsFin=System.currentTimeMillis();
        duree=(tempsFin-tempsDepart) - (pauseFin-pauseDepart);
        tempsDepart=0;
        tempsFin=0;
        pauseDepart=0;
        pauseFin=0;
        }        

    /**
     *cette fonction donne la durée en secondes
     * @return renvoie une durée en seconde
     */
    public long getDureeSec()
        {
        return duree/1000;
        }
           
    public static String timeToHMS(long tempsS) {

        // IN : (long) temps en secondes
        // OUT : (String) temps au format texte : "1 h 26 min 3 s"

        double h = tempsS / 3600;
        double m = (tempsS % 3600) / 60;
        double s = tempsS % 60;

        String r="";

        if(h>0) {r+=h+" h ";}
        if(m>0) {r+=m+" min ";}
        if(s>0) {r+=s+" s";}
        if(h<=0 && m<=0 && s<=0) {r="0 s";}

        return r;
        }
    /**
     *
     * @return
     */
    public String getDureeTxt()
        {
        return timeToHMS(getDureeSec());
        }

    /**
     *cette fonction permet d'avoir la durée du chrono en un texte d'heures, minutes, secondes
     * @param tempsS prend le temps en seconde
     * @return renvoie une durée du format H/M/S
     */
    

    } // class Chrono

