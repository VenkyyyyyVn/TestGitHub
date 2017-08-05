/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import facade.AccountsFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


public class SearchController extends HttpServlet {
    
    @Autowired
    private AccountsFacadeLocal accountsFacadeLocal;

    @RequestMapping("/loginAccounts")
    public String checkLoginAccounts(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap){
        String toGo = "index";
        String id = request.getParameter("txtId");
        String pwd = request.getParameter("txtPwd");
        try {
            if(accountsFacadeLocal.checkLoginAccounts(id, pwd).getAccID()!=null){
                toGo="";
            }else {
                toGo="";
            }
        } catch (Exception e) {
            return toGo;
        }
        return toGo;
    }

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
        }
    } 

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}