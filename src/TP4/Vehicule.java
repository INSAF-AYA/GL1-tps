package TP4;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;


public class Vehicule {
    private int numImmatricule;
    private String marque;
    private Technicien technicien;
	private Date dateAcquisition;

    public Vehicule(int numImmatricule, String marque) {
        this.numImmatricule = numImmatricule;
        this.marque = marque;
    }

    public void ajouterTechnicien(Technicien t) {
        this.technicien = t;
    }
    
    public void setDateAcquisition(Date date) {
        this.dateAcquisition = date;
    }

    public boolean reformer(Vehicule vehicule) {
        return true;
    }

}

