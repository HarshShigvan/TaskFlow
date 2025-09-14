public class Subscription {
    private int subscriptionId;
    private String type;
    private String startDate;
    private String endDate;

    // Constructor
    public Subscription(int subscriptionId, String type, String startDate, String endDate) {
        this.subscriptionId = subscriptionId;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and Setters
    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    // Method to display subscription info
    public void displaySubscriptionInfo() {
        System.out.println("Subscription ID: " + subscriptionId);
        System.out.println("Type: " + type);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
    }
}
