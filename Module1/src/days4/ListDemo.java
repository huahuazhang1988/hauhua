package days4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //get,remove,clear,size,add,set
   List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
        System.out.println(list);
        list.set(1,"Z");
        System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("=====================");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
