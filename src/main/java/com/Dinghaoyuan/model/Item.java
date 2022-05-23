package com.Dinghaoyuan.model;

public class Item {
    private Product product;
    private int quantity;
    public Item(){

    }

    public Item(Product product, int qunatity) {
        this.product = product;
        this.quantity = qunatity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int qunatity) {
        this.quantity = qunatity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "product=" + product +
                ", qunatity=" + quantity +
                '}';
    }
}
