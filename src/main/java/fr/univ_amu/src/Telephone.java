
import java.util.*;

public class Telephone {

/**
 * <b>Telephone est une classe représentant le telephone.</b>
 *  <p>

 * Les caractèristiques du téléphone sont caractérisées par les informations suivantes :

 * </p>

 * <ul>

 *      <li>Un modèle unique qui est celui du téléphone.</li>
 *
 *      <li>Une version, susceptible d'être mise à jour.</li>
 *
 *
 * </ul>

public class Telephone {
    /**
     * Le modele est unique et n'est pas modifiable
     */
    private String Modele;

    /**
     * La version du telephone. Cette version est modifiable.
     */
    private String Version;

    /**
     * Constructeur par défaut
     */
    public Telephone() {
    }


    /**
     *Transmet l'information sur le fait qu'il faut changer d'interface
     */

    public void transmettreInfoChangerInterface() {

    }

    /**
     * Transmet à l'ordinateur qu'il faut changer la diapositive.
     * L'ordinateur utilisera par la suite la méthode transmettreInfoChangerDiapo de sa propre classe.
     */
    public void transmettreInfoChangerDiapo() {

    }

    /**
     * Permet à l'utilisateur d'accéder aux réglages
     */
    public void reglage(){

    }

/**
 * Permet à l'utilisateur de choisir les changements et les réglages qu'il souhaite appliquer.
 */
    public void reglageChoisi() {

    }


/**
 * Applique les changements séléctionnés et choisis préalablement
 */
    public void appliquerChangement(){

    }


/**
 * Quitte les réglages et retourne à l'écran précédent.
 */
    public void quitterReglage() {

    }

}