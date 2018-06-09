<%-- 
    Document   : login
    Created on : 25/05/2018, 12:04:13
    Author     : Rian Alves
--%>

<%@include file="/WEB-INF/jspf/cabecalho.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Login - Amigo Oculto</title>
    </head>
    <body>
        <div class="row">
            <div class="col"></div>
            <div class="col"></div>
            <div class="col"><br/>
                <div class="box-parent-login">
                    <div class="well bg-white box-login">

                        
                        <img src="icones/Logotipo.png" class="rounded mx-auto d-block" width="500" height="166" alt="Imagem">
                        <br/>
                        <form method="post">
                            <fieldset>

                                <div class="form-group ls-login-user">
                                    <label for="userLogin">E-mail</label>
                                    <input class="form-control ls-login-bg-user input-lg" id="userLogin" type="text" aria-label="Usu�rio" placeholder="Usu�rio" name="usuario">
                                </div>

                                <div class="form-group ls-login-password">
                                    <label for="userPassword">Senha</label>
                                    <input class="form-control ls-login-bg-password input-lg" id="userPassword" type="password" aria-label="Senha" placeholder="Senha" name="senha">
                                </div>

                                <center><a href="">Esqueci minha senha</a></center><br/>

                                <input type="submit" value="Entrar" class="btn btn-primary btn-lg btn-block" name="acessar" >

                                <center>N�o possui cadastro? </center>
                                <center> <a href="registro.html">Cadastre-se agora</a></center>

                            </fieldset>
                        </form>
                    </div>
                    <c:if test="${erroLogin == true}">
                        <div class="alert alert-danger" role="alert">
                            <center>Erro ao realizar Login! Verifique a senha!</center>
                        </div>
                    </c:if>
                </div>
            </div>
            <div class="col"></div>
            <div class="col"></div>
        </div>

<%@include file="/WEB-INF/jspf/rodape.jspf" %>