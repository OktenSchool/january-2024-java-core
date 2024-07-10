package org.okten;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Product {

    private String name;

    private BigDecimal price;

    private String description;

    private int quantity;

    private ArrayList<String> reviews = new ArrayList<>();

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, BigDecimal price, String description, int quantity) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public void removeReview(String review) {
        reviews.remove(review);
    }
}
