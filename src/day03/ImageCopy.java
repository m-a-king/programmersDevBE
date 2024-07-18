package day03;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class ImageCopy {

    public static void main(String[] args) throws Exception {
        String imgUrl = "https://ssl.pstatic.net/static/newsstand/2024/0718/seouleconomy/101259/001.jpg";

        URL url = new URL(imgUrl);
        InputStream inputStream = url.openStream();

        FileOutputStream fileOutputStream = new FileOutputStream("src/day03/copyTest.jpg");

        byte[] buffer = new byte[10000];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, bytesRead);
        }
        inputStream.close();
        fileOutputStream.close();

        System.out.println("완료");
    }
}
