/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package es.albarregas.controllers;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "Bienvenida", urlPatterns = {"/Bienvenida"})
public class Bienvenida extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Bienvenida</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Bienvenida at " + request.getContextPath() + "</h1>");
            out.println("<h2>El metodo de llamada es " + request.getMethod() + "</h2>");
//            Enumeration<String> campos = request.getParameterNames();
//            String nombre = null;
//            while (campos.hasMoreElements()) {
//                nombre = campos.nextElement();
//                out.println("El par&aacute es " + nombre + " es igual a " + request.getParameter(nombre));
//                if (campos.hasMoreElements()) {
//                    nombre = campos.nextElement();
//                    out.println("y " + nombre + " es igual a " + request.getParameter(nombre));
//                }
//            }
            out.println("<p><a href=\"./index.html\">Volevr al index</a></p>");
            out.println("</body>");
            out.println("</html>");
        }
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
            out.println("<title>Servlet Bienvenida</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Bienvenida at " + request.getContextPath() + "</h1>");
            out.println("<h2>El metodo de llamada es " + request.getMethod() + "</h2>");
            Enumeration<String> campos = request.getParameterNames();
            String nombre = null;
            out.println("<ul>");
            while (campos.hasMoreElements()) {
                nombre = campos.nextElement();
                if (!nombre.startsWith("btn")) {
                out.println("<li>El campo " + nombre + " tiene un valor de " + request.getParameter(nombre) + "</li>");
                /*if (campos.hasMoreElements()) {
                    nombre = campos.nextElement();
                    out.println("y " + nombre + " es igual a " + request.getParameter(nombre));
                }*/
                }
            }
            out.println("</ul>");
            out.println("<p><a href=\"./index.html\">Volevr al index</a></p>");
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
