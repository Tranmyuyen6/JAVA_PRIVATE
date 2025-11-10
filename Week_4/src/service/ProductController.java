package service;

import java.util.ArrayList;
import java.util.Scanner;

import constant.Constrant;
import model.Product;
import model.Laptop;
import model.SmartPhone;


public class ProductController {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Product> products;

    public ProductController(ArrayList<Product> products){
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }
    public void addProduct(String type, String name, String description, double price){

        if(type.equalsIgnoreCase("laptop")){
            System.out.println(Constrant.enter.ENTER_RAM);
            String ram = sc.nextLine();
            System.out.println(Constrant.enter.ENTER_CPU);
            String cpu = sc.nextLine();
            products.add(new Laptop(name,description,price,ram,cpu));
            System.out.println(Constrant.success.SUCCESS_ADD);
            return;
        }
        if(type.equalsIgnoreCase("smartphone")){
            boolean has5G = false;
            boolean check = false;
            do {
                System.out.println(Constrant.enter.ENTER_HAS5G);
                String has5g = sc.nextLine();
                if(has5g.equalsIgnoreCase("y")){
                    has5G = true;
                    check = true;
                }
                else if (has5g.equalsIgnoreCase("n")){
                    has5G = false;
                    check = true;
                }
            }while (!check);
            products.add(new SmartPhone(name, description, price, has5G));
            System.out.println(Constrant.success.SUCCESS_ADD);
            return;
        }

        System.out.println(Constrant.error.ERROR_TYPE);

    }
    public void removeById(int id){
        Product p = getById(id);
        if(p != null){
            products.remove(p);
            System.out.println(Constrant.success.SUCCESS_RM);
        }
        else {
            System.out.println(Constrant.error.ERROR_DATA);
        }
    }
    public Product getById(int id){
        for(Product p : products){
            if(p.getId() == id){
                System.out.println(p.getInFo());
                return p;
            }
        }
        System.out.println(Constrant.error.ERROR_DATA);
        return null;
    }
    public static ArrayList<Product> getAllProducts(){
        if(products.isEmpty()) {
            System.out.println(Constrant.error.ERROR_EMPTY);
        }
        else{
            System.out.println(Constrant.hienThi.DANHSACH);
            for (Product p : products) {
                System.out.println(p.getInFo());
            }
        }

        return null;
    }
}
