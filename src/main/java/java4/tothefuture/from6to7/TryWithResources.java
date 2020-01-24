package java4.tothefuture.from6to7;

import java.io.PrintWriter;
import java.io.StringWriter;

public class TryWithResources {
    public static String tryWithResourcesOld() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        pw.write("Hello, world!");
        pw.close();
        return sw.toString();
    }

    public static String tryWithResourcesNew() {
        StringWriter sw = new StringWriter();
        try(PrintWriter pw = new PrintWriter(sw);) {
            pw.write("Hello, world!");
            return sw.toString();
        }
    }
}
