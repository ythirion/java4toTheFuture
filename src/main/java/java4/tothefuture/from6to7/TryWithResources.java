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
     */
    public static String printWriterOld() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        pw.write("Hello, world!");
        pw.close();
        return sw.toString();
    }

    /**
     * TODO: Do the same as {@link TryWithResources#printWriterOld()} but with try/resources.
     */
    public static String printWriterNew() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        pw.write("Hello, world!");
        pw.close();
        return sw.toString();
    }

    private static List<String> words(String line) {
        return Arrays.asList(line.trim().split("\\s+"));
    }

    /**
     * This function read the given file and extracts the words from it.
     */
    public static List<String> readWordsOld(File file) throws FileNotFoundException {
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

    /**
     * TODO: Do the same as {@link TryWithResources#readWordsOld(File)} but with try/resources.
     */
    public static List<String> readWordsNew(File file) throws FileNotFoundException {
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
}
