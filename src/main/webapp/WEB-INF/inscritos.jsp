<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/WEB-INF/jspf/bootstrap.jspf" %>
        <title>Amigo Oculto - DCC192</title>
    </head>

    <body>
        <%@include file="/WEB-INF/jspf/cabecalho.jspf" %>
        <h1>Colocar uma Imagem</h1>
        <br/>
        <h3 class="text-center">Lista de Participantes do Evento: ${evento.titulo}</h3>
        <br/>
        <table class="table table-hover">
            <thead>
                <tr class="text-center">
                    <th>Nome</th>
                    <th>E-mail</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="participante" items="${participantes}">
                    <tr class="text-center">
                        <td>${participante.nome}</td> 
                        <td>${participante.email}</td> 
                    </tr>  
                </c:forEach>
            </tbody>

        </table>

    </body>
</html>