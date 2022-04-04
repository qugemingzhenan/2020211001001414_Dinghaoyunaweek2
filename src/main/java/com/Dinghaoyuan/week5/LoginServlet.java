package com.Dinghaoyuan.week5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;


@WebServlet(name = "LoginServlet", value = "/Login")
public class LoginServlet extends HttpServlet {
    Connection con = null;
    Statement st = null;
/*    private static String jdbcDriver = "com.mysql.cj.jdbc.Driver";// mysql连接驱动,无需改
    public static String jdbcUrl = "jdbc:mysql://localhost:3306/userdb?serverTimezone=UTC";
    public static String jdbcUser = "root";//数据库用户名
    public static String jdbcPwd = "123456";//数据库密码
    private static Connection conn;
    public static Statement st;

    static {
        try {
            Class.forName(jdbcDriver);// 加载mysql驱动类
            conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPwd);
            // 驱动利用驱动地址，数据库用户名，密码创建连接
            st = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    @Override
    public void init() throws ServletException {
        con =(Connection) getServletContext().getAttribute("con");
        st = (Statement) getServletContext().getAttribute("st");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            String sql = "select * from usertable where username='" + username + "' and password= '" + password + "'";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                //request.setAttribute("remind",username);
                //request.getRequestDispatcher("loginpass.jsp").forward(request, response);
                request.setAttribute("id",rs.getInt("id"));
                request.setAttribute("username",rs.getString("username"));
                request.setAttribute("password",rs.getString("password"));
                request.setAttribute("email",rs.getString("email"));
                request.setAttribute("male",rs.getString("male"));
                request.setAttribute("female",rs.getString("female"));
                request.setAttribute("birthday",rs.getDate("birthday"));
                request.getRequestDispatcher("userinfo.jsp").forward(request,response);
            } else {
                request.setAttribute("message", "账密错误，请重新登录<br>");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            rs.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
