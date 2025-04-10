package TP5;

public abstract class Utilisateur {
    private String nom, prenom, email, pseudo, motPass;

    public Utilisateur(String nom, String prenom, String email, String pseudo) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.pseudo = pseudo;
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getEmail() { return email; }
    public String getPseudo() { return pseudo; }
    public String getMotPass() { return motPass; }
    public void setMotPass(String motPass) { this.motPass = motPass; }

    public abstract void changerPassword();
    public abstract String toString();
}

