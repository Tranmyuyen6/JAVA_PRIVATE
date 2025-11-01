package service;

import model.User;
import java.util.ArrayList;
import java.util.Scanner;

public class AuthService {
    public AuthService() {
    }
    static ArrayList<User> users = new ArrayList<>();

    static Scanner sc  = new Scanner(System.in);
    public static void login(String username, String password){
        System.out.println("tên đăng nhập: ");
        username = sc.nextLine();
        System.out.println("mật khẩu: ");
        password = sc.nextLine();

        boolean exactly = false;

        for(User user1 : users){
            if(user1.getUsername().equals(username)){
                if(user1.getPassword().equals(password)){
                    exactly = true;
                }
            }
        }
        if(exactly){
            System.out.println("đăng nhập thành công!");
        }
        else{
            do{
                System.out.println("tên đăng nập hoặc mật khẩu sai, vui lòng ăng nhập lại!");
                System.out.println("tên đăng nhập: ");
                username = sc.nextLine();
                System.out.println("mật khẩu: ");
                password = sc.nextLine();
            }
            while (!exactly);
        }

    }
    public static void register(String username, String password, String email, String phoneNumber){
        boolean hopLe = false;

        do {
            System.out.println("tên đăng nhập: ");
            username = sc.nextLine();
            for(User user2 : users){
                if(user2.getUsername().equals(username)){
                    System.out.println("tên đăng nhập đã tồn tại, nhập lại!");
                    hopLe = true;
                }
            }
        }
        while (!hopLe);

        hopLe = false;
        System.out.println("mật khẩu: ");
        password = sc.nextLine();
        do {
            System.out.println("email: ");
            email = sc.nextLine();
            for(User user2 : users){
                if(user2.getEmail().equals(email)){
                    System.out.println("email đã được đăng kí, nhập lại!");
                    hopLe = true;
                }
            }
        }
        while (!hopLe);
        hopLe = false;

        do {
            System.out.println("số điện thoại: ");
            phoneNumber = sc.nextLine();
            for(User user2 : users){
                if(user2.getEmail().equals(email)){
                    System.out.println("số điện thoại đã được đăng kí, nhập lại!");
                    hopLe = true;
                }
            }
        }
        while (!hopLe);

        users.add(new User(username,password,email,phoneNumber));
        login(username,password);
    }
    public static void changePassword(String userId, String newPassword, String confirmNewPassword){
        boolean setPass = false;
        do {
            System.out.println("nhập id: ");
            userId = sc.nextLine();
            for(User user3 : users){
                if(user3.getId().equals(userId)){
                    setPass = true;
                }
                else{
                    System.out.println("sai id, nhập lại!");
                }
            }
        }while (!setPass);
        setPass = false;

        do {
            System.out.println("nhập mật khẩu mới: ");
            newPassword = sc.nextLine();
            for(User user3 : users){
                if(user3.getPassword().equals(newPassword)){
                    System.out.println("mật khẩu mới trùng với mật kkẩu cũ, nhập lại!");
                }
                else {
                    do {
                        System.out.println("xác nhận mật khẩu: ");
                        confirmNewPassword = sc.nextLine();
                        if(confirmNewPassword == newPassword){
                            user3.setPassword(newPassword);
                            System.out.println("đổi mật khẩu thành công");
                            setPass = true;
                            return;
                        }
                        else {
                            System.out.println("mật khẩu xác nhận không chính xác, nhập lai!");
                            setPass = false;
                        }
                    }
                    while (!setPass);
                }
            }
        }
        while (!setPass);
    }
}
