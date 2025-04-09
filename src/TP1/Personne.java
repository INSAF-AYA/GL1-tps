package TP1;

import java.util.Scanner;

public class Personne {
    private String nom;
    private String prenom;
    private String email;
    private String login;
    private String password;

    Scanner scanner = new Scanner(System.in);

    public Personne(String nom, String prenom, String email, String login, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public Personne(){
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    // dertlha override psq kayna f la class object, li kamel les class y inheritiw mnha
    public String toString(){
        return "Nom :" + this.getNom() + ", Prenom: " + this.getPrenom() + ", Email: " + this.getEmail() + ", Login: "+ this.getLogin() + ", Password: " + this.getPassword();
    }

    public void afficher(){
        System.out.println(this.toString());
    }

    public boolean sauthentifier1(){
        System.out.println("Entrez votre identifiant (login) et votre mot de passe (Password)");
        String login = scanner.next();
        String password = scanner.next();
        if (this.login.equals(login) && this.password.equals(password)) {
            System.out.println("Connexion réussie! :) ");
            return true;
        }else {
            System.out.println("Connexionn échouée :( ");
            return false;
        }
    }

    public boolean sauthentifier2(){
        int i = 1 ;
        while (i<4) {
            System.out.println("Entrez votre identifiant (login) et votre mot de passe (Password)");
            String login = scanner.next();
            String password = scanner.next();
            if (this.login.equals(login) && this.password.equals(password)) {
                System.out.println("Connexion réussie! :) ");
                return true;
            }
            i++;
        }
        System.out.println("Connexion échouée :( ");
        return (false);
    }
}

