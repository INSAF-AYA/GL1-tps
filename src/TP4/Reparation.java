package TP4;

import java.util.Date;
import java.util.Vector;
import TP2.Piece;

public class Reparation {
    private Date dateReparation;
    private int nombreHeure;
    private String travaux;
    private Vector<Piece> listePieces;
    private Equipement equipement;
    private Technicien technicien;

    public Reparation(Date dateReparation, int nombreHeure, String travaux) {
        this.dateReparation = dateReparation;
        this.nombreHeure = nombreHeure;
        this.travaux = travaux;
        this.listePieces = new Vector<>();
    }

    public Reparation(Date dateReparation, int nombreHeure, String travaux, Vector<Piece> listePieces) {
        this(dateReparation, nombreHeure, travaux);
        this.listePieces = listePieces;
    }

    public Reparation(Date dateReparation, int nombreHeure, String travaux, Vector<Piece> listePieces, Equipement equipement, Technicien technicien) {
        this(dateReparation, nombreHeure, travaux, listePieces);
        this.equipement = equipement;
        this.technicien = technicien;
    }

    public double calculerMontantReparation() {
        double total = 0;
        for (Piece p : listePieces) {
            total += p.getPrix() * p.getQuantite();
        }
        return total;
    }

    public boolean estReformable() {
        return calculerMontantReparation() > equipement.getPrix();
    }

    public void ajouterPiece(int ref, String nom, int quantite, double prix) {
        listePieces.add(new Piece(ref, nom, quantite, quantite, prix));
    }

    public void ajouterPiece(Piece p) {
        listePieces.add(p);
    }

    public void modifierPiece(int ref, String nom, int quantite, double prix) {
        for (Piece p : listePieces) {
            if (p.getRef() == ref) {
                p.setNom(nom);
                p.setQuantite(quantite);
                p.setPrix(prix);
                return;
            }
        }
    }

    public void modifierPiece(Piece pNew) {
        modifierPiece(pNew.getRef(), pNew.getNom(), pNew.getQuantite(), pNew.getPrix());
    }

    public void supprimerPiece1(Piece p) {
        listePieces.remove(p);
    }

    public void afficherListeReparation() {
        for (Piece p : listePieces) {
            System.out.println(p);
        }
    }
}

