package model;

import java.util.Random;

public class Animal {
    private int id;
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.id = new Random().nextInt(1000)+1;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public boolean showInFo(){
        System.out.println("Animal [ID: "+id +", NAME: "+name+", AGE: "+"]");
        return false;
    }
    public void makeSound(){
        System.out.println("tieng keu: ");
    }
}
