package src.controller;

import java.util.*;

import src.model.ServicePlan;
import src.view.ServicePlanView;

public class ServicePlanController {
    private List<ServicePlan> plans;
    private ServicePlanView servicePlanView;
    private Map<Integer, ServicePlan> userSubscriptions;

    public ServicePlanController(ServicePlanView servicePlanView) {
        this.servicePlanView = servicePlanView;
        this.plans = new ArrayList<>();
        this.userSubscriptions = new HashMap<>();

        plans.add(new ServicePlan(1, "Basic Plan", 50, "100GB", 500, "1 Month"));
        plans.add(new ServicePlan(2, "Standard Plan", 100, "500GB", 1000, "3 Months"));
        plans.add(new ServicePlan(3, "Premium Plan", 200, "Unlimited", 2000, "12 Months"));
    }

    public void displayAllServicePlans() {
        servicePlanView.displayAllPlans(plans);
    }

    public void subscribeToPlan(int userId, int planId) {
        for (ServicePlan plan : plans) {
            if (plan.getPlanId() == planId) {
                userSubscriptions.put(userId, plan);
                servicePlanView.displayMessage("Successfully subscribed to: " + plan.getPlanName());
                return;
            }
        }
        servicePlanView.displayMessage("Invalid Plan ID! Subscription failed.");
    }

    public void viewSubscribedPlan(int userId) {
        ServicePlan plan = userSubscriptions.get(userId);
        if (plan != null) {
            servicePlanView.displayMessage("Your Subscribed Plan:");
            servicePlanView.displayPlan(plan);
        } else {
            servicePlanView.displayMessage("You have not subscribed to any plan.");
        }
    }
}
