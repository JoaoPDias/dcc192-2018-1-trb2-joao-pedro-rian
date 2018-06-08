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

    <center><h3>Adicione os Amigos que participarão do Evento</h3></center>
    <br/>
    <div class="row">
        <div class="col">        
            <thead>
                <tr class="text-center">
                    <th>Nome</th>
                    <th>E-mail</th>
                    <th>Adicionar no Evento</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="amigo" items="${participantes}">
                <tr class="text-center">
                    <td>${amigo.nome}</td> 
                    <td>${amigo.email}</td> 
                    <td><a href="">Adicionar</a></td> 

                </tr>  
            </c:forEach>
            </tbody>
        </div>
        <div class="col"></div>
        <div class="col">  
            <br/>
            <thead>
                
                <tr class="text-center">
                    <th>Nome</th>
                    <th>E-mail</th>
                    <th>Remover do Evento</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="amigo" items="${participantes}">
                <tr class="text-center">
                    <td>${amigo.nome}</td> 
                    <td>${amigo.email}</td> 
                    <td><a href="">Remover</a></td>
                </tr>  
            </c:forEach>
            </tbody>

        </div>
    </div>
    <br/>
    <br/>

    <div class="row">
        <div class="col"></div>
        <div class="col"><input type="submit" value="Sortear Amigo Oculto" class="btn btn-primary btn-lg btn-block" name="sortear" ></div>
        <div class="col"></div>
    </div>
</html>
