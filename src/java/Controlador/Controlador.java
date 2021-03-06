/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
   Version 3.0
 */
package Controlador;

import Modelo.Cliente;
import ModeloDao.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MY_PC
 */
public class Controlador extends HttpServlet {
    String listar = "Vista/listar.jsp";
    String add = "Vista/add.jsp";
    String edit = "Vista/edit.jsp";
    Cliente p = new Cliente();
    ClienteDAO dao = new ClienteDAO();
    int id;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String acceso = "";
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("listar")){
            acceso = listar;
        }else if(action.equalsIgnoreCase("add")){
            acceso = add;
        }else if(action.equalsIgnoreCase("Agregar")){
            id = Integer.parseInt(request.getParameter("txtId"));
            String nombre = request.getParameter("txtNombre");
            String apellido = request.getParameter("txtApellido");
            int nroCuenta = Integer.parseInt(request.getParameter("txtNroCuenta"));
            int valorPrestamo = Integer.parseInt(request.getParameter("txtValorPrestamo"));
            int nroCuotas = Integer.parseInt(request.getParameter("txtdNroCuotas"));
            p.setId(id);
            p.setNombre(nombre);
            p.setApellido(apellido);
            p.setNroCuenta(nroCuenta);
            p.setValorPrestamo(valorPrestamo);
            p.setNroCuotas(nroCuotas);
            dao.add(p);
            acceso = listar;
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idper", request.getParameter("id"));
            acceso = edit;
        }else if(action.equalsIgnoreCase("Actualizar")){
            
            id = Integer.parseInt(request.getParameter("txtId"));
            String nombre = request.getParameter("txtNombre");
            String apellido = request.getParameter("txtApellido");
            int nroCuenta = Integer.parseInt(request.getParameter("txtNroCuenta"));
            int valorPrestamo = Integer.parseInt(request.getParameter("txtValorPrestamo"));
            int nroCuotas = Integer.parseInt(request.getParameter("txtdNroCuotas"));
            p.setId(id);
            p.setNombre(nombre);
            p.setApellido(apellido);
            p.setNroCuenta(nroCuenta);
            p.setValorPrestamo(valorPrestamo);
            p.setNroCuotas(nroCuotas);
            dao.edit(p);
            acceso=listar;
        }else if(action.equalsIgnoreCase("eliminar")){
            id = Integer.parseInt(request.getParameter("id"));
            p.setId(id);
            dao.delete(id);
            acceso = listar;
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
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
