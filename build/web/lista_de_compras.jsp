<%-- 
    Document   : lista_de_compras
    Created on : 18/06/2017, 11:05:00
    Author     : vini
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="application.ListaDeCompras"%>
<%@page import="application.ListaDeComprasDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de compras</title>
    </head>
    <body>
        <a href="novo_registro.jsp">novo item</a>
        <h1>Lista: </h1>
        <table>
            <th>nome do produto</th>
            <th>Quantidade</th>
        <%
         List<ListaDeCompras> lista = new ListaDeComprasDao().listarListaDeCompras();
         
         for(int i = 0; i < lista.size(); i++)
         {
             out.println("<tr><td>");
             out.println(lista.get(i).getNome_produto());
             out.println("</td><td>");
             out.println(lista.get(i).getQuantidade());
             out.println("</td></tr>");
             out.println("<br/>");
         }
        %>
    </body>
</html>