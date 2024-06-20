<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 20/06/2024
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <title> Ajouter un patient </title>
</head>
<body>
<main class="container">

    <div class="col-8 offset-2 rounded text-bg-dark p-3">
        <form method="post" action="${pageContext.request.contextPath}/patient/ajout" enctype="multipart/form-data">

            <div class="mb-3">
                <label for="nom" class="form-label"> Nom :</label>
                <input type="text" class="form-control" name="nom" id="nom" required>
            </div>
            <div class="mb-3">
                <label for="prenom" class="form-label"> Prenom :</label>
                <input type="text" class="form-control" name="prenom" id="prenom" required>
            </div>

            <div class="mb-3">
                <label for="dateDeNaissance" class="form-label">Date de naissance :</label>
                <input type="date" class="form-control" name="dateDeNaissance" id="dateDeNaissance" required>
            </div>

            <div class="mb-3">
                <label for="urlImage" class="form-label"> Photo :</label>
                <input type="file" class="form-control" name="image" id="urlImage" required>
            </div>

            <button class="btn btn-success"> Ajouter un patient </button>
        </form>
    </div>
</main>

</body>
</html>
