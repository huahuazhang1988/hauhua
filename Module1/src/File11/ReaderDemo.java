package File11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
   // FileReader reader=    new FileReader("C:\\Users\\huahu\\Desktop\\zeitfracht\\abc1.txt");
   // int num=reader.read();
    //    System.out.println((char)num );
    //reader.close();
        FileWriter writer= new FileWriter("demo.txt",true);
       // char[] chars={'c','a','e','h'};
        writer.write("you are the luckiest");
        writer.flush();
        writer.close();
    }
}
