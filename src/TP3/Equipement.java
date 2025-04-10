package TP3;
import java.util.Date;
import java.util.Vector;
import TP4.Fournisseur;

public class Equipement {
    private int numSerie;
    private String designation;
    private Type typeEquip;
    private Vector<Composant> listeComposants = new Vector<>();
    private Vector<Fournisseur> listeFournisseurs = new Vector<>();

    public Equipement(int numSerie, String designation, Type typeEquip) {
        this.numSerie = numSerie;
        this.designation = designation;
        this.typeEquip = typeEquip;
    }

    public Equipement(int numSerie, String designation, Type typeEquip, Vector<Composant> listeComposants) {
        this(numSerie, designation, typeEquip);
        if (listeComposants != null)
            this.listeComposants = listeComposants;
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

    public class Composant {
        private int refComposant;
        private String nomComposant;
        private Date dateFabrication;
        private int dureeVie;
        private double prixComposant;
        private Etat etatComposant;

        public Composant() {}

        public Composant(int refComposant, String nomComposant, Date dateFabrication, int dureeVie, double prixComposant, Etat etatComposant) {
            this.refComposant = refComposant;
            this.nomComposant = nomComposant;
            this.dateFabrication = dateFabrication;
            this.dureeVie = dureeVie;
            this.prixComposant = prixComposant;
            this.etatComposant = etatComposant;
        }

        public void remplacer(Composant c) {
            this.refComposant = c.refComposant;
            this.nomComposant = c.nomComposant;
            this.dateFabrication = c.dateFabrication;
            this.dureeVie = c.dureeVie;
            this.prixComposant = c.prixComposant;
            this.etatComposant = c.etatComposant;
        }

        public boolean estFonctionnel() {
            return this.etatComposant == Etat.Fonctionnel;
        }

        @Override
        public String toString() {
            return "Composant{" +
                    "ref=" + refComposant +
                    ", nom='" + nomComposant + '\'' +
                    ", fabrication=" + dateFabrication +
                    ", dureeVie=" + dureeVie +
                    ", prix=" + prixComposant +
                    ", etat=" + etatComposant +
                    '}';
        }
    }
}
