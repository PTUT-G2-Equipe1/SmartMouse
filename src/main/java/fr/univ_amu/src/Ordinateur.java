
import java.util.*;
/**
 *
 * <b>Ordinateur est la classe représentant un ordinateur</b>

 * <p>

 * Les caractèristiques de l'ordinateur sont caractérisées par les informations suivantes :

 * </p>

 * <ul>

 *      <li>Un nom unique est attribué à l'ordinateur.</li>
 *      <li>Une version, susceptible d'être mise à jour.</li>
 *      <li>Un modèle unique qui est celui du téléphone.</li>

 * </ul>

 */
public class Ordinateur {

    /**
     * Le nom de l'ordinateur. Ce nom est unique et n'est pas modifiable.
     */

    private String Nom;

    /**
     * La version de l'ordinateur. Cette version est modifiable.
     */
    private String Version;

    /**
     * Le modele est unique et n'est pas modifiable
     */
    private String Modele;

    /**
     * Constructeur par défaut
     */
    public Ordinateur() {
    }


    /**
     * Transmet au logiciel utilisé pour les diaporama qu'il faut changer de diapositive
     */
    public void transmettreInfoChangerDeDiapo() {

    }


    /**
     * Envoie un mot de passe à l'autre périphérique pour permettre une connexion sécurisée.
     */
    public void renvoyerLeMotDePasse() {
        //Pas de void car on renvoi un message
    }


    /**
     * Valide si le mot de passe entré est le bon ou non.
     */
    public void validerLeMotDePasse(){

    }

    /**
     * Coupe la connexion entre l'ordinateur et le téléphone utilisé pour l'application.
     */
    public void seDeconnecter() {

    }


}