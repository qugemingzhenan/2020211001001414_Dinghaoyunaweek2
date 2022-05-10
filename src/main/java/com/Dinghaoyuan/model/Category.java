package com.Dinghaoyuan.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Category {
    private int CategoryID;
    private String CategoryName;
    private String Description;
    private boolean active;

    public Category(){}

    public Category(int categoryID, String categoryName, String description, boolean active) {
        CategoryID = categoryID;
        CategoryName = categoryName;
        Description = description;
        this.active = active;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Category{" +
                "CategoryID=" + CategoryID +
                ", CategoryName='" + CategoryName + '\'' +
                ", Description='" + Description + '\'' +
                ", active=" + active +
                '}';
    }

    public static List<Category> findAllCategory(Connection con){
        String sql="select * from category";
        ArrayList<Category> list = new ArrayList<>();
        try{
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                Category c = new Category();
                c.setCategoryID(rs.getInt("CategoryID"));
                c.setCategoryName(rs.getString("CategoryName"));
                c.setDescription(rs.getString("Description"));
                list.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static String findByCategoryId(Connection con,int categoryID){
        String CategoryName = null;
        try{
            String queryString = "select * from category where CategoryID=?";
            PreparedStatement st = con.prepareStatement(queryString);
            st.setInt(1,categoryID);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                CategoryName = rs.getString("CategoryName");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return CategoryName;
    }
}
