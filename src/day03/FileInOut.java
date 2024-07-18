package day03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileInOut {
    public static void main(String[] args) throws IOException {
        String fileName = "src/day03/InputStreamTest.java";

        FileInputStream fis = new FileInputStream(fileName);
        PrintStream ps = System.out;

        int n = 0;
        while ((n = fis.read()) != -1) {
            ps.write(n);
            ps.flush();
        }
        fis.close();
        ps.close();

    }
}
