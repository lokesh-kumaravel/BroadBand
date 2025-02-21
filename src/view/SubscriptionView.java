package src.view;

import java.util.List;
import src.model.Subscription;

public class SubscriptionView {
    // Display a message
    public void displayMessage(String message) {
        System.out.println(message);
    }

    // Display all subscriptions
    public void displayAllSubscriptions(List<Subscription> subscriptions) {
        if (subscriptions.isEmpty()) {
            System.out.println("No subscriptions available.");
        } else {
            for (Subscription subscription : subscriptions) {
                System.out.println(subscription);
            }
        }
    }

    // Display single subscription details
    public void displaySubscription(Subscription subscription) {
        System.out.println(subscription);
    }
}
