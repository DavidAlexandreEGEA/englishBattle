/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.englishbattle.business;

import java.util.Date;

/**
 *
 * @author HB
 */
public class Question {

    private Partie partie;
    private Verbe verbe;
    private String reponsePreterit;
    private String reponseParticipePasse;
    private Date dateEnvoi;
    private Date dateReponse;

//    constructeur
    public Question(Partie partie, Verbe verbe) {
        this.partie = partie;
        this.verbe = verbe;
        this.dateEnvoi = new Date();
    }
//    constructeur

    public Partie getPartie() {
        return partie;
    }

    public void setPartie(Partie partie) {
        this.partie = partie;
    }

    public Verbe getVerbe() {
        return verbe;
    }

    public void setVerbe(Verbe verbe) {
        this.verbe = verbe;
    }

    public String getReponsePreterit() {
        return reponsePreterit;
    }

    public void setReponsePreterit(String reponsePreterit) {
        this.reponsePreterit = reponsePreterit;
    }

    public String getReponseParticipePasse() {
        return reponseParticipePasse;
    }

    public void setReponseParticipePasse(String reponseParticipePasse) {
        this.reponseParticipePasse = reponseParticipePasse;
    }

    public Date getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(Date dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public Date getDateReponse() {
        return dateReponse;
    }

    public void setDateReponse(Date dateReponse) {
        this.dateReponse = dateReponse;
    }

    @Override
    public String toString() {
        return "Question [verbe=" + verbe + ", reponsePreterit=" + reponsePreterit + ", reponseParticipePasse="
                + reponseParticipePasse + ", dateEnvoi=" + dateEnvoi + ", dateReponse=" + dateReponse + "]";
    }
}
