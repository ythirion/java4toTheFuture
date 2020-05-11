package tothefuture;

public class Records {

    public static void main(String[] args) {
        Range r = new Range(10, 20);
        // r.min = 1; // this will fail since min is final

        System.out.println(r);
    }

    // All state in a record is final, so no accessor (setter) methods are provided.
    // int min --> final int min
    // int max --> final int max
    record Range(int min, int max) {

        public Range {
            if (min > max)
                throw new IllegalArgumentException("Max must be >= min");
        }

        @Override
        public String toString() {
            return "Range{" +
                    "min=" + min +
                    ", max=" + max +
                    '}';
        }
    }

}
