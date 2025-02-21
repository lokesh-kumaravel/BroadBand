package src.model;

import java.util.Date;

public class Billing {
    private int billId;
    private int subscriptionId;
    private int usageCharges;
    private boolean paymentStatus;
    private Date paymentDate;

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public int getUsageCharges() {
        return usageCharges;
    }

    public void setUsageCharges(int usageCharges) {
        this.usageCharges = usageCharges;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
