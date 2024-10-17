package File11;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo10 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("demo8.txt");
        ps.write(97);
        ps.println(97);
        ps.close();
    }
}
