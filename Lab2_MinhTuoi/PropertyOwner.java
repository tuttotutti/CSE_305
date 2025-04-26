package models;

import java.util.List;

public class PropertyOwner {
    private User user;
    private List<Property> propertyList;

    public PropertyOwner() {}

    public PropertyOwner(User user, List<Property> propertyList) {
        this.user = user;
        this.propertyList = propertyList;
    }

    public boolean removeProperty(Property property) {
        if (propertyList.contains(property)) {
            propertyList.remove(property);
            return true;
        } else {
            return false;
        }
    }

    public boolean addProperty(Property property) {
        if (propertyList.contains(property)) {
            return false;
        } else {
            propertyList.add(property);
            return true;
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }
}
