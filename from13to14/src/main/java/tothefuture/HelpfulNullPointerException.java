package tothefuture;

public class HelpfulNullPointerException {

    public static void main(String[] args) {
        Address address = new Address(null);
        User u = new User(address);

        //for some reason this did not worked as expected
        // Exception in thread "main" java.lang.NullPointerException
        // 	at tothefuture.HelpfulNullPointerException.main(HelpfulNullPointerException.java:12)
        System.out.println(u.address.street.chars());
    }

    record User (Address address){}
    record Address (String street){}

}
