
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Plataforma Principal</title>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="css/prueba.css" rel="stylesheet" type="text/css"/>
        <script>
            function  iniciar1(){	 
                document.form.action="<%=request.getContextPath()%>/Paciente/LoginPaciente.jsp";
                document.form.method = "POST";
                document.form.submit();
            }

            function  iniciar2() {
                document.form.action = "<%=request.getContextPath()%>/Doctor/LoginDoctor.jsp";
                document.form.method = "POST";
                document.form.submit();
            }
        </script>
    </head>

    <body background="imagenes/login2.jpg" >
        <div class="alert alert-info">
            <h4><strong><center> BIENVENIDOS A LA PLATAFORMA</center></strong></h4>                            
        </div>

        <div class="panel-body">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <center>  <img  src="imagenes/logohospital.png"></center>                                   
                </div>
            </div>			

            <div class="row">		
                <div class="row">
                    <div class="col-md-6 col-md-offset-3"><HR size="3px" color="#0000ff">
                    </div>
                </div> 

                <form name="form">
                    <center>
                        <button onclick="iniciar1()" >
                            <center><img  src="imagenes/paciente.png" width="300px" height="300px"></center><br>Paciente
                        </button>

                        <button onclick="iniciar2()" >
                            <center><img  src="imagenes/doctor.png" width="300px" height="300px"></center><br>Doctor
                        </button>
                    </center> 
                </form>
            </div>

            <div class="panel-footer text-center">               
                www.plataformaOnline.consultas &copy; 2020
            </div>            
        </div>	
    </body>
</html>
