package com.softserve.homework5;

import java.util.*;

public class Product {
    private String nameProduct;
    private double priceProduct;

    public Product(String nameProduct, double priceProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.priceProduct, priceProduct) == 0 &&
                Objects.equals(nameProduct, product.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, priceProduct);
    }

    @Override
    public String toString() {
        return  "Product name = '" + nameProduct + '\'' +
                ", Price = " + priceProduct;
    }
}
