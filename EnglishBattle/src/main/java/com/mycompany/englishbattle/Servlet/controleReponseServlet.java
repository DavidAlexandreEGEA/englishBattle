/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.englishbattle.Servlet;

import com.mycompany.englishbattle.Service.QuestionService;
import com.mycompany.englishbattle.ServiceImpl.QuestionServiceImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HB
 */
public class controleReponseServlet extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("§§ doPost controleReponseServlet");
//        QuestionService qser = new QuestionServiceImpl();
        String baseVerbale = request.getParameter("${verbePasse.baseVerbale}");
        System.out.println(baseVerbale);
        String preterit = request.getParameter("preterit");
        System.out.println(preterit);
        String participePasse = request.getParameter("participePasse");
        System.out.println(participePasse);
        request.getRequestDispatcher("questionServlet").forward(request, response);
    }

}
