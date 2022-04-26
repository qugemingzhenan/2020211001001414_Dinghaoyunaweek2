package com.Dinghaoyuan.week5;

import com.Dinghaoyuan.dao.UserDao;
import com.Dinghaoyuan.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;


@WebServlet(name = "LoginServlet", value = "/login")
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
        request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UserDao userDao = new UserDao();
        try {
            User user = userDao.findByUsernamePassword(con,username,password);
            if(user !=null){
                /*Cookie c = new Cookie("sessionid",""+user.getId());
                c.setMaxAge(10*60);
                response.addCookie(c);*/
                String rememberMe = request.getParameter("rememberMe");
                if(rememberMe != null && rememberMe.equals("1")){
                    Cookie usernameCookie = new Cookie("cUsername",user.getUsername());
                    Cookie passwordCookie = new Cookie("cPassword",user.getPassword());
                    Cookie rememberMeCookie = new Cookie("cRememberMe",rememberMe);

                    usernameCookie.setMaxAge(5);
                    passwordCookie.setMaxAge(5);
                    rememberMeCookie.setMaxAge(5);

                    response.addCookie(usernameCookie);
                    response.addCookie(passwordCookie);
                    response.addCookie(rememberMeCookie);
                }

                HttpSession session = request.getSession();
                System.out.println("session id-->"+session.getId());
                session.setMaxInactiveInterval(10);


                session.setAttribute("user",user);
                request.getRequestDispatcher("WEB-INF/views/userinfo.jsp").forward(request,response);
            }else {
                request.setAttribute("message", "账密错误，请重新登录<br>");
                request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        /*try {
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
        }*/

    }
}
