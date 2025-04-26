package models;

import java.util.ArrayList;

public class RegisterUser {
    static ArrayList<User> userList;

    public RegisterUser() {
        userList = new ArrayList<>();
    }
    public void addUser(User user) {
        userList.add(user);
    }
    public void removeUser(User user) {
        userList.remove(user);
    }
}
