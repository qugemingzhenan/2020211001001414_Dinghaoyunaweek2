package com.Dinghaoyuan.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "HelloFilter",urlPatterns = {"/hello"})
public class HelloFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
        System.out.println("i am in the hellofilter-->init()");
    }

    public void destroy() {
        System.out.println("i am in the hellofilter-->destroy()");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("i am in the hellofilter-->dofilter() - before servlet - (request come here)" );
        chain.doFilter(request, response);
        System.out.println("i am in the hellofilter-->dofilter() - after servlet - (response come here)" );
    }
}
