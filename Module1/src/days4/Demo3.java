package days4;

import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        System.out.println(list);
        HashMap<String, String > map= new HashMap<>();
        map.put("lichen","fanbingbing");
        map.put("robert","huahua");
        map.put("lichen2","fanbingbing2");
        map.put("yangguo","xiaolongnv");
        System.out.println(map);
        String lichen = map.remove("lichen");
        System.out.println(lichen);
        System.out.println(map);
        System.out.println(map.containsKey("robert"));
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println("key :"+s);
        }
        Collection<String> values = map.values();
        Set<Map.Entry<String, String>> set1 = map.entrySet();
        for (Map.Entry<String, String> entry : set1) {
            System.out.println( entry.getKey()+"=>" +entry.getValue());
        }

    }
}
