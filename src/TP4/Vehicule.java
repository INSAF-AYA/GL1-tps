package TP4;

public class Vehicule {
    private int numImmatricule;
    private String marque;
    private Technicien technicien;

    public Vehicule(int numImmatricule, String marque) {
        this.numImmatricule = numImmatricule;
        this.marque = marque;
    }

    public void ajouterTechnicien(Technicien t) {
        this.technicien = t;
    }
}

