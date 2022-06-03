package com.Lab3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalServlet",value = "/CalServlet")
public class CalServlet extends HttpServlet {
    @Override
    public void destroy() {
        super.destroy();
    }
    public CalServlet(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("utf-8");
        double answer = 0;


        double first = Double.parseDouble(request.getParameter("firstval"));
        double second = Double.parseDouble(request.getParameter("secondval"));
        int type = Integer.parseInt(request.getParameter("action"));
        switch(type){
            case 1:
                answer = first + second;
                break;
            case 2:
                answer = first - second;
                break;
            case 3:
                answer = first * second;
                break;
            case 4:
                answer = first / second;
                break;
            default:
                break;
        }
        request.setAttribute("answer", answer);
        request.getRequestDispatcher("/Lab3/cal.jsp").forward(request, response);

    }
}
