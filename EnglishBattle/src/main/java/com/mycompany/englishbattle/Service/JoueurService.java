package com.mycompany.englishbattle.Service;

import com.mycompany.englishbattle.business.Joueur;
import java.util.List;

public interface JoueurService {

    Joueur inscription(String email, String nom, String prenom, String motDePasse);

    Joueur verifierJoueur(String email, String motDePasse);
    
    List<Joueur> afficherListeJoueur();
}
