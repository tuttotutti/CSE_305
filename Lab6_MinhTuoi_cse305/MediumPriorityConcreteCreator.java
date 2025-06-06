public class MediumPriorityConcreteCreator extends RequestCreator{

    @Override
    public RequestProduct createRequest() {
        return new MediumPriorityConcrete();
    }
    
}
