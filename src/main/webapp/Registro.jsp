<%@page import="java.util.List"%>
<%@page import="ws.UbigeoBean"%>
<%@page import="Dao.UbigeoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>

    <body>
    <center>
        <div class="container">
            <h1>Registrar Datos</h1>

            <hr>
            
            <form class="form-control" style=" width: 500px; height: auto">
            <br/>
                <div align="left">
                    Nombre:
                    <input type="text" name="txtNombre" class="form-control"/>

                    <br/>

                    Apellido:
                    <input type="text" name="txtApellido" class="form-control"/>

                    <br/>

                    DNI:
                    <input type="text" name="txtDni" class="form-control"/>

                    <br/>

                    Fecha de Nacimiento:
                    <input type="date" name="txtFecha" class="form-control"/>

                    <br/>

                    Sexo:
                    <input type="text" name="txtSexo" class="form-control"/>

                    <br/>

                    Teléfono:
                    <input type="text" name="txtTelefono" class="form-control"/>

                    <br/>

                    Correo:
                    <input type="text" name="txtCorreo" class="form-control"/>

                    <br/>

                    Usuario:
                    <input type="text" name="txtUsuario" class="form-control"/>

                    <br/>

                    Contraseña:
                    <input type="text" name="txtContra" class="form-control"/>

                    <br>
                    
                    Ubigeo:
                    <select name="SelUbigeo">
                        
                        <%
                            UbigeoDao ubigeos = new UbigeoDao();
                            List<UbigeoBean> lista = ubigeos.ListarUbigeo();
                            for (UbigeoBean u : lista) {
                        %>
                        
                        <option value="<%=u.getCodUbigeo()%>"> <%=u.getDescripcionUbi()%></option>

                        <%}%>

                        
                    </select>
                    
                </div>
                <br/>

                <input type="submit" name="accion" value="Guardar" class=" btn btn-primary btn-lg"/>

                <a/> <a/>

                <a href="index.jsp">Regresar</a>

            </form>
        </div>
    </center>   
    </body>
</html>
