/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gbsperso2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe permettant de créer un objet de type Personne et d'utiliser plusieurs méthodes permettant de comparer des chaines de caractères
 * @author nc
 */
public class Personne {
    private String nom;
    private String prenom;
    private String courriel;
    private String date_de_naissance;
    private String adresse;
    private Integer telephone;
    private Integer anneedentree;
    private Integer roleentreprise;
    private Integer positionentreprise;
    private Integer salaire;
    private String identif;
    private String mdp;
    private String roleentr;
    private String posi;
    
    public Personne(String nom, String prenom, String courriel, String adresse, Integer telephone, Integer anneedentree, Integer roleentreprise, Integer positionentreprise, Integer salaire, String identif, String mdp, String roleentr, String posi) {
        this.nom = nom;
        this.prenom = prenom;
        this.courriel = courriel;
        this.adresse = adresse;
        this.telephone = telephone;
        this.anneedentree = anneedentree;
        this.roleentreprise = roleentreprise;
        this.positionentreprise = positionentreprise;
        this.salaire = salaire;
        this.identif = identif;
        this.mdp = mdp;
        this.roleentr = roleentr;
        this.posi = posi;
    }

    public String getIdentif() {
        return identif;
    }


    public String getRoleentr() {
        return roleentr;
    }

    public void setRoleentr(String roleentr) {
        this.roleentr = roleentr;
    }

    public String getPosi() {
        return posi;
    }

    public void setPosi(String posi) {
        this.posi = posi;
    }

    public void setIdentif(String identif) {
        this.identif = identif;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Personne() {
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public Integer getAnneedentree() {
        return anneedentree;
    }

    public void setAnneedentree(Integer anneedentree) {
        this.anneedentree = anneedentree;
    }

    public Integer getSalaire() {
        return salaire;
    }

    public void setSalaire(Integer salaire) {
        this.salaire = salaire;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(String date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getRoleentreprise() {
        return roleentreprise;
    }

    public void setRoleentreprise(Integer roleentreprise) {
        this.roleentreprise = roleentreprise;
    }

    public Integer getPositionentreprise() {
        return positionentreprise;
    }

    public void setPositionentreprise(Integer positionentreprise) {
        this.positionentreprise = positionentreprise;
    }

    /**
     * Compare 2 chaines de caractères, et retourne un boolean.
     * @param email
     * @return
     */
    public static boolean validateEmail(String email) {

        boolean status = false;
        String EMAIL_PATTERN
                = "^[\\w-\\.+]*[\\w-\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            status = true;
        } else {
            status = false;
        }
        return status;

    }
    
    /**
     * Compare 2 chaines de caractères, et retourne un boolean.
     * @param telephone
     * @return
     */
    public static boolean validateTelephone(String telephone){
        boolean status = false;
        String TELEPHONE_PATTERN
                = "^[0-9]{10}$";
        Pattern pattern = Pattern.compile(TELEPHONE_PATTERN);
        Matcher matcher = pattern.matcher(telephone);
        if (matcher.matches()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    /**
     * Compare 2 chaines de caractères, et retourne un boolean.
     * @param nom
     * @return
     */
    public static boolean validateNom(String nom){
        boolean status = false;
        String NOM_PATTERN
                = "[A-Za-z ]{3,25}";
        Pattern pattern = Pattern.compile(NOM_PATTERN);
        Matcher matcher = pattern.matcher(nom);
        if (matcher.matches()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    /**
     * Compare 2 chaines de caractères, et retourne un boolean.
     * @param prenom
     * @return
     */
    public static boolean validatePrenom(String prenom){
        boolean status = false;
        String PRENOM_PATTERN
                = "[A-Za-z ]{3,25}";
        Pattern pattern = Pattern.compile(PRENOM_PATTERN);
        Matcher matcher = pattern.matcher(prenom);
        if (matcher.matches()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    /**
     * Compare 2 chaines de caractères, et retourne un boolean.
     * @param annee
     * @return
     */
    public static boolean validateAnneeEntree(String annee){
        boolean status = false;
        String ANNEE_PATTERN
                = "[0-9]{4}";
        Pattern pattern = Pattern.compile(ANNEE_PATTERN);
        Matcher matcher = pattern.matcher(annee);
        if (matcher.matches()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    /**
     * Compare 2 chaines de caractères, et retourne un boolean.
     * @param identifiant
     * @return
     */
    public static boolean validateIdentifiant(String identifiant){
        boolean status = false;
        String IDENTIFIANT_PATTERN
                = "^[A-Za-z0-9_]{6,15}$";
        Pattern pattern = Pattern.compile(IDENTIFIANT_PATTERN);
        Matcher matcher = pattern.matcher(identifiant);
        if (matcher.matches()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }
    
    /**
     * Compare 2 chaines de caractères, et retourne un boolean.
     * @param mdp
     * @return
     */
    public static boolean validateMdp(String mdp){
        boolean status = false;
        String MDP_PATTERN
                = "^[A-Za-z0-9_]{6,12}$";
        Pattern pattern = Pattern.compile(MDP_PATTERN);
        Matcher matcher = pattern.matcher(mdp);
        if (matcher.matches()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }
    
}
