import model.User;
import service.AuthService;
import service.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("KH01","Nguyễn Văn A","NguyenVanA@123","VanA@gmail.com","0983643747"));
        users.add(new User("KH02","Nguyễn Văn B","NguyenVanB@123","VanB@gmail.com","0649273777"));
        users.add(new User("KH03","Nguyễn Văn C","NguyenVanC@123","VanC@gmail.com","0366275991"));
        users.add(new User("KH04","Nguyễn Văn D","NguyenVanD@123","VanD@gmail.com","0482554576"));
        users.add(new User("KH05","Nguyễn Văn E","NguyenVanE@123","VanE@gmail.com","0228645531"));

        AuthService authService = new AuthService();
        UserService userService = new UserService();

        System.out.println("--- Menu Auth ---");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");

        int valueMenu;
        do{
            System.out.println("nhập giá trị: ");
            valueMenu = sc.nextInt();
        }
        while(valueMenu<1 || valueMenu>3);

        switch (valueMenu){
            case 1:
                authService.
                System.out.println("--- Menu User ---");
                System.out.println("1. Get user by id");
                System.out.println("2. Get all user");
                System.out.println("3. Change pasword");

                int value;
                do{
                    System.out.println("nhập giá trị: ");
                    value = sc.nextInt();
                }
                while(value<1 || value>3);
                 switch (value){
                     case 1:
                         System.out.println(UserService.getUserById());
                         break;
                     case 2:
                         System.out.println(UserService.getAllUsers());
                         break;
                     case 3:
                         System.out.println(AuthService.changePassword());
                         break;
                 }
                  break;
            case 2:
                System.out.println(AuthService.register(users));
                break;
            case 3:
                break;
        }


    }

    }
}