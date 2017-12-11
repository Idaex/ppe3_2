/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gbsperso2;

/**
 *
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

}
