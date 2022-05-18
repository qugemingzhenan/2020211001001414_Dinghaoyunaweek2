package com.Dinghaoyuan.controller;

import com.Dinghaoyuan.dao.ProductDao;
import com.Dinghaoyuan.model.Category;
import com.Dinghaoyuan.model.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

@WebServlet(value = "/admin/addProduct")
@MultipartConfig(maxFileSize = 16177215)

public class AddProductServlet extends HttpServlet {
    private Connection con = null;
    public void init(){
        con = (Connection) getServletContext().getAttribute("con");
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Category category = new Category();
        List<Category> categoryList = Category.findAllCategory(con);
        request.setAttribute("categoryList",categoryList);
        String path = "/WEB-INF/views/admin/addProduct.jsp";
        request.getRequestDispatcher(path).forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productName = request.getParameter("ProductName");
        Double price = request.getParameter("price")!=null?Double.parseDouble(request.getParameter("price")):0.0;
        int categoryID = request.getParameter("CategoryID")!=null?Integer.parseInt(request.getParameter("CategoryID")):0;
        String ProductDescription = request.getParameter("ProductDescription");

        InputStream inputStream = null;
        Part filePart = request.getPart("picture");
        if(filePart!=null){
            inputStream = filePart.getInputStream();
        }
        Product product = new Product();
        product.setProductName(productName);
        product.setPrice(price);
        product.setProductDescription(ProductDescription);
        product.setCategoryID(categoryID);
        product.setPicture(inputStream);
        ProductDao productDao = new ProductDao();

        try{
            int n = productDao.save(product,con);
            if(n>0){
                response.sendRedirect("productList");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
