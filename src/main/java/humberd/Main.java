package humberd;

public class Main {
    public static void main(String[] args) {
        MessageCommunicator messageCommunicator = new MessageCommunicator();
        messageCommunicator.deliver("test message 1");
        messageCommunicator.deliver("Joe", "test message 2");
        messageCommunicator.setDelivery("mydelivery");
        messageCommunicator.getDelivery();

    }
}