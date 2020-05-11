package tothefuture;

public class SwitchExpressions {

    public static void main(String[] args) {
        var me = 4;
        var operation = "squareMe";
        var result = switch (operation) {
            case "doubleMe" -> {
                yield me * 2; // example with yield
            }
            case "squareMe" -> me * me; // yield is "inferred", works line a regular lambda expression
            default -> me;
        };

        System.out.println(result);
    }

}
