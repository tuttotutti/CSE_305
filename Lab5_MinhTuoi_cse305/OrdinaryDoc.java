import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OrdinaryDoc extends Document {
    public OrdinaryDoc(String fileName, String content){
        this.fileName = fileName;
        this.content = content;
        this.setExtension(".txt");
        this.setEncryption(false);
    }

    @Override
    public void buildDoc(){
        try{
            String projectDirectory = System.getProperty("user.dir");
            File directory = new File(projectDirectory+"/documents");

            if(!directory.exists()){
                directory.mkdirs();
            }

            String filePath = directory.getAbsolutePath() + "/" + fileName + extension;
            FileWriter writer = new FileWriter(filePath);
            writer.write(content);
            writer.close();

            System.out.println("Ordinary doc saved: "+filePath );
        }
        catch (IOException e){
            System.out.println("Error saving ordinary doc: "+e.getMessage());
        }
    }
}
