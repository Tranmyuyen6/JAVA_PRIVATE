package service;

import model.User;
import java.util.ArrayList;

public class AuthService {
    private static UserService userService;
    public AuthService(UserService userService) {
        this.userService = userService;
    }

    public static boolean login(String username, String password){
        ArrayList<User> users = userService.getAllUsers();
        boolean exactly = false;

        for(User user1 : users){
            if(user1.getUsername().equals(username)){
                if(user1.getPassword().equals(password)){
                    exactly = true;
                    break;
                }
            }
        }
        if(exactly){

            System.out.println("dang nhap thanh cong!");

        }
        else {
            System.out.println("dang nhap khong thanh cong, nhap lai");
        }

        return exactly;
    }
    public static void register(String username, String password, String email, String phoneNumber){
        ArrayList<User> users = userService.getAllUsers();
        for(User user : users){
            if(user.getUsername().equals(username)){
                System.out.println("ten dang nhap da ton tai, nhap lai");
                return;
            }
            if(user.getEmail().equals(email)){
                System.out.println("email da ton tai, nhap lai");
                return;
            }
            if(user.getPhoneNumber().equals(phoneNumber)){
                System.out.println("so dien thoai da ton tai, nhap lai");
                return;
            }
        }
        users.add(new User(username,password,email,phoneNumber));
        System.out.println("dang ki thanh cong");
    }
    public static void changePassword(String userId, String newPassword, String confirmNewPassword){
        ArrayList<User> users = userService.getAllUsers();
        for(User user : users){
            if(user.getId().equals(userId)){
                if(newPassword.equals(confirmNewPassword)){
                    user.setPassword(newPassword);
                    System.out.println("thay mat khau thanh cong");
                    return;
                }
            }
        }
        System.out.println("thay doi mat khau khong thanh cong");
    }
}
