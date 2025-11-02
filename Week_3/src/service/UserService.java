package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.User;

public class UserService {

    private static ArrayList<User> users;

    public UserService( ArrayList<User> users) {
        this.users = users;
    }
    public static User getUserById(String userId){
        for(User user4 : users){
           if(user4.getId().equals(userId)){
               return user4;
           }

        }
        return null;
    }
    public static ArrayList<User> getAllUsers(){
        return users;
    }
}
