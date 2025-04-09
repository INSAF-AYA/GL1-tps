package TP2;

import java.util.Date;

public class Piece {
    private int ref;
    private String nom;
    private int quantite;
    private int quantiteStock;
    private double prix;

    public Piece(int ref, String nom, int quantite, int quantiteStock, double prix){
        this.ref = ref;
        this.nom = nom;
        this.quantite = quantite;
        this.quantiteStock = quantiteStock;
        this.prix = prix;
    }

    public Piece(){
    }

    public int getRef(){
        return ref;
    }

    public String getNom(){
        return nom;
    }

    public int getQuantite(){
        return quantite;
    }

    public int getQuantiteStock(){
        return quantiteStock;
    }

    public double getPrix() {
        return prix;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void entrerStock(int quantite){
        quantiteStock += quantite;
    }

    public double calculerMontantPiece(){
        return(quantite * prix);
    }
}
