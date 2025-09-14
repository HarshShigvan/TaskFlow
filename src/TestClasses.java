public class TestClasses {
    public static void main(String[] args) {
        // Test User class
        User user = new User(1, "John Doe", "john@example.com");
        user.displayUserInfo();
        user.setName("Jane Doe");
        System.out.println("Updated Name: " + user.getName());

        System.out.println();

        // Test Subscription class
        Subscription subscription = new Subscription(101, "Premium", "2023-01-01", "2023-12-31");
        subscription.displaySubscriptionInfo();
        subscription.setType("Basic");
        System.out.println("Updated Subscription Type: " + subscription.getType());

        System.out.println();

        // Test Feature class
        Feature feature = new Feature(201, "Dark Mode", "Allows user to switch to dark theme");
        feature.displayFeatureInfo();
        feature.setDescription("Enables dark theme for the application");
        System.out.println("Updated Description: " + feature.getDescription());
    }
}
