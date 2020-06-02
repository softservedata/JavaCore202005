package com.softserve.homework5;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @DisplayName("Happy path")
    @Test
    public void objectEquals_true(){
        Product product1 = new Product("Carrot", 28);
        Product product2 = new Product("Carrot", 28);
        Assert.assertEquals(true, product1.equals(product2));
    }

    @DisplayName("Negative flow")
    @Test
    public void objectEquals_false(){
        Product product = new Product("Tomat", 28);
        Product product1 = new Product("Carrot", 28);
        Assert.assertEquals(false, product.equals(product1));
    }

    @DisplayName("Null flow")
    @Test
    public void objectEqualsNull_false(){
        Product product = new Product("Tomat", 28);
        Assert.assertEquals(false, product.equals(null));
    }

    @DisplayName("Negative flow with another class")
    @Test
    public void objectEqualsToOtherObject_false(){
        Product product = new Product("Tomat", 28);
        App app = new App();
        Assert.assertEquals(false, product.equals(app));
    }
}
