public class IPhone extends Mobile {
    @Override
    public void makeCall(String message) {
        if(message.length()<25) {
            System.out.println("<iPhone>Message : " + message);
        }else{
            System.out.println("iPhone>Message : Message cannot be sent");
        }
    }
}
