package src.view;

import java.util.List;
import src.model.User;

public class UserView {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayAllUsers(List<User> users) {
        if (users.isEmpty()) {
            System.out.println("No users available.");
        } else {
            for (User user : users) {
                System.out.println(user);
            }
        }
    }

    public void displayUser(User user) {
        System.out.println(user);
    }
}
