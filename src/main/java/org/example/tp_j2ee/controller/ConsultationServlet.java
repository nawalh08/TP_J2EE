package org.example.tp_j2ee.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.tp_j2ee.model.Consultation;
import org.example.tp_j2ee.services.ConsultationService;

import java.io.IOException;
import java.sql.SQLException;

public class ConsultationServlet extends HttpServlet {
    private ConsultationService consultationService;

    @Override
    public void init() throws ServletException {
        consultationService = new ConsultationService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getServletPath();
        switch (action) {
            case "/consultationDetail":
                showConsultationDetail(req , resp);
                break;
            default:
                break;
        }
    }

    private void showConsultationDetail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int consultationId = Integer.parseInt(req.getParameter("id"));
        Consultation consultation = consultationService.getConsultationById(id);
        req.getRequestDispatcher("/consultationDetail.jsp").forward(req, resp);
        req.setAttribute("consultation", consultation);

    }
}
