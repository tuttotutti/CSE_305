class LongTerm implements ContractBuilder {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    public LongTerm() {

    }

    @Override
    public void BuildContractID(String contractID) {
        this.contractID = contractID;
    }

    @Override
    public void BuildPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    @Override
    public void BuildTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    @Override
    public void BuildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public Contract Sign(String contractType) {
        return new Contract(contractID, propertyID, tenantID, rentAmount, contractType);
    }
}
