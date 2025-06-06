public class Code_Smell_1 {
    // Dấu // em tự viết nha cô T_T
    // Smell code: Code Duplication printSummary() and printDetails() both print content, sender, recipient
    class Message {
    private final String content;
    private final String sender;
    private final String recipient;

    public Message(String content, String sender, String recipient) {
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
    }

    private String basicPrint() {
        return "Content: " + content + "\n" +
               "Sender: " + sender + "\n" +
               "Recipient: " + recipient;
    }

    public void printSummary() {
        System.out.println(basicPrint());
    }

    public void printDetails() {
        System.out.println(basicPrint());
        System.out.println("Content Length: " + content.length());
        System.out.println("Sender Uppercase: " + sender.toUpperCase());
        System.out.println("Recipient Lowercase: " + recipient.toLowerCase());
    }
}

}
