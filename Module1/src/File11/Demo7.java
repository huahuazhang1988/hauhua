package File11;

import java.io.*;
import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("huhua",35));
        list.add(new Person("robi",39));
        list.add(new Person("lisa",5));
        list.add(new Person("fabi",12));
        ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("demo7.txt"));
        ob.writeObject(list);
        ob.close();
        ObjectInputStream ob1 = new ObjectInputStream(new FileInputStream("demo7.txt"));
        Object o = ob1.readObject();
        ArrayList<Person> list2=(ArrayList<Person>)o;
        System.out.println(list2);
        ob1.close();
    }
}
