package tothefuture;

public class PatternMatchingInstanceOf {

    public static void main(String[] args) {
        Object obj = "string value";

        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s);
        }

        // this code is commented because Idea did not implemented pattern matching for instanceOf for Java 12
        /*
        if (obj instanceof String s) {
            System.out.println(s);
        }
        */

    }

}
