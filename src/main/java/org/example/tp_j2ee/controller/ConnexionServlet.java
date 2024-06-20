package org.example.tp_j2ee.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.tp_j2ee.model.Medecin;
import org.example.tp_j2ee.services.MedecinService;

import java.io.IOException;
import java.util.List;
@WebServlet(name = "connexionServlet" , value = "/medecin/connexion")
public class ConnexionServlet extends HttpServlet {
    MedecinService medecinService;
    List<Medecin> medecinList;

    @Override
    public void init() throws ServletException {
        medecinService = new MedecinService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/medecin/connexionForm.jsp").forward(req , resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       boolean f = false;
        Medecin medecin = medecinService.getByparams(req.getParameter("nom"), req.getParameter("adresseMail"), req.getParameter("motDePasse"));
        if (medecin!= null){
            f = true;
            HttpSession session = req.getSession();
            session.setAttribute("connect" , true);
            resp.sendRedirect("consultations");

        } else {
            resp.sendRedirect("connexion");
        }

    }
}
