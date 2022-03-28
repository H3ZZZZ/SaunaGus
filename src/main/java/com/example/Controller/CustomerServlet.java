package com.example.Controller;

import Models.Customer;
import Models.Event;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "CustomerServlet", value = "/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String email = request.getParameter("email");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        int phoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));

        PrintWriter out = response.getWriter();



//        if(logic.login(username, password)){
//            response.sendRedirect("/BankProject_war_exploded/UserPage.jsp");
//        } else{
//
//            response.sendRedirect("/BankProject_war_exploded/index.jsp");
//        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public Customer addCustomerToEvent(String email, String firstName, String lastName, int phoneNumber, int eventID){
        EventServlet eventServlet = new EventServlet();
return null;
    }
}
