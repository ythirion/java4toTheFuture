package tothefuture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMissmatch {

    public static void main(String[] args) throws IOException {
        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");

        Files.writeString(filePath1,"test");
        Files.writeString(filePath2,"test");

        long mismatch = Files.mismatch(filePath1, filePath2);

        System.out.println("file1 vs file2: " + mismatch);

        Files.writeString(filePath2,"test 2");

        long mismatch2 = Files.mismatch(filePath1, filePath2);

        System.out.println("file1 vs file2: " + mismatch2);
    }

}
