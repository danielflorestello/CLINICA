<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Paciente</title>
        <link href="../css/LoginPacient.css" rel="stylesheet" type="text/css"/>
        <script>
            function Volver() {
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

                <input type="text"  name="txtusu" id="txtusu" value="" class="entrada">

                <br><br>    

                <label id="subtitulo2">CONTRASEÑA</label>

                <br><br>

                <input type="password" name="txtcont" id="txtcont" value="" class="entrada">

                <br><br>

                <input type="button" value="Iniciar Sesion" id="boton" onclick="validarPaciente('<%=request.getContextPath()%>')">

                <br><br>

                <input type="button" value="Regresar" id="boton" onclick="Volver()">
            </form>
        </div>
    </body>
</html>