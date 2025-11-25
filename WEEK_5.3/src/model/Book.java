package model;

import service.Borrowable;

import java.util.Random;
import java.util.UUID;

public abstract class Book implements Borrowable {
    private String id;
    private String title;
    private String author;
    private double price;
    private int quantity;

    public Book() {
    }

    public Book(String title, String author, double price, int quantity) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void displayInfo(){
        System.out.println("ID:"+id+", title:"+title+", author:"+author+", price:"+price+", quantity:"+quantity);
    }

}
