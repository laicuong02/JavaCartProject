package com.example.javacartproject;

import android.content.ContentValues;

import java.util.Objects;

public class Product {

    private String category;
    private String name;
    private double price;
    private int image;


    public Product() {}


    public Product(String category, String name, double price, int image) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.image = image;
    }


    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Product product = (Product) object;
        return image == product.image &&
                Objects.equals(category, product.category) &&
                Objects.equals(name, product.name) &&
                Objects.equals(price, product.price);
    }


    @Override
    public int hashCode() {
        return Objects.hash(category, name, price, image);
    }


    public ContentValues getContentValues() {
        ContentValues values = new ContentValues();
        values.put(ProductTableDataGateway.PRODUCT_COLUMN_CATEGORY, category);
        values.put(ProductTableDataGateway.PRODUCT_COLUMN_NAME, name);
        values.put(ProductTableDataGateway.PRODUCT_COLUMN_PRICE, price);
        values.put(ProductTableDataGateway.PRODUCT_COLUMN_IMAGE, image);
        return values;
    }
}
