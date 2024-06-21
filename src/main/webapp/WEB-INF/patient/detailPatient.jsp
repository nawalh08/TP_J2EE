<%--
  Created by IntelliJ IDEA.
  User: hammoudi
  Date: 21/06/2024
  Time: 09:33
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="patient" type="org.example.tp_j2ee.model.Patient" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Détail du patient </title>
</head>
<body>
<p>Nom : ${patient.nom}</p>
<p>Prenom : ${patient.prenom}</p>
<p> Dat ede naissance : ${patient.dateDeNaissance}</p>
<p> photo : <img src="${patient.urlPhoto}" alt="photo du patient ${patient.nom} ${patient.prenom}"></p>

<h2> Consultation </h2>
<ul>
    <c:forEach var="consultation" items="${patient.consultations}">
        <li>
            <a href="consultationDetail?id=${consultation.id}">
                Consultation du ${consultation.dateConsultation} avec Dr. ${consultation.nomMedecin}
            </a>
        </li>
    </c:forEach>
</ul>
<a href="newConsultation?patientId=${patient.id}"> Ajouter une consultation</a>

</body>
</html>
