package com.Dinghaoyuan.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String area = request.getParameter("area");
        String bachelor = request.getParameter("bachelor");
        String master = request.getParameter("master");
        String doctor = request.getParameter("doctor");
        String birthday = request.getParameter("birthday");


        String refill = request.getParameter("refill");
        String email = request.getParameter("email");

        PrintWriter writer= response.getWriter();
        writer.println("<br>username"+username);
        writer.println("<br>password"+password);
        writer.println("<br>area"+area);
        writer.println("<br>birthday"+birthday);
        writer.println("<br>bachelor"+bachelor);
        writer.println(" master"+master);
        writer.println(" doctor"+doctor);


        writer.println("<br>"+refill);
        writer.println("<br>"+email);

        writer.close();
    }
}
