package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.User;

public class UserService {
    public UserService() {
    }

    static Scanner sc = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();
    public static void getUserById(String userId){
        System.out.println("nhập id người dùng: ");
        userId = sc.nextLine();
        for(User user4 : users){
           if(user4.getId().equals(userId)){
               user4.toString();
           }
        }
    }
    public static void getAllUsers(){
        users.toString();
    }
}
