package day03;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamTest {

    public void readFromStream(InputStream inputStream) throws IOException {
        int n = 0;
        byte[] buf = new byte[6];
        while ((n = inputStream.read(buf)) != -1) {
            System.out.write(buf, 0, n);  // 실제 읽은 바이트만큼만 쓰기
            System.out.write('\n');
        }
    }

    public static void main(String[] args) throws IOException {
        InputStreamTest inputStreamTest = new InputStreamTest();
        inputStreamTest.readFromStream(System.in);
    }
}