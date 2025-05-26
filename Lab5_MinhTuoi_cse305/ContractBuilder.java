interface ContractBuilder{
    void BuildContractID(String contractID);
    void BuildPropertyID(String propertyID);
    void BuildTenantID(String tenantID);
    void BuildRentAmount(double rentAmount);
    Contract Sign(String contractType);
}