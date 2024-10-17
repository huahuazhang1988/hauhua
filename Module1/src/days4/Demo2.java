package days4;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        HashSet<Student> set= new HashSet<>();
        Student s1 = new Student("huahua", 48);
        Student s2 = new Student("huahua2", 10);
        Student s3 = new Student("huahua", 8);
        set.add(s1);
        set.add(s2);
        set.add(s3);
      //  System.out.println(set);
        ArrayList<String> objects = new ArrayList<>();
        Collections.addAll(objects,"f","d","s","hello");
        System.out.println(objects);
        Collections.shuffle(objects);
        System.out.println(objects);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list);
        System.out.println(list);
    }
}
