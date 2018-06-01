<%-- 
    Document   : inscricao
    Created on : 01/06/2018, 10:57:29
    Author     : Rian Alves
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/WEB-INF/jspf/bootstrap.jspf" %>
        <title>Inscreva-se para ser sorteado</title>
    </head>
    <body>
        <h3>Insira abaixo os dados solicitados para a sua inscrição</h3>
        <div class="row">
            <div class="col"></div>
            <div class="col"><br/>
               
                <form method="post"> 
                    <label>Nome Completo:    
                        <input class="form-control" type="text" placeholder="Insira aqui o seu nome completo" name="nome"/></label><br/>
                    <label>E-mail:    
                        <input class="form-control" type="text" placeholder="Insira aqui o seu e-mail" name="email"/></label><br/>
                    <label>Senha:    
                        <input class="form-control" type="text" placeholder="Insira aqui a sua senha" name="senha"/></label><br/>

                    <input type="submit" class="btn btn-success"/>
                    <input type="reset" class="btn btn-danger"/>
                </form>
            </div>
            <div class="col"></div>
        </div>

    </body>
</html>
