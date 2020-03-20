package java4.tothefuture.from4to5;

public class Generics {

    public static double addInt(int a, int b){
        return add(a, b);
    }

    public static double addLong(long a, long b){
        return add(a, b);
    }

    public static double addDouble(double a, double b){
        return add(a, b);
    }

    private static <T extends Number> double add(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }
}