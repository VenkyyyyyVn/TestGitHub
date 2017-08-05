/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import entity.AccountDetails;
import facade.AccountDetailsFacade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


public class ShowController extends HttpServlet {

    @Autowired
    private AccountDetailsFacade accountDetailsFacade;
    
    @RequestMapping("/showAccountDetails")
    public void showAccountDetails(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        AccountDetails account = new AccountDetails();
        String url = "";
        try {
            String id = request.getParameter("txtId");
            account = accountDetailsFacade.find(id);
            if(account!=null){
                url="showAccountDetails";
                request.setAttribute("itemAccountDetails", account);
                request.getRequestDispatcher(url).forward(request, response);
            } else {
                url="";
                request.getRequestDispatcher(url).forward(request, response);
            }
            
        } catch (Exception e) {
        }
        
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