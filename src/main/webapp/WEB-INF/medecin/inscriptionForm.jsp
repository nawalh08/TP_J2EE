<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 20/06/2024
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">

    <title> Page d'inscription </title>
</head>
<body>
<main class="container">

    <div class="col-8 offset-2 rounded text-bg-dark p-3">
        <form method="post" action="${pageContext.request.contextPath}/medecin/inscription">

            <div class="mb-3">
                <label for="prenom" class="form-label"> Prenom  :</label>
                <input type="text" class="form-control" name="prenom" id="prenom" required>
            </div>
            <div class="mb-3">
                <label for="nom" class="form-label"> Nom :</label>
                <input type="text" class="form-control" name="nom" id="nom" required>
            </div>
            <div class="mb-3">
                <label for="adresseMail" class="form-label"> Adresse e-mail  :</label>
                <input type="email" class="form-control" name="adresseMail" id="adresseMail" required>
            </div>
            <div class="mb-3">
                <label for="motDepasse" class="form-label"> Mot de passe  :</label>
                <input type="password" class="form-control" name="motDepasse" id="motDepasse" required>
            </div>


            <button class="btn btn-success"> Inscription </button>
        </form>
    </div>
</main>
</body>
</html>
