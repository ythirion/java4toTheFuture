package tothefuture;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormat {

    public static void main(String[] args) {
        final Locale locale = new Locale("en", "US");

        NumberFormat upvotes = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.SHORT);
        upvotes.setMaximumFractionDigits(1);

        // 2.6K upvotes --> mind the "K" letter
        System.out.println(upvotes.format(2592) + " upvotes");


        upvotes = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.LONG);
        upvotes.setMaximumFractionDigits(2);

        //2.59 thousand upvotes --> mind the "thousand" word
        System.out.println(upvotes.format(2592) + " upvotes");
    }

}
