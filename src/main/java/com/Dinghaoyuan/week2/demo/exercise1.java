package com.Dinghaoyuan.week2.demo;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
public class exercise1 extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws IOException {
        PrintWriter writer= response.getWriter();
        writer.println("Name: Dinghaoyuan");
        writer.println("ID: 2020211001001414");
        writer.println("Date and Time: Sun March 6 10:47");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response){

    }

}
