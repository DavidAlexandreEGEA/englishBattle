/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.englishbattle.business;

/**
 *
 * @author HB
 */
public class Joueur {

    private String email;
    private String nom;
    private String prenom;
    private String motDePasse;

    public Joueur(String email, String nom, String prenom, String motDePasse) {
        super();
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.motDePasse = motDePasse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    @Override
    public String toString() {
        return "\"" + email + "\"" + "," + "\"" + nom + "\"" + "," + "\"" + prenom + "\"" + "," + "\"" + motDePasse + "\"";
    }
}
