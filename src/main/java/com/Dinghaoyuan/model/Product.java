package com.Dinghaoyuan.model;

import java.io.InputStream;

public class Product {
    private int ProductID;
    private String ProductName;
    private String ProductDescription;
    private InputStream Picture;
    private double price;
    private int CategoryID;

    public Product(){}

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String productDescription) {
        ProductDescription = productDescription;
    }

    public InputStream getPicture() {
        return Picture;
    }

    public void setPicture(InputStream picture) {
        Picture = picture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public Product(int productID, String productName, String productDescription, InputStream picture, double price, int categoryID) {
        ProductID = productID;
        ProductName = productName;
        ProductDescription = productDescription;
        Picture = picture;
        this.price = price;
        CategoryID = categoryID;
    }

    @Override
    public String toString() {
        return "Project{" +
                "ProductID=" + ProductID +
                ", ProductName='" + ProductName + '\'' +
                ", ProductDescription='" + ProductDescription + '\'' +
                ", Picture=" + Picture +
                ", price=" + price +
                ", CategoryID=" + CategoryID +
                '}';
    }
}
