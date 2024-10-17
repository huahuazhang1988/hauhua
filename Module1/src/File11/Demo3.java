package File11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws FileNotFoundException {
      FileInputStream file=  new FileInputStream(new File("C:\\Users\\huahu\\Desktop\\zeitfracht\\demo.docx"));
      int len=0;
      byte[] bytes= new byte[1024];
        while (true) {
            try {
                if ((len=file.read(bytes))!=-1) {
                    System.out.println(new String(bytes));
                };
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
