package TP4;

import java.util.ArrayList;
import TP1.Specialite;

public class Technicien {
    private String nom;
    private String prenom;
    private String email;
    private String login;
    private String password;
    private int matricule;
    private Specialite specialite;
    private Vehicule engin;
    private Technicien chefEquipe;
    private ArrayList<Technicien> membres;

    public Technicien(String nom, String prenom, String email, String login, String password,
                      int matricule, Specialite specialite, Vehicule engin, Technicien chefEquipe,
                      ArrayList<Technicien> membres) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.login = login;
        this.password = password;
        this.matricule = matricule;
        this.specialite = specialite;
        this.engin = engin;
        this.chefEquipe = chefEquipe;
        this.membres = membres;
    }

    public void designerChefEquipe(Technicien nouveauChef) {
        this.chefEquipe = nouveauChef;
    }

    public void ajouterVehicule(Vehicule v) {
        this.engin = v;
    }
}

