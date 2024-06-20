package org.example.tp_j2ee.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.tp_j2ee.model.Patient;
import org.example.tp_j2ee.services.PatientService;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "patientServlet" , value = "/patients/*")
public class PatientServlet extends HttpServlet {

    private PatientService patientService;
    public List<Patient> patientList;
    @Override
    public void init() throws ServletException {
        patientService = new PatientService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        boolean connect = (session.getAttribute("connect") != null) ? (boolean) session.getAttribute("connect"): false;
        if (connect){
            patientList = patientService.findAll();
            req.setAttribute("patients", patientList);
            getServletContext().getRequestDispatcher("/WEB-INF/patient/listPatient.jsp").forward(req,resp);

        } else
            resp.sendRedirect("connexion");
    }
}

