package src.model;

import java.util.Date;

public class Subscription {
    private int subscriptionId;
    private int id;
    private Date start_date;
    private Date end_date;
    private boolean subscription_status;
    private int userId;
    private int planId;

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public int getId() {
        return id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public boolean getSubscriptionStatus() {
        return subscription_status;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStartDate(Date start_date) {
        this.start_date = start_date;
    }

    public void setEndDate(Date end_date) {
        this.end_date = end_date;
    }

    public void setSubscriptionStatus(boolean subscription_status) {
        this.subscription_status = subscription_status;
    }

    @Override
    public String toString() {
        return "Subscription ID: " + subscriptionId + ", User ID: " + id + ", Start Date: " + start_date
                + ", End Date: " + end_date + ", Active: " + subscription_status;
    }
}
