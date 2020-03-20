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

    public static String printWriter() {
        StringWriter sw = new StringWriter();
        try(PrintWriter pw = new PrintWriter(sw);) {
            pw.write("Hello, world!");
            return sw.toString();
        }
    }

    public static List<String> readWords(File file) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)) {
            List<String> words = new ArrayList<>();
            while (scanner.hasNext()) {
                words.addAll(words(scanner.nextLine()));
            }
            return words;
        }
    }

    private static List<String> words(String line) {
        return Arrays.asList(line.trim().split("\\s+"));
    }
}
