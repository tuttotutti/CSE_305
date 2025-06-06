import java.time.LocalDate;

public class HighPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;
    @Override
    public void processRequest() {
        System.out.println("Emergency request, our administator will contact you immediately!");
        
    }
    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now().toString();
        
    }
    @Override
    public void setPriority() {
       this.priority ="Emergency";
        
    }
    @Override
    public void setStatus() {
        this.status = "Accept";
        
    }

    
}
