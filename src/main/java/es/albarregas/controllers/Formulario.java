/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package es.albarregas.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carom
 */
@WebServlet(name = "Formulario", urlPatterns = {"/Formulario"})
public class Formulario extends HttpServlet {

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
//        processRequest(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Formulario</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\""+ request.getContextPath() + "/CSS/style.css>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Formulario at " + request.getContextPath() + "</h1>");
            if (!correcto) {
                out.println("<p>No se han introducido datos</p>");
            } else { 
                Enumeration<String> parametros = request.getParameterNames();
                while (parametros.hasMoreElements()){
                    String nombre = parametros.nextElement();
                    if (!nombre.startsWith("env")) {
                        if (!nombre.startsWith("marca")) {
                            out.println();
                        }else{
                            String[] valores = request.getParameterValues(nombre);
                            
                        }
                    }
                }
            }
            
            /*String[] listaParametros = request.getParameterValues("gustos");
            String[] nombre = request.getParameterValues("nombre");
            for (String n : nombre) {
                out.println("<p>" + n + "</p>");
                out.println("<p>Gustos: </p>");
                for (String parametro : listaParametros) {
                    out.println("<li>" + parametro + "</li>");
                }// for
            }// for*/
            
            out.println("</body>");
            out.println("</html>");
        }
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
