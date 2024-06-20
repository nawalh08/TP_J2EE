<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 20/06/2024
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="patient" type="java.util.ArrayList<org.example.tp_j2ee.model.Patient>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Patients </title>
</head>
<body>
<main class="container">
    <div class="row my-3">
        <div class="col-8 offset-2 text-bg-dark rounded p-3">
            <h1 class="fw-light">- Liste des patients  -</h1>
            <hr>
            <% if (!patient.isEmpty()) { %>
            <table class="table table-dark text-center align-middle">
                <thead>
                <tr>
                    <th> Id </th>
                    <th> Nom </th>
                    <th> Prenom </th>
                    <th> Date de naissance </th>
                    <th> Photo </th>

                </tr>
                </thead>
                <tbody>
                <% for (int i = 0; i < patient.size();i++) { %>
                <tr>
                    <td><%= patient.get(i).getId() %></td>
                    <td><%= patient.get(i).getNom() %></td>
                    <td><%= patient.get(i).getPrenom() %></td>
                    <td><%= patient.get(i).getDateDeNaissance() %></td>
                    <td><%= patient.get(i).getUrlPhoto() %></td>



                </tr>

                <% } %>

                </tbody>

            </table>
            <% } else { %>
            <p> Aucun patient pour l'instant </p>
            <% }  %>


        </div>
    </div>
</main>


</body>
</html>
