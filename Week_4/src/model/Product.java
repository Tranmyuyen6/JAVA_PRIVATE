package model;

import constant.Constrant;
import service.ProductController;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private String description;
    private double price;

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Product> products = ProductController.getAllProducts();
    public Product() {
    }

    public Product(String name, String description, double price) {
        this.id = new Random().nextInt(10000)+1;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }


    public void getById(int id){
        System.out.println(Constrant.enter.ENTER_ID);
        id = Integer.parseInt(sc.nextLine());
        for(Product p : products){
            if(p.getId() != id){
                System.out.println(Constrant.error.ERROR_DATA);
            }
            else{
                System.out.println(Constrant.success.SUCCESS_DATA);
            }
        }
    }

    public String getInFo(){
        return "ID:"+this.id + ", NAME:" +this.name + ", MÔ TẢ:" +this.description + ", GIÁ:" +this.price+"tr";
    }

}
