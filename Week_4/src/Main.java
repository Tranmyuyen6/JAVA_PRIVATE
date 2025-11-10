import constant.Constrant;
import model.Laptop;
import model.Product;
import model.SmartPhone;
import service.ProductController;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        ProductController productController = new ProductController(products);

        products.add(new Laptop("intel","may tinh gon nhe",16,"4GB", "16GHz"));
        products.add(new SmartPhone("iphone","chup anh dep",25,true));
        products.add(new Laptop("dell","bao hanh tron doi",20,"4GB", "16GHz"));
        products.add(new SmartPhone("oppo","gia dien de nhin",3,false));
        products.add(new SmartPhone("xiaomi","hieu nang cao",16,true));

        int choose;
        do {
            try{
                Constrant.menu();
                choose = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e){
                choose = 0;
            }

            switch (choose){
                case 1:
                    String type;
                    boolean check = false;
                    do {
                        System.out.println(Constrant.enter.ENTER_TYPE);
                        type = sc.nextLine();
                        if(type.equalsIgnoreCase("laptop") || type.equalsIgnoreCase("smartphone")){
                            check = true;
                        }
                        else {
                            System.out.println(Constrant.error.ERROR_TYPE);
                        }
                    }while (!check);
                    System.out.println(Constrant.enter.ENTER_NAME);
                    String name = sc.nextLine();
                    System.out.println(Constrant.enter.ENTER_DESCRIPTION);
                    String description = sc.nextLine();
                    System.out.println(Constrant.enter.ENTER_PRICE);
                    double price = Double.parseDouble(sc.nextLine());

                    productController.addProduct(type,name,description,price);
                    break;
                case 2:
                    System.out.println(Constrant.enter.ENTER_ID);
                    int id = Integer.parseInt(sc.nextLine());
                    productController.removeById(id);
                    break;
                case 3:
                    System.out.println(Constrant.enter.ENTER_ID);
                    int idd = Integer.parseInt(sc.nextLine());
                    productController.getById(idd);
                    break;
                case 4:
                    ProductController.getAllProducts();
                    break;
                case 5:
                    System.out.println("da thoat");
                    break;
                default:
                    System.out.println("lua chon khong hop le, nhap lai");
                    break;
            }
        }
        while (choose != 5);
    }
}