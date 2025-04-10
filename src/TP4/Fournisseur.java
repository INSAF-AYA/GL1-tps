package TP4;
import java.util.Vector;
import TP3.Equipement;


public class Fournisseur {
    private int numRC;
    private String raisonSocial;
    private String adresse;
    private double capital;
    private Vector<Equipement> equipements;

    public Fournisseur(int numRC, String raisonSocial, String adresse, double capital, Vector<Equipement> equipements) {
        this.numRC = numRC;
        this.raisonSocial = raisonSocial;
        this.adresse = adresse;
        this.capital = capital;
        this.equipements = equipements;
    }

    public void ajouterEquipement(Equipement e) {
        equipements.add(e);
    }

    public void supprimerEquipement(Equipement e) {
        equipements.remove(e);
    }
}
