package src.controller;

import java.util.ArrayList;
import java.util.List;
import src.model.User;
import src.view.UserView;

public class UserController {
    private List<User> users;
    private UserView userView;

    public UserController(UserView userView) {
        this.userView = userView;
        this.users = new ArrayList<>();
    }

    public void addUser(int id, String name, String email, String password, long phone_no, String address) {
        User user = new User(id, name, email, password, phone_no, address);
        users.add(user);
        userView.displayMessage("User added successfully!");
    }

    public void displayUsers() {
        userView.displayAllUsers(users);
    }

    public void updateUser(int id, String newName, String newEmail, String newPassword, long newPhoneNo,
            String newAddress) {
        for (User user : users) {
            if (user.getId() == id) {
                user.setName(newName);
                user.setEmail(newEmail);
                user.setPassword(newPassword);
                user.setPhone_no(newPhoneNo);
                user.setAdress(newAddress);
                userView.displayMessage("User updated successfully!");
                return;
            }
        }
        userView.displayMessage("User not found!");
    }

    public void deleteUser(int id) {
        boolean removed = users.removeIf(user -> user.getId() == id);
        if (removed) {
            userView.displayMessage("User deleted successfully!");
        } else {
            userView.displayMessage("User not found!");
        }
    }

    public void findUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                userView.displayUser(user);
                return;
            }
        }
        userView.displayMessage("User not found!");
    }
}
