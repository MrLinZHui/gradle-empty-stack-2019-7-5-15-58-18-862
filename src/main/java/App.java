/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile("HUAWEI20","BLACK","HUAWEI");
        mobile.makeCall("[your input message]");
        IPhone iPhone = new IPhone();
        iPhone.makeCall("[your input message]");
        AndriodMobile andriodMobile = new AndriodMobile();
        andriodMobile.makeCall("[your input message]");
        Person person =new Person("WangWu");
        person.personCall(new IPhone());
        person.personCall(new AndriodMobile());
    }
}
