public class AndriodMobile extends Mobile {
    @Override
    public void makeCall(String message) {
        if(message.length()<25) {
            System.out.println("<Andriod>Message : " +message);
        }else{
        System.out.println("<Andriod>Message : Message cannot be sent");
        }
    }
}
