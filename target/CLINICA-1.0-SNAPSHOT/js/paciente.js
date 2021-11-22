function  limpiarCampos()
{ 
   document.getElementById('txtusu').value="";
   document.getElementById('txtcont').value="";
    
}

function validarPaciente(ruta)
{
   var txtusu = document.getElementById('txtusu').value;
   var txtcont = document.getElementById('txtcont').value;


    if (txtusu == '')
    {   
        alert("Ingresar el Usuario por favor!!!");
        document.getElementById('txtusu').focus();
        return;
    }
    else
    {
        if (txtcont == '')
        {   alert("Ingresar el Contraseña por favor!!!");
            document.getElementById('txtcont').focus();
            return;
        }
        else
        {  
            document.form.action=ruta+"/PacienteServlet";
            document.form.method="POST";
            document.form.op.value="1";
            document.form.submit();
        }
    }
}

