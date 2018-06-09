<%-- 
    Document   : inscricao
    Created on : 01/06/2018, 10:57:29
    Author     : Rian Alves
--%>

<%@include file="jspf/cabecalho.jspf" %>
        <title>Inscreva-se para ser sorteado</title>
    </head>
    <body>
    <center><h3>Insira abaixo os dados solicitados para a sua inscri��o</h3></center>
        <div class="row">
            <div class="col"></div>
            <div class="col"><br/>
               
                <form method="post">
                    <div class="form-group">
                    <label>Nome Completo:</label>
                        <input class="form-control" type="text" placeholder="Insira aqui o seu nome completo" name="nome"/><br/>
                    </div>
                    <div class="form-group">
                    <label>E-mail:</label>    
                        <input class="form-control" type="text" placeholder="Insira aqui o seu e-mail" name="email"/><br/>
                    </div>
                    <div class="form-group">
                        <label>Senha:</label>    
                        <input class="form-control" type="password" placeholder="Insira aqui a sua senha" name="senha"/><br/>
                    </div>
                    <input type="submit" class="btn btn-success"/>
                    <input type="reset" class="btn btn-danger"/>
                </form>
            </div>
            <div class="col"></div>
        </div>
<%@include file="jspf/rodape.jspf" %>