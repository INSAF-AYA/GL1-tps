import java.util.*;
import java.text.ParseException;
import java.text. SimpleDateFormat;

import TP1.Technicien;
import TP1.*;
import TP1.ChefAtelier;
import TP2.*;
import TP2.Reparation;
import TP3.*;
import TP3.Equipement;
import TP4.*;
import TP5.*;

public class Main {
    public static void main(String[] args) throws ParseException {
    	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    	
    	// TP1
    	System.out.println("==== TP1: héritage ====");
    	Technicien tech1, tech2, tech3;

    	tech1 = new Technicien("MANSOUR", "Insaf Aya", "mansourinsafaya@gmail.com", "insaftware", "aljkerjfileri46578", 1 ,Specialite.Informatique);

    	tech2 = new Technicien ("Laarbi", "Yousra", "ylaarbi@usthb.dz", "yousssy", ":dkcjmod",2, Specialite.Mecanique);

    	tech3 = new Technicien();

    	tech3.setNom("BOUMAAZA"); tech3.setPrenom("djihane"); 
    	tech3.setEmail("boudjidji@hotmail.dz");
    	tech3.setLogin("djidji");
		tech3.setPassword("chebhasni1996"); 
		tech3.setMatricule (3);
    	tech3.setSpecialite (Specialite.Rien);
    	
    	System.out.println("Connexion de tech3: "+tech3.sauthentifier1());
    	System.out.println("Connexion de techs: "+tech3.sauthentifier2());

    	ChefAtelier chefl, chef2;

    	chefl = new ChefAtelier ("Boulkrinat", "Samia", "sboulkrinat@usthb.dr", "bol", "sam", 1, format.parse("1/5/2020"), format.parse("1/5/2019"), Status.Actif);

    	System.out.println("Nombre d'anneé d'expérience du chefl:" + chefl.miseAJourExperience(format.parse("1/5/2021")));
    	
    	chef2 = new ChefAtelier();
    	chef2.setNom("Benhamoud"); 
    	chef2.setPrenom("Yasser");
    	chef2.setLogin("ben"); 
    	chef2.setPassword("yas"); 
    	chef2.setNbExperience (7);
    	chef2.setDatePromotion(format.parse("10/5/2020"));
    	chef2.setDateExperience (format.parse("10/4/2019"));
    	
    	System.out.println("Nombre d'anneé d'expérience du chef2");
    	chef2.miseAJourExperience(format.parse("25/5/2020"));

    	
    	// TP2
    	System.out.println("==== TP2: Agrégation ====");
  

        Reparation rep = new Reparation(new Date(), 5, "Changement de pièces");

        rep.ajouterPièce(1, "Filtre", 2, 1000);
        rep.ajouterPièce(2, "Pompe", 1, 5000);
        rep.ajouterPièce(3, "Joint", 4, 500);

        System.out.println("Liste après ajout :");
        rep.afficherListePieces();

        rep.ajouterPièce(1, "Filtre", 1, 1000);

        rep.modifierPièce(2, "Pompe à eau", 2, 6000);

        rep.supprimerPièce(3);

        System.out.println("Est-ce que 'Pompe à eau' est disponible ? " + rep.isDispo("Pompe à eau"));

        double montant = rep.calculerMontantRéparation();
        System.out.println("Montant total de la réparation : " + montant);

        Piece p = new Piece(1, "Carte mère", 1, 12, 2500); 
        System.out.println("L'équipement est-il réformable ? " + rep.estReformable(p));


        System.out.println("Liste finale des pièces :");
        rep.afficherListePieces();
        
        
        
        // TP3
        System.out.println("==== TP3: Composition ====");

        Equipement equip = new Equipement(1, "ASUS", Type.Micro);

        Equipement.Composant c1 = equip.new Composant(100, "RAM", new Date(124, 11, 19), 5, 2000.0, Etat.Fonctionnel);
        Equipement.Composant c2 = equip.new Composant(101, "Disque dur", new Date(125, 4, 21), 7, 5000.0, Etat.Fonctionnel);
        Equipement.Composant c3 = equip.new Composant(102, "Lecteur CD", new Date(124, 3, 19), 4, 800.0, Etat.Défaillant);

        equip.ajouterComposant(c1);
        equip.ajouterComposant(c2);
        equip.ajouterComposant(c3);

        System.out.println("Composants avant suppression :");
        equip.afficherListeComposants();

        Equipement.Composant newC3 = equip.new Composant(102, "Lecteur DVD", new Date(125, 1, 10), 6, 1200.0, Etat.Fonctionnel);
        c3.remplacer(newC3);

        System.out.println("C1 est fonctionnel ? " + c1.estFonctionnel());
        System.out.println("C3 est fonctionnel après remplacement ? " + c3.estFonctionnel());

        equip.supprimerComposant(c2);

        Fournisseur f1 = new Fournisseur(1, "TechStore", null, montant, null);
        Fournisseur f2 = new Fournisseur(2, "MegaHardware", null, montant, null);

        equip.ajouterFournisseur(f1);
        equip.ajouterFournisseur(f2);
        equip.supprimerFournisseur(f1);

        System.out.println("Composants après suppression et remplacement :");
        equip.afficherListeComposants();
    	
    	
    	
    	
        // TP4
        System.out.println("==== TP4: Association ====");
        Composant com1 = new Composant(0, "Processeur", null, 0, 120.0, null);
        Composant com2 = new Composant(0, "RAM", null, 0, 70.0, null);

        Vector<Composant> composants = new Vector<>();
        composants.add(com1);
        composants.add(com2);
        Equipement e1 = new Equipement(1001, "Ordinateur", Type.Micro);
        e1.afficherListeComposants();

        Equipement e2 = new Equipement(1002, "Imprimante", Type.Imprimante);
        Date dateFab = new Date(); 
        Etat etat = Etat.Défaillant;  
        Composant toner = new Composant(0, "Toner", dateFab, 24, 30.0, etat);

        
        Vector<Equipement> eqList = new Vector<>();
        eqList.add(e1);
        Fournisseur four1 = new Fournisseur(12345, "TechnoPlus", "Alger", 100000.0, eqList);
        four1.ajouterEquipement(e2);
        four1.supprimerEquipement(e1);

        Atelier a1 = new Atelier(501, new Date(), new Date());

        Vehicule v1 = new Vehicule(999, "Toyota");
        Technicien t1 = new Technicien("Ali", "Nour", "ali@gmail.com", "aliN", "pass", 101, Specialite.Electronique);
        Technicien t2 = new Technicien("Sara", "Ben", "sara@gmail.com", "saraB", "pass2", 102, Specialite.Mecanique);

        Reparation r1 = new Reparation(new Date(), 3, "Remplacement RAM");
        r1.ajouterPièce(1, "RAM", 2, 35.0);
        r1.ajouterPièce(new Piece(2, "SSD", 1, 0, 100.0));
        r1.afficherListePieces();
        System.out.println("Montant réparation: " + r1.calculerMontantRéparation());
        System.out.println("Est réformable: " + r1.estReformable(p));

        r1.modifierPièce(1, "RAM", 2, 40.0);


        // TP5
        System.out.println("==== TP5: héritage ====");
        t1.getPassword();
        System.out.println(t1);

        Equipement eqReform = new Equipement(1033, "Switch", Type.Datashow);
        System.out.println("Réformable (courant) Equipement: " + eqReform.reformerCourant());

        Vehicule peugeot = new Vehicule(3001, "Peugeot");
        peugeot.setDateAcquisition(new GregorianCalendar(2005, Calendar.DECEMBER, 30).getTime());
        System.out.println("Réformable (objet) Véhicule: " + peugeot.reformer(peugeot));
    }
    
    
}


