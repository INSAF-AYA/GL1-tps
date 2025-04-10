package TP5;

public class ChefAtelier extends Utilisateur {
    private int nbExperience;
    private String datePromotion, dateExperience, statut;

    public ChefAtelier(String nom, String prenom, String email, String pseudo, int nbExperience, String datePromotion, String dateExperience, String statut) {
        super(nom, prenom, email, pseudo);
        this.nbExperience = nbExperience;
        this.datePromotion = datePromotion;
        this.dateExperience = dateExperience;
        this.statut = statut;
    }

    public int getNbExperience() { return nbExperience; }
    public String getDatePromotion() { return datePromotion; }
    public String getDateExperience() { return dateExperience; }
    public String getStatut() { return statut; }

    @Override
    public void changerPassword() {
        this.setMotPass(this.getPseudo() + this.statut);
    }

    @Override
    public String toString() {
        return "[Le chef d’atelier est : " + getNom() + " " + getPrenom() +
               ", son email est: " + getEmail() +
               ", son pseudo est : " + getPseudo() +
               ", son mot de passe est : " + getMotPass() +
               ", Expérience : " + nbExperience +
               ", Date promotion : " + datePromotion +
               ", Date expérience : " + dateExperience +
               ", Statut : " + statut + "]";
    }
}

