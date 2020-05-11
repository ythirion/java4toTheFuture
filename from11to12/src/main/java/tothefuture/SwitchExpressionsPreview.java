package tothefuture;

public class SwitchExpressionsPreview {

    public static void main(String[] args) {
        String letter = "A";

        String result = "";
        switch (letter) {
            case "A":
            case "B":
            case "C": {
                result = "ABC";
                break;
            }
            case "D":
            case "EF":
            case "G": {
                result = "DEFG";
                break;
            }
        };

        System.out.println("Old Switch Result:");
        System.out.println(result);


        // mind the fact that switch can return a value
        /*
        // this code is commented because Idea did not implemented switch expressions for Java 12
        result = switch (letter) {
            case "A", "B", "C" -> "ABC";
            case "D", "EF", "G" -> "DEFG";
            default -> {
                if(letter.isEmpty())
                    break "letter is empty";
                else
                    break "I do not know this letter";
            }

        };

        System.out.println(result);
        */
    }

}
