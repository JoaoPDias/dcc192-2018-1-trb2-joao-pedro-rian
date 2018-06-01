<%-- 
    Document   : login
    Created on : 25/05/2018, 12:04:13
    Author     : Rian Alves
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/WEB-INF/jspf/bootstrap.jspf" %>
        <title>Minera Git - Requisitos</title>
    </head>
    <body>
        <div class="row">
            <div class="col"></div>
            <div class="col"><br/><br/>
                
                
                <div class="box-parent-login">
                    <div class="well bg-white box-login">
                        
                        <center><h2>Minera Git - Requisitos</h2></center>
                        <br/>
                        <img src="MineraRequisitos.jpg" class="rounded mx-auto d-block" alt="Minera Requisitos">
                        <br/>
                        <form method="post">
                            <fieldset>

                                <div class="form-group ls-login-user">
                                    <label for="userLogin">Usuário</label>
                                    <input class="form-control ls-login-bg-user input-lg" id="userLogin" type="text" aria-label="Usuário" placeholder="Usuário">
                                </div>

                                <div class="form-group ls-login-password">
                                    <label for="userPassword">Senha</label>
                                    <input class="form-control ls-login-bg-password input-lg" id="userPassword" type="password" aria-label="Senha" placeholder="Senha">
                                </div>

                                <center><a href="https://github.com/">Esqueci minha senha</a></center><br/>

                                <input type="submit" value="Entrar" class="btn btn-primary btn-lg btn-block" name="acessar" >
                                <center>Não possui conta no GitHub? </center>
                                <center> <a href="https://github.com/">Cadastre-se agora</a></center>

                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col"></div>
        </div>

    </body>
</html>
