package com.kogent.servlet;

import com.kogent.entity.Customer;
import com.kogent.session.CustomerFacadeLocal;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.ejb.EJB;
import javax.persistence.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CustomerServlet extends HttpServlet {
    @EJB
    private CustomerFacadeLocal customerFacade;

protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {

    String action = request.getParameter(com.kogent.servlet.FormConstants.FIELD_ACTION);
        if (com.kogent.servlet.FormConstants.ACTION_QUERY_FORM.equals(action)) {
            displayQueryForm(request, response);
        } else if (com.kogent.servlet.FormConstants.ACTION_VIEW_FORM.equals(action)) {
            displayViewForm(request, response);
        } else if (com.kogent.servlet.FormConstants.ACTION_QUERY.equals(action)) {
            doQueryAll(request, response);
        }
        else {
            displayQueryForm(request, response);
        }
    }
        private void displayQueryForm(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException 
        {
        getServletConfig().getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
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
    }

    private void displayViewForm(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
    {
            int custId = Integer.parseInt(request.getParameter(com.kogent.servlet.FormConstants.FIELD_CUSTOMER_ID));
            Customer customer = customerFacade.find(custId);
            request.setAttribute(com.kogent.servlet.FormConstants.ATTRIBUTE_CUSTOMER, customer);
            getServletConfig().getServletContext().getRequestDispatcher("/view.jsp").forward(request, response);
       
    }


    private void doQueryAll(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
    {
        List<Customer> cust = customerFacade.findAll();
        request.setAttribute(com.kogent.servlet.FormConstants.ATTRIBUTE_CUSTOMER_LIST, cust);
        getServletConfig().getServletContext().getRequestDispatcher("/list.jsp").forward(request, response);
        }
}
