package java4.tothefuture.from6to7;

import java.io.PrintWriter;
import java.io.StringWriter;

public class TryWithResources {
    public static String tryWithResources() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        pw.write("Hello, world!");
        pw.flush();
        pw.close();
        return sw.toString();
    }
}
