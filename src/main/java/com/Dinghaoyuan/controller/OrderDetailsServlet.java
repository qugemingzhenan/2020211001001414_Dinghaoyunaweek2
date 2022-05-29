package com.Dinghaoyuan.controller;

import com.Dinghaoyuan.dao.OrderDao;
import com.Dinghaoyuan.model.Item;
import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet("/OrderDetails")
public class OrderDetailsServlet extends HttpServlet {
    Connection con =null;

    @Override
    public void init() throws ServletException {
        con = (Connection) getServletContext().getAttribute("con");
        super.init();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int orderId = request.getParameter("orderId")!=null?Integer.parseInt(request.getParameter("orderId")):0;
        Item item = new Item();
        OrderDao orderDao = new OrderDao();
        List<Item> itemList = orderDao.findItemsByOrderId(con,orderId);
        request.setAttribute("itemList",itemList);
        String path = "orderDetails.jsp";
        request.getRequestDispatcher(path).forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
