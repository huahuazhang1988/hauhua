package File11;

import java.io.*;

public class Demo5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
     //   ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("demo6.txt"));
     //   ob.writeObject(new Person("huahua",18));
       // ob.close();
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("demo6.txt"));
        Object o = ob.readObject();
        ob.close();
        System.out.println((Person)o);


    }
}
