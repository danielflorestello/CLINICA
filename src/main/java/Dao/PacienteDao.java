
package Dao;

import ws.PacienteBean;
import ws.Servicios_Service;

public class PacienteDao {

    public PacienteDao() {
    }
    
    public java.util.List<ws.PacienteBean> ListarPaciente(){
        ws.Servicios_Service service = new ws.Servicios_Service();
        ws.Servicios port = service.getServiciosPort();
        return port.listar();
    }

    public String agregar(
            java.lang.String nombrepaci,
            java.lang.String apepaci,
            java.lang.String usuario,
            java.lang.String contraseña,
            java.lang.String dnipaci,
            java.lang.String fechNacipaci,
            java.lang.String sexopaci,
            java.lang.String telfpaci,
            java.lang.String correopaci,
            java.lang.String codUbigeo
    ) {
        ws.Servicios_Service service = new ws.Servicios_Service();
        ws.Servicios port = service.getServiciosPort();
        return port.agregar(nombrepaci, apepaci, usuario, contraseña, dnipaci, fechNacipaci, sexopaci, telfpaci, correopaci, codUbigeo);
    }
    
    public PacienteBean validar(java.lang.String usuario, java.lang.String contraseña) {
        ws.Servicios_Service service = new ws.Servicios_Service();
        ws.Servicios port = service.getServiciosPort();
        return port.validar(usuario, contraseña);
    }

}
