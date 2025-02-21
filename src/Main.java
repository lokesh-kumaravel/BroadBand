package src;

import java.util.Scanner;

import src.controller.UserController;
import src.view.UserView;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        UserView userView = new UserView();
        UserController userController = new UserController(userView);
        while (true) {
            System.out.println();
            System.out.println("BroadBand user Management");
            System.out.println("1. Add User");
            System.out.println("2. View User");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Exit");
            System.out.println("Enter Choice : ");

            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Id : ");
                    int id = in.nextInt();
                    System.out.println("Enter name : ");
                    String name = in.next();
                    System.out.println("Enter email : ");
                    String email = in.next();
                    System.out.println("Enter Password : ");
                    String password = in.next();
                    System.out.println("Enter phone no : ");
                    long phone = in.nextLong();
                    System.out.println("Enter Address : ");
                    String address = in.next();
                    userController.addUser(id, name, email, password, phone, address);
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
            break;
        }
    }
}