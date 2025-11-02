import model.User;
import service.AuthService;
import service.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("a","a","a@gmail.com","0983643747"));
        users.add(new User("b","b","b@gmail.com","0649273777"));
        users.add(new User("c","c","c@gmail.com","0366275991"));
        users.add(new User("d","d","d@gmail.com","0482554576"));
        users.add(new User("e","e","e@gmail.com","0228645531"));

        UserService userService = new UserService(users);
        AuthService authService = new AuthService(userService);

        System.out.println("--- Menu Auth ---");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");

        int valueMenu = sc.nextInt();
        sc.nextLine();

        switch (valueMenu){
            case 1:
                System.out.print("ten dang nhap: ");
                String username = sc.nextLine();
                System.out.print("mat khau: ");
                String password = sc.nextLine();

                authService.login(username,password);

                if(authService.login(username,password)) {
                    System.out.println("--- Menu User ---");
                    System.out.println("1. Get user by id");
                    System.out.println("2. Get all user");
                    System.out.println("3. Change pasword");


                    int value = sc.nextInt();
                    sc.nextLine();

                    switch (value) {
                        case 1:
                            System.out.println("nhập id người dùng: ");
                            String userId = sc.nextLine();
                            System.out.println(UserService.getUserById(userId));
                            break;
                        case 2:
                            System.out.println(UserService.getAllUsers());
                            break;
                        case 3:
                            System.out.println("nhap id: ");
                            String Id = sc.nextLine();
                            System.out.println("nhap mat khau moi: ");
                            String newPassword = sc.nextLine();
                            System.out.println("nhap lai mat khau moi: ");
                            String confirmNewPassword = sc.nextLine();

                            AuthService.changePassword(Id, newPassword, confirmNewPassword);
                            break;
                    }

                }
                break;
            case 2:
                System.out.println("ten dang nhap: ");
                String name = sc.nextLine();
                System.out.println("mat khau: ");
                String pass = sc.nextLine();
                System.out.println("email: ");
                String email = sc.nextLine();
                System.out.println("so den thoai: ");
                String phoneNumber = sc.nextLine();

                AuthService.register(name, pass,email,phoneNumber);
                break;
            case 3:
                break;
            default:
                break;
        }


    }


}