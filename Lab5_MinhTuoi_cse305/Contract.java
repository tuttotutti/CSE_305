class Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;
    private String contractType;

    public Contract(String contractID, String propertyID, String tenantID, double rentAmount,
            String contractType) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
        this.contractType = contractType;
    }

    public String getContractID() {
        return contractID;
    }

    public String getContractType() {
        return contractType;
    }

    @Override
    public String toString() {
        return "RentalContract [contractID=" + contractID + ", propertyID=" + propertyID + ", tenantID=" + tenantID
                + ", rentAmount=" + rentAmount + ", contractType=" + contractType + "]";
    }
}
