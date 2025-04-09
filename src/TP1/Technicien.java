package TP1;

public class Technicien extends Personne {
    private int matricule;
    private Specialite specialite;

    public Technicien(String nom, String prenom, String email, String login, String password, int matricule, Specialite specialite) {
        super(nom, prenom, email, login, password);
        this.matricule = matricule;
        this.specialite = specialite;
    }
    public Technicien(){
    }

    public int getMatricule(){
        return matricule;
    }

    public Specialite getSpecialite(){
        return specialite;
    }

    public void setMatricule(int matricule){
        this.matricule = matricule;
    }

    public void setSpecialite(Specialite specialite){
        this.specialite = specialite;
    }

    @Override
    public String toString(){
        return super.toString() + "Matricule: " + this.getMatricule() + ", TP1.Specialite: " + this.getSpecialite();
    }

    @Override
    public void afficher(){
        System.out.println(this.toString());
    }
}