package com.Dinghaoyuan.controller;

import com.Dinghaoyuan.dao.UserDao;
import com.Dinghaoyuan.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.text.SimpleDateFormat;
@WebServlet(name = "UpdateUserServlet", value = "/updateUser")
public class UpdateUserServlet extends HttpServlet {
    Connection con = null;



    @Override
    public void init() throws ServletException {
        con =(Connection) getServletContext().getAttribute("con");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/views/updateUser.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        User user = new User();
        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String birthday = request.getParameter("birthday");
        try{
            Date birth = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
            user.setId(Integer.parseInt(id));
            user.setUsername(username);
            user.setPassword(password);
            user.setEmail(email);
            user.setGender(gender);
            user.setBirthday(birth);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            int i = userDao.updateUser(con,user);
            if(i>0){
                HttpSession session = request.getSession();

                session.setAttribute("user",user);
                request.getRequestDispatcher("WEB-INF/views/userinfo.jsp").forward(request,response);
            }else {
                request.setAttribute("message", "修改失败<br>");
                request.getRequestDispatcher("accountDetails").forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
