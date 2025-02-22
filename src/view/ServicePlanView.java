package src.view;

import java.util.List;
import src.model.ServicePlan;

public class ServicePlanView {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayAllPlans(List<ServicePlan> plans) {
        if (plans.isEmpty()) {
            System.out.println("No service plans available.");
        } else {
            for (ServicePlan plan : plans) {
                System.out.println(plan);
            }
        }
    }

    public void displayPlan(ServicePlan plan) {
        System.out.println(plan);
    }
}
