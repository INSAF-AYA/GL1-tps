package TP4;

import java.util.Date;

import TP3.Etat;

public class Composant {
    private int réfComposant;
    private String nomComposant;
    private Date dateFabrication;
    private int duréeVie;
    private double prixComposant;
    private Etat etatComposant;

    public Composant(int réfComposant, String nomComposant, Date dateFabrication, int duréeVie, double prixComposant, Etat etatComposant) {
        this.réfComposant = réfComposant;
        this.nomComposant = nomComposant;
        this.dateFabrication = dateFabrication;
        this.duréeVie = duréeVie;
        this.prixComposant = prixComposant;
        this.etatComposant = etatComposant;
    }

	public int getRéfComposant() {
		return réfComposant;
	}

	public void setRéfComposant(int réfComposant) {
		this.réfComposant = réfComposant;
	}

	public String getNomComposant() {
		return nomComposant;
	}

	public void setNomComposant(String nomComposant) {
		this.nomComposant = nomComposant;
	}

	public Date getDateFabrication() {
		return dateFabrication;
	}

	public void setDateFabrication(Date dateFabrication) {
		this.dateFabrication = dateFabrication;
	}

	public int getDuréeVie() {
		return duréeVie;
	}

	public void setDuréeVie(int duréeVie) {
		this.duréeVie = duréeVie;
	}

	public double getPrixComposant() {
		return prixComposant;
	}

	public void setPrixComposant(double prixComposant) {
		this.prixComposant = prixComposant;
	}

	public Etat getEtatComposant() {
		return etatComposant;
	}

	public void setEtatComposant(Etat etatComposant) {
		this.etatComposant = etatComposant;
	}

    
}

