package tothefuture;

public class PatternMatchingInstanceOf {

    public static void main(String[] args) {
        Object obj = "string value";

        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s);
        }

        // s is a alias-like variable based on casting obj to String
        if (obj instanceof String s) {
            System.out.println(s);
        }

    }

}
