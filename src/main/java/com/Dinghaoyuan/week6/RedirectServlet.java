package com.Dinghaoyuan.week6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/search")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //System.out.println("before redirect");
        //response.sendRedirect("index.jsp");
        //http://localhost:8080/2020211001001414_Dinghaoyuan_war/index.jsp
        //System.out.println("after redirect");
        //response.sendRedirect("/2020211001001414_Dinghaoyuan_war/index.jsp");
        //response.sendRedirect("https://www.baidu.com/");
        String txt = request.getParameter("txt");
        String search = request.getParameter("search");
        String baidu = request.getParameter("baidu");
        String bing = request.getParameter("bing");
        String google = request.getParameter("google");
        if(txt == null){
            response.sendRedirect("index.jsp");
        }else {
            if(search == baidu){
                response.sendRedirect("https://www.baidu.com/"+txt);
            }else if(search == bing){
                response.sendRedirect("https://cn.bing.com/?mkt=zh-CN"+txt);
            }else if (search == google){
                response.sendRedirect("http://www.google.cn/"+txt);
            }
        }





    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
