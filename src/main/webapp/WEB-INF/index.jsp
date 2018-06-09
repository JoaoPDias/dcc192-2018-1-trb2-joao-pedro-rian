<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/WEB-INF/jspf/bootstrap.jspf" %>
        <script type="text/javascript">
            var eventos = <%=request.getAttribute("eventos")%>;
            var usuario = <%=request.getAttribute("usuario")%>;
        </script>
        <script src="js/Cards.js"></script>
        <title>Amigo Oculto - DCC192</title>
    </head>

    <body>
        <%@include file="/WEB-INF/jspf/cabecalho.jspf" %>
        <h1>Colocar uma Imagem</h1>
        <br/>
        <h3 class="text-center">Lista de Eventos que você participa</h3>
    <br/>
    
    <div class='row' id="contentPanel">
        
    </div>
</body>
</html>
