package tothefuture;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.lang.System.getProperty;

public class FilesWriteRead {

    public static void main(String[] args) throws IOException {
        String testString = "This is some s€cr€t info in plain t€xt, the b€st format for s€cr€cy";
        String tmpDir = getProperty("java.io.tmpdir");
        Path tmpFile = Path.of(tmpDir, "test.txt");

        Path path1 = Files.writeString(tmpFile, testString);

        System.out.println("\n>> New path after writing the string");
        System.out.println(path1);

        System.out.println("\n>> Now we'll read the content as string");
        System.out.println(Files.readString(path1));


        Path path2 = Files.writeString(tmpFile, testString, Charset.forName("ISO-8859-3"));

        System.out.println("\n>> New path after writing the string with charset");
        System.out.println(path2);

        String s = Files.readString(path2, Charset.forName("ISO-8859-3"));

        System.out.println("\n>> Now we'll read the content as string with charset");
        System.out.println(s);
    }

}
