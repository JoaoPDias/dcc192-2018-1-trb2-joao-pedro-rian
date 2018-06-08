<%-- 
    Document   : gerenciarEvento
    Created on : 07/06/2018, 15:05:55
    Author     : Rian Alves
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/WEB-INF/jspf/bootstrap.jspf" %>
        <title>Gerenciamento do Evento</title>
    </head>
    <body>
        <%@include file="/WEB-INF/jspf/cabecalho.jspf" %>
    <center><h3>Adicione os Amigos que participarão do Evento</h3></center>
    <br/>
    <div class="row">

        <div class="col">  
            <select class="custom-select" onclick="myFunction">
                <option>Selecione um participante para o Evento</option>
                <c:forEach var="amigo" items="${participantes}">
                    <option>${amigo.nome} ( ${amigo.email} ) </option>

                </c:forEach>
            </select>

        </div>
        <div class="col"> <img src="icones/setas.jpg" class="rounded mx-auto d-block" width="500" height="400" alt="Imagem"> </div>
        <div class="col">  
            <select class="custom-select" size="15">
                <option>Participantes Selecionados: </option>
                <c:forEach var="amigo" items="${participantes}">
                    <option>${amigo.nome} ( ${amigo.email} ) </option>

                </c:forEach>
            </select> 
            <br/>        

            <center><button class="btn btn-danger btn-sm">Remover do Evento</button></center>


        </div>

    </div>

    <br/>
    <br/>



</body>
</html>
