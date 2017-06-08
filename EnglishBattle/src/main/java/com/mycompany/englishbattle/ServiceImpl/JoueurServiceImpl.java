/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.englishbattle.ServiceImpl;

import com.mycompany.englishbattle.Service.JoueurService;
import com.mycompany.englishbattle.business.Joueur;
import java.util.ArrayList;
import java.util.List;

public class JoueurServiceImpl implements JoueurService{

    List<Joueur> listeJoueur = new ArrayList<Joueur>();
    
    @Override
    public Joueur inscription(String email, String nom, String prenom, String motDePasse) {
      Joueur player = new Joueur(email, nom, prenom, motDePasse);
      listeJoueur.add(player);
        System.out.println(listeJoueur);
        return player;
    }

    @Override
    public Joueur verifierJoueur(String email, String motDePasse) {
//        rajout de force dans la liste pour simulation
        Joueur joueur1 = new Joueur("email", "Joueur1", "Pierre", "1234");
        listeJoueur.add(joueur1);
        for (Joueur joueur : listeJoueur){
            if(joueur.getEmail().equals(email) && joueur.getMotDePasse().equals(motDePasse)){
               return joueur;  
            }
        }
        return null;
    }

    @Override
    public List<Joueur> afficherListeJoueur() {
        return listeJoueur;
    }
}
