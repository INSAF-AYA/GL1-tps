package TP5;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public abstract class Materiel implements Reformable {
    private String marque;
    private Date dateAcquisition;

    public Materiel(String marque, String dateStr) {
        try {
            this.marque = marque;
            this.dateAcquisition = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getMarque() { return marque; }
    public Date getDateAcquisition() { return dateAcquisition; }

    @Override
    public boolean reformer(Object o) {
        try {
            if (o instanceof Equipement) {
                Equipement e = (Equipement) o;
                return e.getListeReparation().size() > 10;
            } else if (o instanceof Vehicule) {
                Vehicule v = (Vehicule) o;
                Date seuil = new SimpleDateFormat("dd/MM/yyyy").parse("31/12/2010");
                return v.getMarque().equals("Peugeot") && v.getDateAcquisition().before(seuil);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean reformerCourant() {
        return reformer(this);
    }
    
    public class Equipement extends Materiel {
        private ArrayList<String> listeReparation;

        public Equipement(String marque, String date) {
            super(marque, date);
            this.listeReparation = new ArrayList<>();
        }

        public void ajouterReparation(String rep) {
            listeReparation.add(rep);
        }

        public ArrayList<String> getListeReparation() {
            return listeReparation;
        }
    }
    
    public class Vehicule extends Materiel {
        public Vehicule(String marque, String date) {
            super(marque, date);
        }
    }


}

