<%!
    String msj = null;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Doctor</title>
        <link href="../css/loginDoct1.css" rel="stylesheet" type="text/css"/>
        <link href="../css/logindD.css" rel="stylesheet" type="text/css"/>
        <script src="<%=request.getContextPath()%>/js/Doctor.js"></script>

        <script>
            function Volver()
                {
                document.form.action = "<%=request.getContextPath()%>/index.jsp";
                document.form.method = "POST";
                document.form.submit();
            }
        </script>
    </head>

    <body>
        <div id="cuadro">
            <form name="form">
                <input type="hidden" name="op">

                <center>
                    <p id="titulo">INICIAR SESION</p>
                </center>

                <hr>

                <br><br>
                <label id="subtitulo2">USUARIO</label>
                <br><br>
                <input type="text" id="txtusu" name="txtusu" class="entrada">

                <br><br>    
                <label id="subtitulo2">CONTRASEÑA</label>
                <br><br>
                <input type="password" id="txtcont" name="txtcont" class="entrada">

                <br><br>
                <input type="button" value="Iniciar Sesion" id="boton" onclick="validarDoctor('<%=request.getContextPath()%>')">

                <br><br>

                <input type="button" value="Regresar" id="boton" onclick="Volver()">

            </form>
        </div>

        <%
            if (request.getAttribute("mensaje") != null) {
                msj = (String) request.getAttribute("mensaje");
        %>

        <div class="alert">
            <span class="closebtn" onclick="this.parentElement.style.display = 'none';">&times;</span>
            <stron>
                <%=msj%>
            </stron>
        </div>
        <%
            }
        %>
    </body>
</html>
