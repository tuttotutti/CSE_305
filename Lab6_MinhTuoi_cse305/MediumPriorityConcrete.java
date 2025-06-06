import java.time.LocalDate;

public class MediumPriorityConcrete implements RequestProduct{
    private String priority;
    private String expireDay;
    private String status;
    @Override
    public void processRequest() {
        System.out.println("Request accent, estimated completion date is "+expireDay);
        
    }
    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now().plusMonths(1).toString();
        
    }
    @Override
    public void setPriority() {
        this.priority = "Medium";
        
    }
    @Override
    public void setStatus() {
        this.status = "Accepted";
        
    }

    
}
