package com.Dinghaoyuan.week6;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@WebListener
public class JDBCServletContextList implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        ServletContext context= sce.getServletContext();
        String driver = context.getInitParameter("driver");
        String username = context.getInitParameter("username");
        String url = context.getInitParameter("url");
        String password = context.getInitParameter("password");
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            System.out.println("i am in contextInitialized");
            System.out.println(con);
            context.setAttribute("con",con);
            context.setAttribute("st",st);
        }catch (ClassNotFoundException| SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println("i am in contextDestroyed");
        sce.getServletContext().removeAttribute("con");
        sce.getServletContext().removeAttribute("st");
    }
}
