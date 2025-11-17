package service;

import constant.Constant;
import model.Animal;
import model.Elephant;
import model.Lion;
import model.Monkey;

import java.util.ArrayList;
import java.util.Scanner;

public class ZooService {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Animal> animals;


    public ZooService(ArrayList<Animal> animals){
        this.animals = animals;
    }

    public static void addAnimal(){
        boolean check = false;
        String name = null;
        int age = 0;
        System.out.println("nhap giong loai:");
        String type = sc.nextLine();
        do {
            System.out.println(Constant.enter.NAME);
            name = sc.nextLine();
            if(name.trim().isEmpty()){
                System.out.println(Constant.error.NAME);
            }
        }while (name.isEmpty());
        do {
            System.out.println(Constant.enter.AGE);
            age = Integer.parseInt(sc.nextLine());
            if(age <= 0){
                System.out.println(Constant.error.AGE);
            }
        }while (age <= 0);

        do {

            if(type.equalsIgnoreCase("voi")){
                System.out.println("nhap do dai voi: ");
                double trunkLength = Double.parseDouble(sc.nextLine());
                animals.add(new Elephant(name,age,trunkLength));
                check = true;
            }
            if(type.equalsIgnoreCase("hổ")){
                System.out.println("nhap can nang: ");
                double weight = Double.parseDouble(sc.nextLine());
                animals.add(new Lion(name,age,weight));
                check = true;
            }
            if(type.equalsIgnoreCase("khỉ")){
                System.out.println("nhap do an yeu thich: ");
                String favoriteFood= sc.nextLine();
                animals.add(new Monkey(name,age,favoriteFood));
                check = true;
            }
        }while (!check);
        System.out.println("đã thêm ");
    }
    public static void showAnimals(){
        if(!animals.isEmpty()){
            for(Animal a : animals){
                a.showInFo();
                a.makeSound();
            }
        }
        else {
            System.out.println(Constant.message.EMPTY);
        }
    }
    public static void findAnimalByName(String name){
        boolean check = false;
        for(Animal a : animals){
            if(a.getName().equalsIgnoreCase(name)){
                a.showInFo();
                a.makeSound();
                check = true;
            }
        }
        if(!check){
            System.out.println("không tìm thấy");
        }
    }
    public static void showAnimalAge(){
        System.out.println(Constant.message.DANH_SACH_TREN_10_TUOI);
        boolean check = false;
            for(Animal a : animals){
                if(a.getAge() > 10){
                    a.showInFo();
                    a.makeSound();
                    check = true;
                }
            }
        if(!check){
            System.out.println("khong co");
        }

    }
}
