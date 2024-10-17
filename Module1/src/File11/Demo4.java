package File11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args) throws IOException {
       loadMethod();


    }
    public static void storeMethod() throws IOException {
        Properties pro = new Properties();
        pro.setProperty("zhangsan","12");
        pro.setProperty("lisi","15");
        pro.setProperty("wangwu","24");
        pro.setProperty("robert","33");
        System.out.println(pro.getProperty("lisi"));
        Set<String> set = pro.stringPropertyNames();
        for (String s : set) {
            System.out.println(s+"   "+pro.getProperty(s));
        }
        FileOutputStream os= new FileOutputStream("demo2.txt");
        pro.store(os,"data");
        os.close();
    }
    public static void loadMethod() throws IOException {
        Properties pro = new Properties();
        pro.load(new FileInputStream("demo2.txt"));
        Set<String> set = pro.stringPropertyNames();
        for (String s : set) {
            System.out.println(s+"=>"+pro.getProperty(s));
        }
    }
}
