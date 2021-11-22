
package Dao;

public class UbigeoDao {

    public UbigeoDao() {
    }
    
    public java.util.List<ws.UbigeoBean> ListarUbigeo() {
        ws.Servicios_Service service = new ws.Servicios_Service();
        ws.Servicios port = service.getServiciosPort();
        return port.listarUbigeo();
    }
    
}
