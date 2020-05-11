package tothefuture;

import java.net.URI;
import java.nio.file.Path;

import static java.lang.System.getProperty;
import static java.lang.System.out;

public class PathOf {

    public static void main(String[] args) {
        String tmpDir = getProperty("java.io.tmpdir");

        // Path of string

        Path path1 = Path.of(tmpDir, "test.txt");
        out.println(path1);

        // Path of URI

        String uriFullPath = "file://" + tmpDir + "/test.txt";
        Path path2 = Path.of(URI.create(uriFullPath));
        out.println(uriFullPath + " --> " + path2);
    }

}
