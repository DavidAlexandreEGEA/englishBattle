/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.englishbattle.Service;

import com.mycompany.englishbattle.business.Joueur;
import com.mycompany.englishbattle.business.Question;
import java.util.List;

/**
 *
 * @author HB
 */
public interface PartieService {
    
    Joueur affecterJoueurAPartie(String email, String motDePasse);
    List<Question> affecterQuestionAPartie(String reponsePreterit, String reponseParticipePasse, String email, String motDePasse);
    int connaitreScore(List<Question> question);
}
