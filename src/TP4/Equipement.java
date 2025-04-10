package TP4;
import TP3.Type;
import java.util.Vector;


public class Equipement {
    private int numSerie;
    private String designation;
    private double prix;
    private Type typeEquip;
    private Vector<Composant> listeComposants = new Vector<>();
    private Vector<Fournisseur> listeFournisseurs = new Vector<>();

    public Equipement(int numSerie, String designation, double prix, Type typeEquip) {
        this.numSerie = numSerie;
        this.designation = designation;
        this.prix = prix;
        this.typeEquip = typeEquip;
    }

    public Equipement(int numSerie, String designation, double prix, Type typeEquip, Vector<Composant> listeComposants) {
        this(numSerie, designation, prix, typeEquip);
        if (listeComposants != null) this.listeComposants = listeComposants;
    }

    public void ajouterComposant(Composant c) {
        listeComposants.add(c);
    }

    public void supprimerComposant(Composant c) {
        listeComposants.remove(c);
    }

    public void afficherListeComposants() {
        for (Composant c : listeComposants) {
            System.out.println(c);
        }
    }

    public void ajouterFournisseur(Fournisseur f) {
        listeFournisseurs.add(f);
    }

    public void supprimerFournisseur(Fournisseur f) {
        listeFournisseurs.remove(f);
    }

	public double getPrix() {
		// TODO Auto-generated method stub
		return 0;
	}
}

