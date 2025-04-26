package models;

public class RentalContract {
    private int contractID;
    private int propertyID;
    private int tenantID;
    private double rentAmout;
    private boolean isActive;
    public RentalContract(int contractID, int propertyID, int tenantID, double rentAmout) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmout = rentAmout;
        this.isActive= true;
    }

    public void terminatcontract(){
        isActive= false;
    }

    public int getContractID() {
        return contractID;
    }
    public void setContractID(int contractID) {
        this.contractID = contractID;
    }
    public int getPropertyID() {
        return propertyID;
    }
    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }
    public int getTenantID() {
        return tenantID;
    }
    public void setTenantID(int tenantID) {
        this.tenantID = tenantID;
    }
    public double getRentAmout() {
        return rentAmout;
    }
    public void setRentAmout(double rentAmout) {
        this.rentAmout = rentAmout;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    
}
