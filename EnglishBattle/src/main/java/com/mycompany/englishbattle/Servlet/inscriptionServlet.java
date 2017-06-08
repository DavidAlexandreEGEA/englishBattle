/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.englishbattle.Servlet;

import com.mycompany.englishbattle.Service.JoueurService;
import com.mycompany.englishbattle.ServiceImpl.JoueurServiceImpl;
import com.mycompany.englishbattle.business.Joueur;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HB
 */
public class inscriptionServlet extends HttpServlet {

    JoueurService jser = new JoueurServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("inscription.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String motDePasse = request.getParameter("motDePasse");
        Joueur joueurConnecte = jser.inscription(email, nom, prenom, motDePasse);
        request.setAttribute("joueurConnecte", joueurConnecte);
        System.out.println(jser.inscription(email, nom, prenom, motDePasse));
        request.getRequestDispatcher("questionJsp.jsp").forward(request, response);
    }

}
