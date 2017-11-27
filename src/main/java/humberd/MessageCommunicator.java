package humberd;

public class MessageCommunicator {
    public void deliver(String message) {
        System.out.println(message);
    }

    public void deliver(String user, String message) {
        System.out.println(user + ", " + message);
    }

    public void setDelivery(String message) {
        System.out.println("Setting delivery" + message);
    }

    public String getDelivery() {
        System.out.println("Getting delivery" + "foo");
        return "foo";
    }
}
