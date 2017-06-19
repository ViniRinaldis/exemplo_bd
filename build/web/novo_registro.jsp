<%-- 
    Document   : novo_registro
    Created on : 18/06/2017, 11:57:08
    Author     : vini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inserir novo registro</title>
    </head>
    <body>
        <h1>Novo registro:</h1>
       
        <form action="insert_data" method="post">
            <input type="text" name="nome_produto" placeholder="nome do produto">
            <input type="text" name="quantidade" placeholder="quantidade">
            <input type="submit">
        </form>
    </body>
</html>
