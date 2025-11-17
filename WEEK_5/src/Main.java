import constant.Constant;
import model.Animal;
import model.Elephant;
import model.Lion;
import model.Monkey;
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
        animals.add(new Elephant("hổ", 12, 3));
        animals.add(new Lion("chim", 21, 45));
        animals.add(new Monkey("thỏ", 2, "chuối"));

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

                    zooService.addAnimal();
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