
<%@page import="java.util.List"%>
<%@page import="ws.PacienteBean"%>
<%@page import="Dao.PacienteDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DOCTOR</title>
        
        <script src="http://code.jquery.com/jquery-latest.js">
        </script>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/prueba.css" rel="stylesheet" type="text/css"/>
    </head>
    
    <body background="../imagenes/fondoDoctor.jpg">
        <nav class="navbar navbar-default navbar-static-top">
            <div class="container">
                <div class="navbar-header">               
                    <a class="navbar-brand" href="#"> CLINICA SAN JUAN DE DIOS </a>
                </div>
                
                <div id="navbar" class="navbar-collapse collapse">      
                    <ul class="nav navbar-nav"> 
                        <li><a href="../index.jsp"> SALIR </a></li> 
                    </ul>
                </div>
            </div>  
        </nav>
                        
        <input type="hidden" id="Doctorito" value="">
        <input type="hidden" id="idEmisor"  value="">
        <input type="hidden" id="Paciente"  value="0">
    
        <div class="div_cuerpo" id="div_cuerpo1">       
            <center>      
                <h1 class="groove" > Bienvenido Dr.            
                </h1> 
            </center>
        </div>
        
        <div class="container">
            <center>               
                <table class="table table-bordered"  background="../imagenes/white.jpg">
                    <tr>
                        <td><FONT SIZE=5>TELÉFONO   </font></td>
                        <td><FONT SIZE=5>NÚMERO DNI </font></td>
                        <td><FONT SIZE=5>PACIENTE   </font></td>     
                    </tr>
                    
                    <tbody>
                        <%
                            PacienteDao pacientes = new PacienteDao();
                            List<PacienteBean> lista = pacientes.ListarPaciente();
                            for (PacienteBean p : lista) {
                        %>
                        <tr>
                            <td><%=p.getTelfpaci()%></td>
                            <td><%=p.getDnipaci()%></td>
                            <td><%=p.getNombrepaci()%></td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
            </center>
        </div>
    </body>
</html>
