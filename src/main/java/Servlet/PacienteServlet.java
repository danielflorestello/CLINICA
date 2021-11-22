
package Servlet;

import Dao.PacienteDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PacienteServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String add = "Registro.jsp";
        String index = "index.jsp";
        String acceso = "";
        PacienteDao dao = new PacienteDao();
        
        String accion = request.getParameter("accion");

        if (accion.equals("add")) {
            acceso = add;
        } else if (accion.equals("Guardar")) {
            String nombre = request.getParameter("txtNombre");
            String apellido = request.getParameter("txtApellido");
            String usuario = request.getParameter("txtUsuario");
            String contraseña = request.getParameter("txtContra");
            String dni = request.getParameter("txtDni");
            String fecha = request.getParameter("txtFecha");
            String sexo = request.getParameter("txtSexo");
            String telefono = request.getParameter("txtTelefono");
            String correo = request.getParameter("txtCorreo");
            String ubigeo = request.getParameter("SelUbigeo");

            dao.agregar(nombre, apellido, usuario, contraseña, dni, fecha, sexo, telefono, correo, ubigeo);
            acceso = index;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(acceso);
        dispatcher.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
