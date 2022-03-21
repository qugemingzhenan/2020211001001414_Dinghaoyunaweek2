package com.Dinghaoyuan.week3.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

@WebServlet(urlPatterns = {"/register"})
public class Register_Servlet extends HttpServlet {
    Connection con = null;
    @Override
    public void init() throws ServletException {

        ServletContext context= getServletContext();
        String driver = context.getInitParameter("driver");
        String username = context.getInitParameter("username");
        String url = context.getInitParameter("url");
        String password = context.getInitParameter("password");
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, password);
            System.out.println(con);
        }catch (ClassNotFoundException| SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String male = request.getParameter("male");
        String female = request.getParameter("female");
        String birthday = request.getParameter("birthday");

        System.out.println("in dopost");
        PrintWriter writer= response.getWriter();
        writer.println("<br>id"+id);
        writer.println("<br>username"+username);
        writer.println("<br>password"+password);
        writer.println("<br>email"+email);
        writer.println("<br>male"+male);
        writer.println("female"+female);
        writer.println("<br>birthday"+birthday);
        writer.close();

        try{
            PreparedStatement ps=con.prepareStatement("insert into usertable values('"+id+"','"+username+"','"+password+"','"+email+"','"+male+"','"+female+"','"+birthday+"')") ;
            ps.executeLargeUpdate();
            ps.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
