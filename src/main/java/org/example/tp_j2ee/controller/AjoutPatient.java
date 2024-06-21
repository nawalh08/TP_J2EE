package org.example.tp_j2ee.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import org.example.tp_j2ee.model.Patient;
import org.example.tp_j2ee.services.PatientService;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

@MultipartConfig(maxFileSize = 1024*1024*10)
@WebServlet(name = "ajoutPatientServlet", value = "/patient/ajout")

public class AjoutPatient extends HttpServlet {
    private PatientService patientService;

    @Override
    public void init() throws ServletException {
        patientService = new PatientService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/patient/ajoutPatient.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = new String(req.getPart("nom").getInputStream().readAllBytes()) ;
        String prenom = new String(req.getPart("prenom").getInputStream().readAllBytes());
        LocalDate dataDeNaissance = LocalDate.parse(new String(req.getPart("dateDeNaissance").getInputStream().readAllBytes()));
        String urlPhoto = getServletContext().getRealPath("/") + "image";

        File file = new File(urlPhoto);
        if (!file.exists()){
            file.mkdir();
        }
        Part image = req.getPart("image");
        String fileName = image.getSubmittedFileName();
        image.write(urlPhoto+File.separator+fileName);

        Patient patient = Patient.builder().nom(nom).prenom(prenom).dateDeNaissance(dataDeNaissance).urlPhoto(
        req.getContextPath()+"/image/"+fileName).build();
        patientService.create(patient);

    }
}
