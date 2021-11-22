/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Dao.PacienteDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import ws.PacienteBean;
import ws.Servicios_Service;

public class SesionServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServicioWebClinica/Servicios.wsdl")
    private Servicios_Service service;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session;
        session = request.getSession();
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String lista = "Paciente/Paciente.jsp";
        String index = "index.jsp";
        String pagina = "Paciente/LoginPaciente.jsp";
        String accion = request.getParameter("accion");
        
        String opcad;
        opcad = new String(request.getParameter("op").getBytes("ISO-8859-1"), "UTF-8");
        int op = Integer.parseInt(opcad);
       
        try {
            switch (op) {
                case 1: {
                    session = request.getSession();       
                    String mensaje = "";
                   
                    String usuario = new String(request.getParameter("txtusu").getBytes("ISO-8859-1"), "UTF-8");
                    String contraseña = new String(request.getParameter("txtcont").getBytes("ISO-8859-1"), "UTF-8");
                
                    PacienteBean objPacienteBean = new PacienteBean();
                    objPacienteBean.setUsuario(usuario);
                    objPacienteBean.setContraseña(contraseña);
                    PacienteDao paciente = new PacienteDao();
                    PacienteBean valido = paciente.validar(usuario, contraseña);

                    if (valido == null) {
                        session.invalidate();
                        mensaje = "Las credenciales no son correctas.";
                        request.setAttribute("mensaje", mensaje);
                        getServletContext().getRequestDispatcher("/LoginPaciente.jsp").forward(request, response);
                    
                    } else {     
                        session.setAttribute("SESION", paciente);
                        getServletContext().getRequestDispatcher("/Paciente/Paciente.jsp").forward(request, response);
                    }
                    break;
                }
            }
            if (session.getAttribute("SESION") == null ) {
                out.println("");
            }
        } catch (Exception e) {
            
        }
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
