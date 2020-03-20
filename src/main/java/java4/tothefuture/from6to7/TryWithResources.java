package java4.tothefuture.from6to7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TryWithResources {
    /**
     * This function uses a PrintWriter to write in a StringWriter the content "Hello, world!".
     * TODO: Refactor using try/resources.
     */
    public static String printWriter() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        pw.write("Hello, world!");
        pw.close();
        return sw.toString();
    }

    /**
     * This function read the given file and extracts the words from it.
     * TODO: Refactor using try/resources.
     */
    public static List<String> readWords(File file) throws FileNotFoundException {
        Scanner scanner = null;
        List<String> words = new ArrayList<String>();
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                words.addAll(words(scanner.nextLine()));
            }
            return words;
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static List<String> words(String line) {
        return Arrays.asList(line.trim().split("\\s+"));
    }
}
