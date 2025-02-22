package src;

import java.util.Scanner;
import src.controller.UserController;
import src.controller.ServicePlanController;
import src.view.UserView;
import src.view.ServicePlanView;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Initialize Views and Controllers
        UserView userView = new UserView();
        UserController userController = new UserController(userView);

        ServicePlanView servicePlanView = new ServicePlanView();
        ServicePlanController servicePlanController = new ServicePlanController(servicePlanView);

        while (true) {
            System.out.println("\n==== BroadBand Management System ====");
            System.out.println("1. User Management");
            System.out.println("2. Service Plan Management");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            int mainChoice = in.nextInt();
            in.nextLine();

            switch (mainChoice) {
                case 1:
                    manageUsers(in, userController);
                    break;
                case 2:
                    System.out.print("Enter Your User ID: ");
                    int userId = in.nextInt();
                    in.nextLine();
                    manageServicePlans(in, servicePlanController, userId);
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    in.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

    private static void manageUsers(Scanner in, UserController userController) {
        while (true) {
            System.out.println("\n==== User Management ====");
            System.out.println("1. Add User");
            System.out.println("2. View Users");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter Choice: ");

            int choice = in.nextInt();
            in.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Id: ");
                    int id = in.nextInt();
                    in.nextLine();

                    System.out.print("Enter Name: ");
                    String name = in.nextLine();

                    System.out.print("Enter Email: ");
                    String email = in.next();

                    System.out.print("Enter Password: ");
                    String password = in.next();

                    System.out.print("Enter Phone No: ");
                    long phone = in.nextLong();
                    in.nextLine();

                    System.out.print("Enter Address: ");
                    String address = in.nextLine();

                    userController.addUser(id, name, email, password, phone, address);
                    break;

                case 2:
                    userController.displayUsers();
                    break;

                case 3:
                    System.out.print("Enter User ID to Update: ");
                    int updateId = in.nextInt();
                    in.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = in.nextLine();

                    System.out.print("Enter New Email: ");
                    String newEmail = in.next();

                    System.out.print("Enter New Password: ");
                    String newPassword = in.next();

                    System.out.print("Enter New Phone No: ");
                    long newPhone = in.nextLong();
                    in.nextLine();

                    System.out.print("Enter New Address: ");
                    String newAddress = in.nextLine();

                    userController.updateUser(updateId, newName, newEmail, newPassword, newPhone, newAddress);
                    break;

                case 4:
                    System.out.print("Enter User ID to Delete: ");
                    int deleteId = in.nextInt();
                    userController.deleteUser(deleteId);
                    break;

                case 5:
                    return; // Go back to Main Menu

                default:
                    System.out.println("Invalid input. Please enter a valid option.");
            }
        }
    }

    private static void manageServicePlans(Scanner in, ServicePlanController servicePlanController, int userId) {
        while (true) {
            System.out.println("\n==== Service Plan Management ====");
            System.out.println("1. View Available Service Plans");
            System.out.println("2. Subscribe to a Plan");
            System.out.println("3. View My Subscribed Plan");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter Choice: ");

            int choice = in.nextInt();
            in.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    servicePlanController.displayAllServicePlans();
                    break;

                case 2:
                    System.out.print("\nEnter the Service Plan ID to subscribe: ");
                    int selectedPlanId = in.nextInt();
                    in.nextLine(); // Consume newline
                    servicePlanController.subscribeToPlan(userId, selectedPlanId);
                    break;

                case 3:
                    servicePlanController.viewSubscribedPlan(userId);
                    break;

                case 4:
                    return; // Exit service plan management

                default:
                    System.out.println("Invalid input. Please enter a valid option.");
            }
        }
    }

}
