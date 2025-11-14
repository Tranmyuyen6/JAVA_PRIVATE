package service;

import constant.Constant;
import model.Animal;
import model.Elephant;

import java.util.ArrayList;
import java.util.Scanner;

public class ZooService {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Animal> animals;

    public ZooService(ArrayList<Animal> animals){
        this.animals = animals;
    }

    public static void addAnimal(Animal a){
        animals.add(a);
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
        for(Animal a : animals){
            if(a.getName().equalsIgnoreCase(name)){
                System.out.println(a.showInFo());
            }
        }
    }
    public static void showAnimalAge(){
        System.out.println(Constant.message.DANH_SACH_TREN_10_TUOI);
        for(Animal a : animals){
            if(a.getAge() > 10){
                System.out.println(a.showInFo());
            }
        }
    }
}
