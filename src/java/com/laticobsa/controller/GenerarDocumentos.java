/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laticobsa.controller;

import com.laticobsa.modelo.LcDeudoresDocumentos;
import com.laticobsa.servicios.GenerarQRMasivo;
import com.laticobsa.utils.CodigoQR;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CIMA2015
 */
public class GenerarDocumentos extends HttpServlet {

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
        
      //  CodigoQR qr = new CodigoQR();
        GenerarQRMasivo qrmasivo = new GenerarQRMasivo();
       // qr.generaImgQr();
         String accion;
        accion = request.getParameter("accion");
        /*
        ticket="+response+"&IDDocumento="+IDDocumento
        */
        if(accion.equals("genera_doc_masivos"))
        {
            int  ticket=Integer.parseInt(request.getParameter("ticket"));
            int  IDDocumento=Integer.parseInt(request.getParameter("IDDocumento"));  
             request.setAttribute("ticket", ticket);
             request.setAttribute("IDDocumento", IDDocumento);
            
            List<LcDeudoresDocumentos> qrIdeudor = qrmasivo.getGeneraDocumentos(ticket);
            request.getRequestDispatcher("sistema/terrenos/reportes_masivos.jsp").forward(request, response);
         
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
