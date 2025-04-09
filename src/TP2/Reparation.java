package TP2;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Reparation {
    private Date dateReparation;
    private int nbHeure;
    private String travaux;
    Vector<Piece> listePieceRep = new Vector<Piece>();
    Iterator<Piece> ipr = listePieceRep.iterator();

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

    public void setTravaux(){
        this.travaux = travaux;
    }
    
    public double calculerMontantRéparation(){
        return();
    }







}
