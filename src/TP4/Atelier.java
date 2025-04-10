package TP4;

import java.util.Date;

public class Atelier { 
    private int numAtelier;
    private Date entree;
    private Date sortie;

    public Atelier(int numAtelier, Date entree, Date sortie) {
        this.numAtelier = numAtelier;
        this.entree = entree;
        this.sortie = sortie;
    }
}

