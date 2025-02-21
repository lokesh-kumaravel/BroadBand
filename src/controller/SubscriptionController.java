package src.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import src.model.Subscription;
import src.view.SubscriptionView;

public class SubscriptionController {
    private List<Subscription> subscriptions;
    private SubscriptionView subscriptionView;

    // Constructor
    public SubscriptionController(SubscriptionView subscriptionView) {
        this.subscriptionView = subscriptionView;
        this.subscriptions = new ArrayList<>();
    }

    // Add a new subscription
    public void addSubscription(int subscriptionId, int userId, Date startDate, Date endDate, boolean status) {
        Subscription subscription = new Subscription();
        subscription.setSubscriptionId(subscriptionId);
        subscription.setId(userId);
        subscription.setStartDate(startDate);
        subscription.setEndDate(endDate);
        subscription.setSubscriptionStatus(status);

        subscriptions.add(subscription);
        subscriptionView.displayMessage("Subscription added successfully!");
    }

    // Display all subscriptions
    public void displaySubscriptions() {
        subscriptionView.displayAllSubscriptions(subscriptions);
    }

    // Update subscription
    public void updateSubscription(int subscriptionId, Date newStartDate, Date newEndDate, boolean newStatus) {
        for (Subscription subscription : subscriptions) {
            if (subscription.getSubscriptionId() == subscriptionId) {
                subscription.setStartDate(newStartDate);
                subscription.setEndDate(newEndDate);
                subscription.setSubscriptionStatus(newStatus);
                subscriptionView.displayMessage("Subscription updated successfully!");
                return;
            }
        }
        subscriptionView.displayMessage("Subscription not found!");
    }

    // Delete subscription
    public void deleteSubscription(int subscriptionId) {
        boolean removed = subscriptions.removeIf(subscription -> subscription.getSubscriptionId() == subscriptionId);
        if (removed) {
            subscriptionView.displayMessage("Subscription deleted successfully!");
        } else {
            subscriptionView.displayMessage("Subscription not found!");
        }
    }

    // Find subscription by ID
    public void findSubscriptionById(int subscriptionId) {
        for (Subscription subscription : subscriptions) {
            if (subscription.getSubscriptionId() == subscriptionId) {
                subscriptionView.displaySubscription(subscription);
                return;
            }
        }
        subscriptionView.displayMessage("Subscription not found!");
    }
}
