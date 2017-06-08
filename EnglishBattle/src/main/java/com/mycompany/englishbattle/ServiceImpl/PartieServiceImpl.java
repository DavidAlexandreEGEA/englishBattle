/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.englishbattle.ServiceImpl;

import com.mycompany.englishbattle.Service.JoueurService;
import com.mycompany.englishbattle.Service.PartieService;
import com.mycompany.englishbattle.Service.QuestionService;
import com.mycompany.englishbattle.business.Joueur;
import com.mycompany.englishbattle.business.Partie;
import com.mycompany.englishbattle.business.Question;
import com.mycompany.englishbattle.business.Verbe;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HB
 */
public class PartieServiceImpl implements PartieService {

    JoueurService jser = new JoueurServiceImpl();
    QuestionService qser = new QuestionServiceImpl();

    @Override
    public Joueur affecterJoueurAPartie(String email, String motDePasse) {
        Joueur player = jser.verifierJoueur(email, motDePasse);
        return player;
    }

    @Override
    public List<Question> affecterQuestionAPartie(String reponsePreterit, String reponseParticipePasse, String email, String motDePasse) {
//        declaration de la liste
        List<Question> listePartie = new ArrayList<Question>();
//        declaration d'une partie
        Partie partie = new Partie(jser.verifierJoueur(email, motDePasse));
//        declaration d'un verbe
        Verbe verbePartie = qser.afficherUnVerbe();
//        
        if (qser.comparerReponse(verbePartie.getBaseVerbale(), reponsePreterit, reponseParticipePasse) == true) {
            Question question = new Question(partie, verbePartie);
            listePartie.add(question);
        }
        return listePartie;
    }

    @Override
    public int connaitreScore(List<Question> listePartie) {
        return listePartie.size();
    }

}
