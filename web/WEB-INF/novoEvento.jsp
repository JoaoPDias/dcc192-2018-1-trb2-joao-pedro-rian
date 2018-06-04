<%-- 
    Document   : novoEvento
    Created on : 04/06/2018, 15:46:20
    Author     : Rian Alves
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/WEB-INF/jspf/bootstrap.jspf" %>
        <title>Crie um novo Evento e divirta-se!</title>
    </head>
    <body>
    <center><h3>Insira abaixo os dados solicitados para a criação de um novo Evento</h3></center>
        <div class="row">
            <div class="col"></div>
            <div class="col"><br/>
               
                <form method="post">
                    <div class="form-group">
                    <label>Título do Evento:</label>
                        <input class="form-control" type="text" placeholder="Insira aqui um Título para seu Evento" name="titulo"/><br/>
                    </div>
                    <div class="form-group">
                    <label>Valor Mínimo do Presente: </label>    
                        <input class="form-control" type="text" placeholder="Insira aqui o valor Mínimo do presente" name="minimo"/><br/>
                    </div>
                    <div class="form-group">
                        <label>Data do Sorteio:</label>    
                        <input class="form-control" type="text" placeholder="Insira aqui a data do Sorteio" name="sorteio"/><br/>
                    </div>
                    
                    <div class="form-group">
                        <label>Data do Evento:</label>    
                                    <input class="form-control" type="text" placeholder="Insira aqui quando o Evento será realizado" name="evento"/><br/>
                    </div>
                    <input type="submit" class="btn btn-success"/>
                    <input type="reset" class="btn btn-danger"/>
                </form>
            </div>
            <div class="col"></div>
        </div>

    </body>
</html>
