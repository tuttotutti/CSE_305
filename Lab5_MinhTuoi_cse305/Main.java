import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.crypto.SecretKey;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Client client = new Client();
        System.out.println("Please enter Contract Type [Permanent, LongTerm, ShortTerm]: ");
        String contractType = sc.nextLine().trim();

        ContractBuilder builder;
        switch (contractType.toLowerCase()){
            case "permanent":
                builder = new Permanent();
                break;
            case "longterm":
                builder = new LongTerm();
                break;
            case "shortterm":
                builder = new ShortTerm();
                break;
            default:
                System.out.println("Invalid Contract Type.");
                return;
        }
        
        System.out.println("Please enter Contract ID: ");
        String contractID = sc.nextLine().trim();

        System.out.println("Please enter Property ID: ");
        String propertyID = sc.nextLine().trim();

        System.out.println("Please enter Tenant ID: ");
        String tenantID = sc.nextLine().trim();

        System.out.println("Please enter Rent Amount: ");
        double rentAmount = sc.nextDouble();
        sc.nextLine(); 

        
        Contract contract = client.requestCreateContract(builder, contractID, propertyID, tenantID, rentAmount, contractType);
        System.out.println("\nRental contract created.");
        System.out.println(contract.toString());

        String filePath = saveContractToFile(contract);

        encryptAndSaveContract(filePath);
        System.out.print("\nDo you want to save a document of this contract?: ");
        String saveDoc = sc.nextLine().trim().toLowerCase();

        if (saveDoc.equals("yes")) {
            saveDocument();
        }
    }

    public static String saveContractToFile(Contract contract) {
        try {
            String projectDirectory = System.getProperty("user.dir");
            File directory = new File(projectDirectory + "/contracts"); 
    
            if (!directory.exists()) {
                boolean created = directory.mkdirs();
                if (created) {
                    System.out.println("Directory 'contracts' created in: " + directory.getAbsolutePath());
                } else {
                    System.out.println("Error: Could not create 'contracts' directory.");
                    return null;
                }
            }
    
            String fileName = directory.getAbsolutePath() + "/" + contract.getContractType() + contract.getContractID() + "_Contract.txt";
    
            System.out.println("Saving contract to: " + fileName);
    
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(contract.toString() + "\n");
            writer.close();
    
            System.out.println("Contract saved: " + fileName);
            return fileName;
        } catch (IOException e) {
            System.out.println("Error saving contract to file: " + e.getMessage());
            return null;
        }
    }

    public static void encryptAndSaveContract(String filePath) {
        if (filePath == null) {
            System.out.println("Error: No contract file found to encrypt.");
            return;
        }

        try {
            SecretKey key = AES256Ex.generateKey();

            String contractData = AES256Ex.readFile(filePath);
            if (contractData == null) {
                System.out.println("No contract data found!");
                return;
            }

            String encryptedData = AES256Ex.encrypt(contractData, key);
            System.out.println("Encrypted Contract: " + encryptedData);

            String encryptedFilePath = filePath + "_encrypted.txt";
            AES256Ex.writeFile(encryptedFilePath, encryptedData);
            System.out.println("Encrypted contract saved to: " + encryptedFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveDocument() {
        System.out.print("Enter Document Type (Ordinary, Confidential): ");
        String docType = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter Document Name: ");
        String fileName = sc.nextLine().trim();

        System.out.print("Enter Document Content: ");
        String content = sc.nextLine().trim();

        Document document;
        if (docType.equals("ordinary")) {
            document = new OrdinaryDoc(fileName, content);
        } else if (docType.equals("confidential")) {
            document = new ConfidentialDoc(fileName, content);
        } else {
            System.out.println("Invalid document type!");
            return;
        }

        document.buildDoc();
    }
}
