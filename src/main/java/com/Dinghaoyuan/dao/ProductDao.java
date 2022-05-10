package com.Dinghaoyuan.dao;

import com.Dinghaoyuan.model.Product;
import com.sun.org.apache.regexp.internal.RE;

import javax.jnlp.PersistenceService;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements  IProductDao{
    @Override
    public int save(Product product, Connection con) throws SQLException {
        int n = 0;
        String sql = "insert into product(ProductName,ProductDescription,Picture,price,CategoryID) values(?,?,?,?,?)";
        PreparedStatement pt = con.prepareStatement(sql);
        pt.setString(1, product.getProductName());
        pt.setString(2, product.getProductDescription());
        if(product.getPicture()!=null) {
            //for sql server
            pt.setBinaryStream(3, product.getPicture());
            //for mysql
            //   pt.setBlob(3, product.getPicture());
        }
        pt.setDouble(4, product.getPrice());
        pt.setInt(5, product.getCategoryID());
        n = pt.executeUpdate();
        if (n > 0) {
            return n;
        }
        return 0;
    }//end save

    @Override
    public int delete(Integer productId, Connection con) {
        return 0;
    }

    @Override
    public int update(Product instance, Connection con) {
        return 0;
    }

    @Override
    public Product findById(Integer productId, Connection con) throws SQLException {
        String sql = "select * from product where productId=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,productId);
        ResultSet rs = ps.executeQuery();
        Product pd = new Product();
        while (rs.next()){
            pd.setProductID(rs.getInt("productId"));
            pd.setProductName(rs.getString("ProductName"));
            pd.setProductDescription(rs.getString("ProductDescription"));
            pd.setPrice(rs.getDouble("price"));
            pd.setCategoryID(rs.getInt("CategoryID"));
        }
        return pd;
    }

    @Override
    public List<Product> findByCategoryId(int categoryId, Connection con) {
        return null;
    }

    @Override
    public List<Product> findByPrice(double minPrice, double maxPrice, Connection con) throws SQLException {
        return null;
    }

    @Override
    public List<Product> findAll(Connection con) throws SQLException {
        List<Product> list = new ArrayList<Product>();
        String  sql = "select * from product";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            Product pd = new Product();
            pd.setProductID(rs.getInt("productId"));
            pd.setProductName(rs.getString("ProductName"));
            pd.setProductDescription(rs.getString("ProductDescription"));
            pd.setPrice(rs.getDouble("price"));
            pd.setCategoryID(rs.getInt("CategoryID"));
            list.add(pd);
        }
        return list;
    }

    @Override
    public List<Product> findByProductName(String productName, Connection con) throws SQLException {
        return null;
    }

    @Override
    public List<Product> getPicture(Integer productId, Connection con) throws SQLException {
        return null;
    }
    public byte[] getPictureById(Integer productId,Connection con)throws SQLException{
        byte[] imgByte = null;
        String sql = "select* from product where productId=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,productId);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            Blob blob = rs.getBlob("picture");
            imgByte=blob.getBytes(1,(int)blob.length());
        }
        return imgByte;
    }
}
