
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PACIENTE</title>

        <script src="http://code.jquery.com/jquery-latest.js">
        </script>

        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/prueba.css" rel="stylesheet" type="text/css"/>
        <link href="../css/EstiloChat.css" rel="stylesheet" type="text/css"/>
    </head>
    
    <body background="../imagenes/fondoPaciente.jpg">
        <div class="div_cuerpo" id="div_cuerpo1">       
            <center>      
                <h1 class="groove"> CLINICA SAN JUAN DE DIOS 
                    <p></p> Bienvenido
                    <jsp:useBean id="Sesion" scope="session" class="ws.PacienteBean">
                </h1>
            </center>
        </div>
        
         <div class="container">
            <center>               
                <table class="table table-bordered" background="../imagenes/white.jpg">
                    <tr>
                        <td><FONT SIZE=5>NÚMERO </font></td>
                        <td><FONT SIZE=5>CORREO </font></td>
                        <td><FONT SIZE=5>DOCTOR </font></td>
                    </tr>
                        
                    <tr>
                        
                    </tr>    
                </table>
            </center>
        </div>
    </body>
</html>
