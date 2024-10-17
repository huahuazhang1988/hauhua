package File11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream os = new FileOutputStream(new File("C:\\Users\\huahu\\Desktop\\zeitfracht\\abc1.txt"),true);
       os.write("\r\n".getBytes());
        os.write("hello".getBytes());
        os.close();
    }
}
