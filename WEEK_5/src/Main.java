import constant.Constant;
import model.Animal;
import service.ZooService;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Animal> animals = new ArrayList<>();
    private static ZooService zooService = new ZooService(animals);

    public static void main(String[] args) {
        animals.add(new Animal("hổ", 12));
        animals.add(new Animal("chim", 21));
        animals.add(new Animal("thỏ", 2));
        animals.add(new Animal("mèo", 9));
        animals.add(new Animal("chó", 5));

        int choose;
        do {
            try{
                Constant.menu();
                choose = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                choose = 0;
            }
            switch (choose){
                case 1:
                    String continuee;
                    do {
                        String name;
                        int age;
                        do {
                            System.out.println(Constant.enter.NAME);
                            name = sc.nextLine();
                            if(name.isEmpty()){
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

                        zooService.addAnimal(new Animal(name,age));
                        System.out.println(Constant.enter.CONTINUEE);
                        continuee = sc.nextLine();
                    }while (continuee.equalsIgnoreCase("y"));
                    break;
                case 2:
                    System.out.println(Constant.message.DANH_SACH_CON_VAT);
                    zooService.showAnimals();
                    break;
                case 3:
                    System.out.println(Constant.enter.NAME);
                    String name = sc.nextLine();
                    zooService.findAnimalByName(name);
                    break;
                case 4:
                    zooService.showAnimalAge();
                    break;
                case 5:
                    System.out.println(Constant.message.THOAT);
                    break;
                default:
                    System.out.println(Constant.error.CHOOSE);
                    break;
            }

        }while (choose != 5);
    }
}