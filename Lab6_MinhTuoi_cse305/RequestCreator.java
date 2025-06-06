public abstract class RequestCreator {
    public abstract RequestProduct createRequest();

    public void processRequest(){
        RequestProduct newRequest = createRequest();
        newRequest.setPriority();
        newRequest.setExpire();
        newRequest.setStatus();
        newRequest.processRequest();
    }
}
