package TP1;

import java.util.Date;

public class ChefAtelier extends Personne {
    private int nbExperience;
    private Date dateExperience;
    private Date datePromotion;
    private Status status;

    public ChefAtelier(String nom, String prenom, String email, String login, String password, int nbExperience, Date dateExperience, Date datePromotion, Status status) {
        super(nom, prenom, email, login, password);
        this.nbExperience = nbExperience;
        this.dateExperience = dateExperience;
        this.datePromotion = datePromotion;
        this.status = status;
    }
    public ChefAtelier(){
    }

    public int getNbExperience() {
        return nbExperience;
    }

    public Date getDateExperience() {
        return dateExperience;
    }
    public Date getDatePromotion() {
        return datePromotion;
    }

    public Status getStatus(){
        return status;
    }

    public void setNbExperience(int nbExperience) {
        this.nbExperience = nbExperience;
    }

    public void setDateExperience(Date dateExperience) {
        this.dateExperience = dateExperience;
    }

    public void setDatePromotion(Date datePromotion) {
        this.datePromotion = datePromotion;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return super.toString() + ", NbExperience: " + this.getNbExperience()+ ", DateExperience: " + this.getDateExperience() +
                ", DatePromotion: " + this.getDatePromotion() + ", Statut: " + this.getStatus();
    }

    @Override
    public void afficher() {
        System.out.println(this.toString());
    }

    public int miseAJourExperience(Date dateExp) {
    	int difference= (int)(Math.abs((dateExp.getTime() - this.getDateExperience() .getTime())/(86400000)));
    	if ((difference>=365)&& (this.status==Status.Actif)){
    		this.nbExperience=(int)(difference/365);
    	}
    	return this.nbExperience;
    }
}

