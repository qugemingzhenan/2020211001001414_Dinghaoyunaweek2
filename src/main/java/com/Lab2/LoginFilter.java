package com.Lab2;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter",
urlPatterns = {"/Lab2/validate.jsp","/Lab2/welcome.jsp"}
)
public class LoginFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
        System.out.println("i am in LoginFilter -->init()");
    }

    public void destroy() {
        System.out.println("i am in the LoginFilter-->destroy()");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("i am in the LoginFliter-->doFliter()--request before chain");
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res= (HttpServletResponse) response;

        HttpSession session = req.getSession(false);
        boolean isLoggedIn = (session!=null);
        String loginURI = req.getContextPath()+"/Lab2/login.jsp";
        boolean isLoginRequest = req.getRequestURI().equals(loginURI);

        System.out.println(isLoggedIn);
        if (isLoggedIn || isLoginRequest){
            //the admin is already login ande he is trying login again
            //then forward to the admin homepage
            request.getRequestDispatcher("/Lab2/welcome.jsp").forward(req,res);//go to home
            //((HttpServletResponse) response).sendRedirect("welcome.jsp");

        }else {
            System.out.println(req.getContextPath());
            res.sendRedirect(req.getContextPath()+"/Lab2/login.jsp");//go to login
            //((HttpServletResponse) response).sendRedirect("login.jsp");
        }
        chain.doFilter(request, response);
        System.out.println("i am in the LoginFliter--destroy()--response after chain");

    }
}
