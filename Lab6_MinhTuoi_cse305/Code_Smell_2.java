import java.util.List;

// Data Clumps in the Property constructor
// Feature Envy In FinancialReport.generateReport():

class Owner {
    private String name;
    private String location;

    public Owner(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}

class Property {
    private String name;
    private double rentAmount;
    private Owner owner;

    public Property(String name, double rentAmount, Owner owner) {
        this.name = name;
        this.rentAmount = rentAmount;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public Owner getOwner() {
        return owner;
    }

}

class FinancialReport {
    private String reportTitle;
    private List<Property> properties;
    private double totalRent;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = properties;
    }

    public void generateReport() {
        totalRent = 0;
        System.out.println("Financial Report: " + reportTitle);
        System.out.println("----------------------------");

        for (Property property : properties) {
            printPropertyDetails(property);
            totalRent += property.getRentAmount();
        }

        System.out.println("Total Rent Amount: $" + totalRent);
    }

    private void printPropertyDetails(Property property) {
        System.out.println("Property: " + property.getName());
        System.out.println("Rent Amount: $" + property.getRentAmount());
        System.out.println("Owner: " + property.getOwner().getName());
        System.out.println("Location: " + property.getOwner().getLocation());

        if (property.getRentAmount() > 2000) {
            System.out.println("This is a premium property.");
        } else {
            System.out.println("This is a standard property.");
        }

        double yearlyRent = property.getRentAmount() * 12;
        System.out.println("Yearly Rent: $" + yearlyRent);
        System.out.println("--------------------");
    }
}

class ReportGenerator {
    public static void main(String[] args) {
        Owner owner1 = new Owner("John Doe", "City Center");
        Owner owner2 = new Owner("Jane Smith", "Suburb");
        Owner owner3 = new Owner("Bob Johnson", "Downtown");

        Property property1 = new Property("Apartment A", 1500.0, owner1);
        Property property2 = new Property("House B", 2000.0, owner2);
        Property property3 = new Property("Condo C", 1800.0, owner3);

        FinancialReport report = new FinancialReport("Monthly Rent Summary",
                List.of(property1, property2, property3));
        report.generateReport();
    }
}
