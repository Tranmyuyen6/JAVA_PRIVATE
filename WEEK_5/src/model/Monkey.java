package model;

public class Monkey extends Animal{
    private String favoriteFood;

    public Monkey() {
    }

    public Monkey(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public Monkey(String name, int age, String favoriteFood) {
        super(name, age);
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void makeSound() {
        super.makeSound();
        System.out.println("Chit chit");
    }
}
