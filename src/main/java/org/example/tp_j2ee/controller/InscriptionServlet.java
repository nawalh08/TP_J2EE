package org.example.tp_j2ee.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.tp_j2ee.model.Medecin;
import org.example.tp_j2ee.services.MedecinService;

import java.io.IOException;
@WebServlet(name = "InscriptionServlet" , value = "/medecin/inscription")
public class InscriptionServlet extends HttpServlet {
    MedecinService medecinService;

    @Override
    public void init() throws ServletException {
        medecinService = new MedecinService();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/medecin/inscriptionForm.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("nom");
        String adresseMail = req.getParameter("adresseMail");
        String motDePasse = req.getParameter("motDePasse");
        Medecin o = new Medecin(nom , adresseMail , motDePasse);
        medecinService.create(o);
    }
}
