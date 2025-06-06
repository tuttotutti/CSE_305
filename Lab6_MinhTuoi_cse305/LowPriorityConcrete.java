import java.time.LocalDate;

public class LowPriorityConcrete implements RequestProduct{
    private String priority;
    private String expireDay;
    private String status;

    @Override
    public void processRequest() {
        System.out.println("Request denied.");
        
    }
    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now().toString();
        
    }
    @Override
    public void setPriority() {
        this.priority = "Ignore";
        
    }
    @Override
    public void setStatus() {
        this.status ="Done";
        
    }

    
}
