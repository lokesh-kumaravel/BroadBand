package src.model;

public class ServicePlan {
    private int planId;
    private String planName;
    private int dataSpeed;
    private String dataLimit;
    private int price;
    private String planDuration;

    public ServicePlan(int planId, String planName, int dataSpeed, String dataLimit, int price, String planDuration) {
        this.planId = planId;
        this.planName = planName;
        this.dataSpeed = dataSpeed;
        this.dataLimit = dataLimit;
        this.price = price;
        this.planDuration = planDuration;
    }

    public int getPlanId() {
        return planId;
    }

    public String getPlanName() {
        return planName;
    }

    public int getDataSpeed() {
        return dataSpeed;
    }

    public String getDataLimit() {
        return dataLimit;
    }

    public int getPrice() {
        return price;
    }

    public String getPlanDuration() {
        return planDuration;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public void setPlanName(String planname) {
        this.planName = planname;
    }

    public void setDataSpeed(int dataSpeed) {
        this.dataSpeed = dataSpeed;
    }

    public void setDataLimit(String dataLimit) {
        this.dataLimit = dataLimit;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPlanDuration(String planDuration) {
        this.planDuration = planDuration;
    }

    @Override
    public String toString() {
        return "ServicePlan{" +
                "planId=" + planId +
                ", planName='" + planName + '\'' +
                ", dataSpeed=" + dataSpeed + " Mbps" +
                ", dataLimit='" + dataLimit + '\'' +
                ", price=" + price + " INR" +
                ", planDuration='" + planDuration + '\'' +
                '}';
    }

}
