package Lab2_MinhTuoi;

public class Property {

    private int propertyID;
    private String description;
    private int propertyOwnerId; 

    public Property(int propertyID, String description, int propertyOwnerId) {
        this.propertyID = propertyID;
        this.description = description;
        this.propertyOwnerId = propertyOwnerId;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPropertyOwnerId() {
        return propertyOwnerId;
    }

    public void setPropertyOwnerID(int propertyOwnerID) {
        this.propertyOwnerId = propertyOwnerID;
    }
}
