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
        <h3 class="text-center">Lista de Eventos que você criou</h3>
        <br/>
        <table class="table table-hover">
            <thead>
                <tr class="text-center">
                    <th>Título</th>
                    <th>Valor Mínimo</th>
                    <th>Data do Sorteio</th>
                    <th>Data do Evento</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="evento" items="${eventos}">
                    <tr class="text-center">
                        <td><a href="amigo.html?codEvento=${evento.codigo}">${evento.titulo}</a></td> 
                        <td>${evento.valorMinimo}</td> 
                        <td>${evento.dataSorteio}</td> 
                        <td>${evento.dataEvento}</td> 
                    </tr>  
                </c:forEach>
            </tbody>

        </table>

    </body>
</html>