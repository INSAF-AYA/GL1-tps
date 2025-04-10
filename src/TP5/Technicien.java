package TP5;

public class Technicien extends Utilisateur {
    private String matricule;
    private String specialite;

    public Technicien(String nom, String prenom, String email, String pseudo, String matricule, String specialite) {
        super(nom, prenom, email, pseudo);
        this.matricule = matricule;
        this.specialite = specialite;
    }

    public String getMatricule() { return matricule; }
    public String getSpecialite() { return specialite; }

    @Override
    public void changerPassword() {
        this.setMotPass(this.getPseudo() + this.specialite);
    }

    @Override
    public String toString() {
        return "[Le technicien est : " + getNom() + " " + getPrenom() +
               ", son email est: " + getEmail() +
               ", son pseudo est : " + getPseudo() +
               ", son mot de passe est: " + getMotPass() +
               ", son matricule est : " + matricule +
               ", et sa spécialité est: " + specialite + "]";
    }
}

