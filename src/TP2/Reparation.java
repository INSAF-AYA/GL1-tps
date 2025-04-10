package TP2;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

public class Reparation {
    private Date dateReparation;
    private int nbHeure;
    private String travaux;
    Vector<Piece> listePieceRep = new Vector<Piece>();

    public Reparation(Date dateReparation, int nbHeure, String travaux){
        this.dateReparation= dateReparation;
        this.nbHeure = nbHeure;
        this.travaux = travaux;
    }

    public Reparation(Date dateReparation, int nbHeure, String travaux, Vector<Piece>
            listePieceRep){
        this.dateReparation= dateReparation;
        this.nbHeure = nbHeure;
        this.travaux = travaux;
        this.listePieceRep = listePieceRep;
    }

    public Reparation(){
    }

    public Date getDateReparation(){
        return dateReparation;
    }

    public int getNbHeure(){
        return nbHeure;
    }

    public String getTravaux(){
        return travaux;
    }

    public void setDateReparation(Date dateReparation){
        this.dateReparation = dateReparation;
    }

    public void setNbHeure(int nbHeure){
        this.nbHeure = nbHeure;
    }

    public void setTravaux(String travaux){
        this.travaux = travaux;
    }
    
    public double calculerMontantRéparation(){
    	double total = 0;
    	for (Piece p : listePieceRep) {
    		total += p.calculerMontantPiece();
    	}
        return(total);
    }
    
    void ajouterPièce(int ref ,String nom ,int quantité ,double prix) {
    	for (Piece p : listePieceRep) {
            if (p.getRef() == ref) {
                p.setQuantite(p.getQuantite() + quantité);
                return;
            }
        }  
        Piece newPiece = new Piece(ref, nom, quantité, 1, prix);
        listePieceRep.add(newPiece);
    }
    
    public void ajouterPièce(Piece p) {
        for (Piece piece : listePieceRep) {
            if (piece.getRef() == p.getRef()) {
                piece.setQuantite(piece.getQuantite() + p.getQuantite());
                return;
            }
        }
        listePieceRep.add(p);
    }
    
    public void modifierPièce(int ref, String nom, int quantite, double prix) {
        for (Piece piece : listePieceRep) {
            if (piece.getRef() == ref) {
                piece.setNom(nom);
                piece.setQuantite(quantite);
                piece.setPrix(prix);
                return;
            }
        }
        System.out.println("La piéce n'existe pas");
    }
    
    public void modifierPièce(Piece p) {
        for (Piece piece : listePieceRep) {
            if (piece.getRef() ==  p.getRef()) {
                piece.setNom(p.getNom());
                piece.setQuantite(p.getQuantite());
                piece.setPrix(p.getPrix());
                return;
            }
        }
        System.out.println("La piéce n'existe pas");
    }
    
    public void supprimerPièce(int ref) {
    	Iterator<Piece> ipr = listePieceRep.iterator();
        while (ipr.hasNext()) {
            Piece piece = ipr.next();
            if (piece.getRef() == ref) {
                ipr.remove();
                return;
            }
        }
        System.out.println("La piéce n'existe pas");
    }
    
    public boolean isDispo(String nom) {
        for (Piece piece : listePieceRep) {
            if (piece.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean estReformable(double prixAchat) {
        return calculerMontantRéparation() > prixAchat;
    }
    
    public boolean estReformable(Piece piece) {
        double MontantRep = calculerMontantRéparation(); 
        double prixAchat = piece.getPrix();
        return MontantRep > prixAchat; 
    }
    
    public void afficherListePieces() {
        for (Piece piece : listePieceRep) {
            System.out.println("Ref: " + piece.getRef() + ", Nom: " + piece.getNom() + ", Quantité: " + piece.getQuantite() + ", Prix: " + piece.getPrix());
        }
    }

    
    
}