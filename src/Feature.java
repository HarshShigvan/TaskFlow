public class Feature {
    private int featureId;
    private String featureName;
    private String description;

    // Constructor
    public Feature(int featureId, String featureName, String description) {
        this.featureId = featureId;
        this.featureName = featureName;
        this.description = description;
    }

    // Getters and Setters
    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Method to display feature info
    public void displayFeatureInfo() {
        System.out.println("Feature ID: " + featureId);
        System.out.println("Feature Name: " + featureName);
        System.out.println("Description: " + description);
    }
}
