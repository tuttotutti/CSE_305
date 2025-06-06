public class Main {
    public static void main(String[] args) {
        System.out.println("Low Priority Request: ");
        RequestCreator lowPriority = new LowPriorityConcreteCreator();
        lowPriority.processRequest();
        System.out.println("Medium Priority Request: ");
        RequestCreator mediumPriority = new MediumPriorityConcreteCreator();
        mediumPriority.processRequest();
        System.out.println("High Priority Request: ");
        RequestCreator highPriority = new HighPriorityConcreteCreatior();
        highPriority.processRequest(); 
    }
}
