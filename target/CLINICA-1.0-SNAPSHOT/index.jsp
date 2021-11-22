
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PAGINA WEB</title>
        <link href="css/prueba.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <style type="text/css">		    
            .div_cuerpo
            {
                margin-top: 50px;
            }      
        </style>
        
        <script>
            function iniciar1(){
                
                document.form.action="<%=request.getContextPath()%>/especialidades/odontologia.jsp";
                document.form.method="POST";
                document.form.submit();
                
            }
            function iniciar2(){
                
                document.form.action="<%=request.getContextPath()%>/especialidades/pedriatria.jsp";
                document.form.method="POST";
                document.form.submit();
                
            }
            function iniciar3(){
                
                document.form.action="<%=request.getContextPath()%>/especialidades/cardilogia.jsp";
                document.form.method="POST";
                document.form.submit();
                
            }
            function iniciar4(){
                
                document.form.action="<%=request.getContextPath()%>/especialidades/ginecologia.jsp";
                document.form.method="POST";
                document.form.submit();
                
            }
            function iniciar5(){
                
                document.form.action="<%=request.getContextPath()%>/especialidades/dermatologia.jsp";
                document.form.method="POST";
                document.form.submit();
                
            }
            function iniciar6(){
                
                document.form.action="<%=request.getContextPath()%>/especialidades/oftalmologia.jsp";
                document.form.method="POST";
                document.form.submit();
                
            }
            function iniciar7(){
                
                document.form.action="<%=request.getContextPath()%>/LoginPrincipal.jsp";
                document.form.method="POST";
                document.form.submit();
                
            }
            
            function registrar(){
                
                document.form.action="<%=request.getContextPath()%>/Registro.jsp";
                document.form.method="POST";
                document.form.submit();    
            
            } 
        </script>
    </head>
    
    <body background="imagenes/fondo1.jpg">   
        
        <div class="div_cuerpo" id="div_cuerpo1">       
            <center>      
                <h1 class="groove" > CLINICA SAN JUAN DE DIOS </h1>
            </center>
        </div>
        
            <center>
                <div class="espacio">
                    <button  style="background-color:#ADD8E6;" onclick="iniciar1()" >
                        <center>  <img  src="imagenes/odontologia.jpg" width="300px" height="200px"></center><br>
                        Odontologia
                    </button>
                
                    <button  style="background-color:#20B2AA;"    onclick="iniciar2()" >
                        <center>  <img  src="imagenes/pediatria.jpg" width="300px" height="200px"></center><br>
                        Pediatria
                    </button>
                
                    <button  style="background-color:#ADD8E6;"    onclick="iniciar3()" >
                        <center>  <img  src="imagenes/cardiologia.jpg" width="300px" height="200px"></center><br>
                        Cardiologia
                    </button><br>
                </div>
                
                <div class="espacio">
                    <button  style="background-color:#20B2AA;"    onclick="iniciar4()" >
                        <center>  <img  src="imagenes/ginecologia.jpg" width="300px" height="200px"></center><br>
                        Ginecologia
                    </button>          
                    <button   style="background-color:#ADD8E6;"   onclick="iniciar5()" >
                        <center>  <img  src="imagenes/dermatologia.jpg" width="300px" height="200px"></center><br>
                        Dermatologia
                    </button>
                    <button   style="background-color:#20B2AA;"   onclick="iniciar6()" >
                        <center>  <img  src="imagenes/oftalmologia.jpg" width="300px" height="200px"></center><br>
                        Oftalmologia
                    </button>
                </div>
            </center>
    
        <form name="form">        
            <center>
                <div class="espacio">
                    <button  class="btn btn-primary btn-lg" style="background-color:#FFFFF0;"   onclick="iniciar7()" >
                        <center>  <img  src="imagenes/iniciar_seccion.png" width="170px" height="95px"></center><br>
                        <p style="background-color:black;">Iniciar Sesión </p>
                    </button>

                    <button  class="btn btn-primary btn-lg" style="background-color:#FFFFF0;"   onclick="registrar()" >
                        <center>  <img  src="imagenes/botonRegistro.jpeg" class="boton"></center><br>
                        <br>
                        <p style="background-color:black;"> Registrarse </p>
                    </button>
                    
                    <div>
                        <a href="PacienteServlet?accion=add"> Registrarse</a>
                    </div>
                </div>
            </center>
        </form>
    </body>
</html>
