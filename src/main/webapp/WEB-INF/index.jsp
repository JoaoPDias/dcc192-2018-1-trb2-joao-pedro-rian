<%@include file="/WEB-INF/jspf/cabecalho.jspf" %>
        <script type="text/javascript">
            var eventos = <%=request.getAttribute("eventos")%>;
            var usuario = <%=request.getAttribute("usuario")%>;
        </script>
        <script src="js/Cards.js"></script>
        <title>Amigo Oculto - DCC192</title>
    </head>

    <body>
        

        <br/>
        <h3 class="text-center">Lista de Eventos que voc� participa</h3>
    <br/>
    
    <div class='row' id="contentPanel">
        
    </div>
<%@include file="/WEB-INF/jspf/rodape.jspf" %>