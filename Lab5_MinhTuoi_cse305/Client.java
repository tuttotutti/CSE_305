class Client {
    public Contract requestCreateContract(ContractBuilder builder, String contractID, String propertyID, String tenantID, double rentAmount, String contractType){
        builder.BuildContractID(contractID);
        builder.BuildPropertyID(propertyID);
        builder.BuildTenantID(tenantID);
        builder.BuildRentAmount(rentAmount);
        return builder.Sign(contractType);
    }
}
