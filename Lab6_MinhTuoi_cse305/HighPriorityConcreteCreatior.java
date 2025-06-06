public class HighPriorityConcreteCreatior extends RequestCreator {

    @Override
    public RequestProduct createRequest() {
        return new HighPriorityConcrete();
    }
    
}
